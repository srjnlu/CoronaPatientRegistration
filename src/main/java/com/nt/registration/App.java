package com.nt.registration;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter mobNo: ");
        String mob = sc.next();
        System.out.println("Enter no of days hospitalized: ");
        String daysCount = sc.next();
        System.out.println("Enter bill amount per day: ");
        String amount = sc.next();
        
        PatientVO vo = new PatientVO();
        vo.setName(name);
        vo.setAddress(address);
        vo.setMob(mob);
        vo.setDaysCount(daysCount);
        vo.setAmount(amount);
        
        //IOC container
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        
        //get controller
        MainController controller = (MainController) factory.getBean("controller");
        try {
            if(controller.registerPatient(vo))
            	System.out.println("Corona Patient registered");
            else
            	System.out.println("Error: Registration failed. Contact Modi ji");
        }
        catch(Exception e) {
        	System.out.println("Error::"+e.getMessage());
        }
    }
}
