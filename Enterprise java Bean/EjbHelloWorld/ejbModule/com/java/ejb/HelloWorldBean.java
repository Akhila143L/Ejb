package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@Remote(HelloWorldBeanRemote.class)
public class HelloWorldBean implements HelloWorldBeanRemote {
    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
    }
    @Override
    public String sayHello(){
        // TODO Auto-generated constructor stub
return "Welcome to EJB Programming...";
    }
}
