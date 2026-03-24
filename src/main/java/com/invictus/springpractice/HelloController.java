package com.invictus.springpractice;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        // ApplicationContext context = new ClassPathXmlApplicationContext("SpringPractice.xml"); 
        // ApllicationContext is an Interface thus cannot be closed
        // ClassPathXmlApplicationContext is a Class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringPractice.xml");
        Student student1 = (Student) context.getBean("student", Student.class);
        student1.setName("Sukanta Oraw");
        student1.setMajor("CSE");

        
        String result1 = student1.getName() + " " + student1.getMajor();

        Student student2 = (Student) context.getBean("student", Student.class);
        
        String result2 = student2.getName() + " " + student2.getMajor();


        context.close();

        String comp = "false";

        if (student1 == student2) {
            comp = "true";
        }

        String mainResult = "Are the two beans Result1 : " + result1 + " and Result2 : " + result2 + " referencing to the same object? " + comp;


        return mainResult;  

    }
}