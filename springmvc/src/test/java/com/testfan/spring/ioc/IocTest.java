package com.testfan.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml","zhangsan.xml");
		//byname/id
		User user = (User) context.getBean("user");
		System.out.println("user="+user);
		//bytype
		User user2 = context.getBean(User.class);
		System.out.println("user2="+user2);
//		User user2 = (User) context.getBean("user");
		
		//地址
		System.out.println(user==user2);
		
		//值
		System.out.println(user.equals(user2));
		
		//对象关联
		System.out.println(user.getCar());
		
        //List
		System.out.println(user.getCarList());
		
		 //set
		System.out.println(user.getSetlist());
		
		//map
		System.out.println(user.getMap());
		
		Car car = (Car) context.getBean("cartest");
		System.out.println("00000000"+ car.getUser2());
	}

}
