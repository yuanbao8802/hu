package com.test.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class TestRMI {

	public static void main(String[] args) throws MalformedURLException, RemoteException, AlreadyBoundException, InterruptedException {
		HelloWorld service = new HelloWorldImpl();
		
		LocateRegistry.createRegistry(8888); 
		
		Naming.bind("rmi://192.168.1.20:8888/hello", service);
		
		System.out.println("start...");
		
		Thread.sleep(100000);
	}
}
