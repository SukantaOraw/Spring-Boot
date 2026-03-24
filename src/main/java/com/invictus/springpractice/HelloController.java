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
        Student student = context.getBean("student", Student.class);
        student.setName("Sukanta Oraw");
        student.setMajor("CSE");

        
        String result = student.getName() + " " + student.getMajor();

        context.close();

        return result;  

    }
}