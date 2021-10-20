package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        Student student = (Student) context.getBean("student1");
//        System.out.println(student.toString());
//
//        Customer customer = (Customer) context.getBean("customer1");
//        System.out.println(customer.toString());
//
//        Calculator calculator = (Calculator) context.getBean("calculator1");
//        calculator.addNumber();

        // Bean life cycle
        Employee employee = (Employee) context.getBean("employee1");
        System.out.println(employee.toString());
    }
}
