package com.tecsup.ws.client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.tecsup.ws.client.proxy.EmployeeResourceServiceStub;
import com.tecsup.ws.client.proxy.EmployeeResourceServiceStub.GetEmployeeRequest;
import com.tecsup.ws.client.proxy.EmployeeResourceServiceStub.GetEmployeeResponse;

public class ClientSOAP {
	public static void main(String[] args) {

		try {
			EmployeeResourceServiceStub stub = new EmployeeResourceServiceStub();
			GetEmployeeRequest request = new GetEmployeeRequest();
			request.setEmployeeId(100);
			GetEmployeeResponse response = stub.getEmployee(request);

			System.out.println(response.getEmployeeXSD().getFirstname());

		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
