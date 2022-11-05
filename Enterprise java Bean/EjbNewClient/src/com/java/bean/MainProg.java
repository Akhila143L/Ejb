package com.java.bean;

import javax.naming.InitialContext;

public class MainProg {

	 public static void main(String[] a) throws Exception {
		    EjbHelloWorldRemote service = null;

		    // Context compEnv = (Context) new InitialContext().lookup("java:comp/env");

		    // service = (HelloService)new
		    // InitialContext().lookup("java:comp/env/ejb/HelloService");
		    service = (EjbHelloWorldRemote) new InitialContext().lookup("HelloWorld/remote");

		    System.out.println(service.sayHello());
		  }
}
