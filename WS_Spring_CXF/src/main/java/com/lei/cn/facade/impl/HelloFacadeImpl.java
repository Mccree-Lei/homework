package com.lei.cn.facade.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.lei.cn.facade.HelloFacade;

@Component("hello")
@WebService
public class HelloFacadeImpl implements HelloFacade {

	public String hello(String name) {
		
		return "hello," + name;
	}

}
