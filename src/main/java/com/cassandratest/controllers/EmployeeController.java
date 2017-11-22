package com.cassandratest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cassandratest.interfaces.EmployeeDAO;
import com.cassandratest.pojos.Employee;

@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeDAO employeeDao;
    
    public EmployeeController() {
        System.out.println("EmployeeController()");
    }
         
    @RequestMapping(value = "/employee", method = RequestMethod.POST)    
    Employee create(@RequestBody Employee employee) {        
        return employeeDao.createEmployee(employee);
    }
 
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") int id) {
        employeeDao.deleteEmployee(id);
    }
 
    @RequestMapping(value="/employee", method = RequestMethod.GET)
    List<Employee> findAll() {
        return employeeDao.getAllEmployees();
    }
 
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    Employee findById(@PathVariable("id") int id) {        
        return employeeDao.getEmployee(id);
    }
 
    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    Employee update(@RequestBody Employee employee) {
        return employeeDao.updateEmployee(employee);
    }
}
