package spring_boot_withoutXML_basic.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import spring_boot_withoutXML_basic.Config;

@Component
public class User {
	@Autowired
	private Payment p;
	
	public void dis() {
		p.send();
	}
	
	public static void main(String args[]) {
		
		ApplicationContext loc =
                new AnnotationConfigApplicationContext(Config.class);
		
		User u=loc.getBean(User.class);
		System.out.println(u);
//		System.out.println(u.dis());
	}
}
