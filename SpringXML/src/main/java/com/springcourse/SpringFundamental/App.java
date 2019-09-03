package com.springcourse.SpringFundamental;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.Service.CustomerService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service=appContext.getBean("customerService",CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service);
        CustomerService service1=appContext.getBean("customerService",CustomerService.class);
        System.out.println(service1);
    }
}
