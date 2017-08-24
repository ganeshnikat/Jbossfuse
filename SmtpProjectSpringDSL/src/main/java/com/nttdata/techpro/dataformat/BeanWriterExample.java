package com.nttdata.techpro.dataformat;

import org.beanio.*;
import java.io.*;
import java.util.*;

public class BeanWriterExample {
	public static void main(String[] args) throws Exception {
		StreamFactory factory = StreamFactory.newInstance();
		factory.load(
				"D:\\MyFolder\\Tech-Pro\\fusegit\\Jbossfuse\\SmtpProjectSpringDSL\\src\\main\\resources\\mapping.xml");
		Employee employee = new Employee();
		employee.setEmployeeId(100351);
		employee.setEmployeeName("Ganesh");
		employee.setEmployeeJoiningDate(new Date());
		BeanWriter out = factory.createWriter("employeeFile", new File(
				"D:\\MyFolder\\Tech-Pro\\fusegit\\Jbossfuse\\SmtpProjectSpringDSL\\src\\main\\resources\\data\\employee.csv"));
		out.write(employee);
		out.flush();
		out.close();
	}
}
