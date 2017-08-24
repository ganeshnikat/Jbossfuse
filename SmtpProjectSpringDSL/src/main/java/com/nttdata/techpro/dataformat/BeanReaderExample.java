package com.nttdata.techpro.dataformat;

import java.io.File;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;

public class BeanReaderExample {
	public static void main(String[] args) throws Exception {
		StreamFactory factory = StreamFactory.newInstance();
		factory.load("D:\\MyFolder\\Tech-Pro\\fusegit\\Jbossfuse\\SmtpProjectSpringDSL\\src\\main\\resources\\mapping.xml");
		BeanReader in = factory.createReader("employeeFile", new File("D:\\MyFolder\\Tech-Pro\\fusegit\\Jbossfuse\\SmtpProjectSpringDSL\\src\\main\\resources\\data\\employee.csv"));
		Employee employee;
		System.out.println("**********Employee Data***********");
		while ((employee = (Employee) in.read()) != null) {
			System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeName()+" "+employee.getEmployeeJoiningDate());
		}
		in.close();
	}
}
