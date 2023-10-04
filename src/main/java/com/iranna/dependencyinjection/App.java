package com.iranna.dependencyinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      Student student1 = (Student) context.getBean("student1");
      Student student2 = (Student) context.getBean("student2");
      //CI with primitives and String values
      System.out.println(student1);
      System.out.println(student2);
      System.out.println("---------------------");
      //
      //CI with dependent object
      Employee employee1 = (Employee) context.getBean("employee1");
      System.out.println(employee1);
      System.out.println("---------------------");
      
      //CI with collections
      Question question1 = (Question) context.getBean("question1"); 
      question1.displayInfo();
      System.out.println("---------------------");
      
      //CI with collections of objects
      Questions questions = (Questions) context.getBean("questions1");
      System.out.println(questions);
      
      
	}

}
