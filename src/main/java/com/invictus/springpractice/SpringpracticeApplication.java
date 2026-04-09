package com.invictus.springpractice;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// import tools.jackson.databind.ser.jdk.JDKKeySerializers.Default;

// import tools.jackson.databind.ser.jdk.JDKKeySerializers.Default;

@SpringBootApplication
public class SpringpracticeApplication {

	public static void main(String[] args) {

		// SpringApplication.run(SpringpracticeApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringPractice.xml");
		Student student1 = (Student) context.getBean("student", Student.class);			

		context.close();

		// Output: Constructor Injection using name of variable
		// Laptop object setter called in Student class : Sukanta CSE
		// com.invictus.springpractice.Laptop@2eea88a1


	}
}
