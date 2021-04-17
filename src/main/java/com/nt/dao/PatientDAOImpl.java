package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.nt.bo.PatientBO;

public class PatientDAOImpl implements IPatientDAO{
	private static final String PATIENT_INSERT_QUERY = "insert into CORONA_PATIENT values(CORONA_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
	private DataSource ds;
	
	public PatientDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(PatientBO bo)  throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count=0;
		
		try {
			//get con obj from connection pool
			con = ds.getConnection();
			//create PreparedStmt obj
			ps = con.prepareStatement(PATIENT_INSERT_QUERY);
			//set query param values
			ps.setString(1, bo.getName());
			ps.setString(2, bo.getAddress());
			ps.setString(3, bo.getMob());
			ps.setFloat(4, bo.getAmount());
			ps.setInt(5, bo.getDaysCount());
			ps.setFloat(6, bo.getBill());
			ps.setFloat(7, bo.getDiscount());
			ps.setFloat(8, bo.getNetBill());
			//execute the query
			count = ps.executeUpdate();
			System.out.println(count + " rows updated");
		}
		catch(SQLException se) {
			System.out.println("ERROR::"+se.getMessage());
			throw se; //rethrowing
		}
		catch(Exception e) {
			System.out.println("ERROR::"+e.getMessage());
			throw e; //rethrowing
		}
		finally {
			//close PS
			try {
				ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
			//close Con
			try {
				con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}//finally
		
		return count;
	}
	
}
