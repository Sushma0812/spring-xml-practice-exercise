package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public  static  void main(String args[]) {
    	Resource r=new ClassPathResource("BeanFile.xml");
    	BeanFactory factory =new XmlBeanFactory(r);
    	Movie movieOne = (Movie)factory.getBean("movieA");
    	Movie movieTwo = (Movie)factory.getBean("movieB");
    	System.out.println(movieOne.getActor());   
    	System.out.println(movieTwo.getActor()); 
    }
        
}

    