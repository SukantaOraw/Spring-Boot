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

		// Properties are now set on the bean after it's retrieved from the context
		student1.setName("Sukanta");
		student1.setMajor("Computer Science");
		// Access the injected Laptop object and set its brand
		student1.getLaptop().setBrand("Asus");		

		context.close();

		// Output: using 1st XML -> (using nested beans)
		// Laptop Brand setter called in Laptop class with value: Default Laptop Brand from Inner Bean
		// Laptop object setter called in Student class
		// Name setter called with value: Sukanta
		// Major setter called with value: Computer Science
		// Laptop Brand setter called in Laptop class with value: Asus

		// Output: using 2nd XML -> (using ref)
		// Laptop Brand setter called in Laptop class with value: Default Laptop Brand
		// Name setter called with value: Default Student Name
		// Major setter called with value: Default Student Major
		// Laptop object setter called in Student class
		// Name setter called with value: Sukanta
		// Major setter called with value: Computer Science
		// Laptop Brand setter called in Laptop class with value: Asus
	}
}
