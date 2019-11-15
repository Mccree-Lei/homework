package com.lei.cn.facade;

import javax.jws.WebService;

@WebService
public interface HelloFacade {
	
	public String hello(String name);
}
