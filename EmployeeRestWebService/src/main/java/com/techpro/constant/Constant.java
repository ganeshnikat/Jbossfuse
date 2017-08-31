package com.techpro.constant;

public class Constant {

	public static final String ADD_EMPLOYEE = "addEmployee";
	public static final String SHOW_EMPLOYEE = "showEmployees";
	public static final String OPERATION_NAME = "operationName";
	/*------Oracle Database Details START------*/
	public static final String DB_DRIVER_CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	public static final String DB_USERNAME = "NTT";
	public static final String DB_PASSWORD = "NTTDATA";
	/*------Oracle Database Details END------*/
	public static final String SELECT_ALL_EMPLOYEE_QUERY = "SELECT * FROM EMPLOYEE";
	public static final String ADD_EMPLOYEE_QUERY = "INSERT INTO EMPLOYEE (EMPLOYEE_ID, EMPLOYEE_NAME, CITY) VALUES(?,?,?)";
}
