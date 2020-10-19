package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public  static  void main(String args[]) {
        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
        Movie movieOne= (Movie)xmlBeanFactory.getBean("movieA");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
         Movie movieTwo=(Movie)applicationContext.getBean("movieB");
        System.out.println(movieOne.getActor());
        System.out.println(movieTwo.getActor());


    }
}