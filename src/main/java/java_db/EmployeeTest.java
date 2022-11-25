package java_db;

import org.hibernate.Session;

public class EmployeeTest {

    public static void readEmployee(Session session, int id){

        Employee emp = (Employee) session.load(java_db.Employee.class, id);
        System.out.println("Name: "+emp.getName());
    }
}
