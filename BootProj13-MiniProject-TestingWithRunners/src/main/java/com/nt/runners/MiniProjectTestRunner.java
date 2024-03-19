package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@Component
public class MiniProjectTestRunner implements CommandLineRunner {

	@Autowired
	private PayrollOperationsController control;
	@Override
	public void run(String... args) throws Exception {
		try {
		//	List<Employee> list=control.showEmployeeByDesgs("CLERK","MANAGER", "SALESMAN");
			List<Employee> list=control.showEmployeeByDesgs(args[0],args[1],args[2]);
			list.forEach(emp->{
				System.out.println(emp);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}

				
	}

}
