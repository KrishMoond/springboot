package hibernate_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hibernate_spring.dao.EmployeeDao;
import hibernate_spring.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	public void InsertEmp(Employee e) {
		if (dao.find(e.getId()) == null) {
			dao.insertEmp(e);
		} else {
			System.out.println("Data Already exsist");
		}
	}
}
