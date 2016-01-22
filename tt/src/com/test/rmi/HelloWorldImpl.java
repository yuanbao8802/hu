package com.test.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject  implements HelloWorld{

	protected HelloWorldImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	public String sayHello() throws RemoteException {
		System.out.println("�ұ�������");
		return "hello rmi... ";
	}

}
