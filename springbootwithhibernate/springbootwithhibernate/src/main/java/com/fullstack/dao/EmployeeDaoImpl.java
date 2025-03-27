package com.fullstack.dao;

import com.fullstack.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.sun.tools.attach.VirtualMachine.list;

@Component

public class EmployeeDaoImpl implements IEmployeeDao{
    private static SessionFactory sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void signup(Employee employee) {
        Session session= factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();

    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {
        boolean flag= false;
        for(Employee employee:findAll()){
            if(employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
                flag= true;
                break;
            }
        }

        return flag;
    }

    @Override
    public Employee findById(int empId) {
        Session session = factory.openSession();
        return (Employee)session.get(Employee.class,empId);

        return null;
    }

    @Override
    public List<Employee> findAll() {
       
        return List.of();
    }

    @Override
    public void update(int empId, Employee employee) {

    }

    @Override
    public void deleteById(int empId) {

    }

    @Override
    public void deleteAll() {

    }
}



