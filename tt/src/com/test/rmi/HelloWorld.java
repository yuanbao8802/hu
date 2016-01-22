package com.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote{

	public String sayHello() throws RemoteException ;
}
