package io.github.dunwu.spring.core.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		System.out.println("现在开始初始化容器");

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring-beans.xml");
		System.out.println("容器初始化成功");

		Person person = factory.getBean("person", Person.class);
		System.out.println(person);

		System.out.println("现在开始关闭容器！");
		factory.registerShutdownHook();
	}

}
