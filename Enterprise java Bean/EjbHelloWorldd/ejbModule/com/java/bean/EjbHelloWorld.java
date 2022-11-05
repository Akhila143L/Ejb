package com.java.bean;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EjbHelloWorld
 */
@Stateless
@Remote(EjbHelloWorldRemote.class)

public class EjbHelloWorld implements EjbHelloWorldRemote {

    /**
     * Default constructor. 
     */
    public EjbHelloWorld() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to EJB Programming";
	}

}
