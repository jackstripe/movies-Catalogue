 package com.cesar.peliculasDB;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AlreadyAUserInterception extends AbstractInterceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	//Validar que ese usuario no esté creado
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		//this is really a test
		return null;
	}

}
