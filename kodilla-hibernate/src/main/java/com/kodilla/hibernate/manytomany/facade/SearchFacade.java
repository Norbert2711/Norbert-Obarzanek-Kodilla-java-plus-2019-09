package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    //Company and Employee

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> companyList(String companyName) {
        return companyDao.findCompanyByName(companyName);
    }

    public List<Employee> employeeList(String employeeName) {
        return employeeDao.searchForEmployeeName(employeeName);
    }

}
