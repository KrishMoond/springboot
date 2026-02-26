package spring_boot_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String args[]) {
		ApplicationContext loc=new ClassPathXmlApplicationContext("config.xml");
		Person person=loc.getBean("person", Person.class);
		System.out.println(person);
		person.message();
		
		Employee e=loc.getBean("e",Employee.class);
		System.out.println(e);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
	}
}
