package com.sample.demo.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/META-INF/spring/app-context.xml"})

public class EmployeeServiceTests {

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testSearchEmployees() {
		Criteria c = new Criteria();
		c.setDepts(Arrays.asList(10, 20, 30, 40));
		//c.setOpt("name");
		//c.setKeyword("Hong");
		c.setBeginDate("2005-01-01");
		//c.setMinSalary((long) 5000);
		
		List<Employee> result = employeeService.searchEmployees(c);
		assertEquals(5, result.size());
		
	}
}
