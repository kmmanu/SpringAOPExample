package org.manu.core;

import org.manu.customer.bo.CustomerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
        //customer.addCustomer();

        //customer.addCustomerReturnValue();

        //customer.addCustomerThrowException();

        String name = customer.addCustomerAround("Biju");
        System.out.println("Name = " + name);


    }
}