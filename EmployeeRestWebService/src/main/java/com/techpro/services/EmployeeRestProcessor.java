package com.techpro.services;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techpro.constant.Constant;
import com.techpro.model.Employee;

public class EmployeeRestProcessor implements Processor {

	JdbcTemplate jdbcTemplate = getJdbcTemplateConnection();

	@Override
	public void process(Exchange exchange) throws Exception {
		String operationName = (String) exchange.getIn().getHeader(Constant.OPERATION_NAME);
		if (Constant.ADD_EMPLOYEE.equals(operationName)) {
			Employee myEmployee = exchange.getIn().getBody(Employee.class);
			addEmployee(myEmployee);
			List<Map<String, Object>> employeeList = getAllEmplpoyees();
			exchange.getOut().setBody(employeeList, List.class);
		} else if (Constant.SHOW_EMPLOYEE.equals(operationName)) {
			exchange.getOut().setBody(getAllEmplpoyees(), List.class);
		}
	}

	private  List<Map<String, Object>> getAllEmplpoyees() {
		jdbcTemplate = getJdbcTemplateConnection();
		List<Map<String, Object>> emp = jdbcTemplate.queryForList(Constant.SELECT_ALL_EMPLOYEE_QUERY);
		return emp;
	}

	public int addEmployee(Employee employee) {
		jdbcTemplate = getJdbcTemplateConnection();
		int Count = jdbcTemplate.update(Constant.ADD_EMPLOYEE_QUERY,
				new Object[] { employee.getEmployeeId(), employee.getEmployeeName(), employee.getEmployeeAddress() });
		return Count;
	}
    
	public static JdbcTemplate getJdbcTemplateConnection() {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(Constant.DB_DRIVER_CLASS_NAME);
		datasource.setUrl(Constant.DB_URL);
		datasource.setUsername(Constant.DB_USERNAME);
		datasource.setPassword(Constant.DB_PASSWORD);
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(datasource);
		return jdbcTemplate;
	}
	
	public  int checkDuplicateEmployee(Employee employee){
		int i=0;
		List<Map<String, Object>> allEmp=getAllEmplpoyees();
		List<Employee> emp=null;
		for (Map<String, Object> map : allEmp) {
			
		 System.out.println(allEmp);
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee(100351, "Ganesh", "Dange Chowk");
		EmployeeRestProcessor empRest=new EmployeeRestProcessor();
		int a=empRest.checkDuplicateEmployee(emp);
		System.out.println("Inserted Employee Count"+a);
		
	}
}
