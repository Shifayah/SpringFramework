package com.example.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
       AirConditioner ref= factory.getBean(AirConditioner.class);
       ref.config();
       AirCooler cool=factory.getBean(AirCooler.class);
       cool.airCoolerConfg();
    }
}
