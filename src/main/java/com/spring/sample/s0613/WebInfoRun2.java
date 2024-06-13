package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebInfoRun2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/webinfo2.xml");
		
		WebInfoVO2 vo = (WebInfoVO2) ctx.getBean("info");
		
		System.out.println("생성자로 값을 주입후 Getter로 읽어오기");
		System.out.println("driver :"+vo.getDriver());
		System.out.println("url :"+vo.getUrl());
		System.out.println("user :"+vo.getUser());
		System.out.println("password :"+vo.getPassword());
		
		ctx.close();
	}
}
