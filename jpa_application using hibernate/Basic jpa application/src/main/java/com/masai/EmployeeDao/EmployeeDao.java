package com.masai.EmployeeDao;

import com.masai.entities.Employee;

public interface EmployeeDao {

	public void save(Employee employee);

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

}
