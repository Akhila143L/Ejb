package com.java.bean;

import javax.ejb.Remote;

@Remote
public interface EjbHelloWorldRemote {
String sayHello();
}
