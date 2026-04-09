package com.invictus.springpractice;

import java.util.Collection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringpracticeApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringPractice.xml");
		Student student1 = (Student) context.getBean("student", Student.class);			

		context.close();

		// Collection Injection
		// Output:
		// setSubjects called in Student class with value: [Maths, Science, English]

	}
}
