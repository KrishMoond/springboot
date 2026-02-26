package hibernate_spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hibernate_spring.ProjectConfig;

public class Main {
	public static void main(String args[]) {
		ApplicationContext loc =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
		
//		Employee e1=loc.getBean(Employee.class);
//		
//		Employee e2=loc.getBean(Employee.class);
//		
//		e1.setName("Miller");
////		e2.setName("Miller");
//		
//		System.out.println(e1==e2);
		
		AnnotationConfigApplicationContext ac= (AnnotationConfigApplicationContext)loc;
		ac.close();
		
	}
}
