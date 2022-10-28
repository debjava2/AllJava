package com.kkjavatutorials.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kk.model.Employee;



public class App 
{
	public static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
       Employee employee = new Employee();
       employee.setId(17883);
       employee.setName("Sean");
       	logger.debug("hello World");
       	logger.info("Hello, world");
       System.out.println(employee.getId()+"\t"+employee.getName());
    }
}