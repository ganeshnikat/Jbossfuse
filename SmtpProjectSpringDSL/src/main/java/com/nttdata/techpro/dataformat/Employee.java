/**
 * 
 */
package com.nttdata.techpro.dataformat;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

/**
 * @author 100351
 *
 */
@CsvRecord(separator = ",", skipFirstLine = true)
public class Employee {

	@DataField(pos = 1)
	private  int empid;
	@DataField(pos = 2)
	private String name;
	@DataField(pos = 3)
	private String role;
	@DataField(pos = 4, pattern = "dd-MM-yyyy")
	private Date joiningdate;

}
