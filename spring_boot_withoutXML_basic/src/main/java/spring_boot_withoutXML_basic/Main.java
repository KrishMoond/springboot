package spring_boot_withoutXML_basic;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]) {

        ApplicationContext loc =
                new AnnotationConfigApplicationContext(Config.class);

//        Employee e = loc.getBean(Employee.class);
//
//        System.out.println(e);
//        System.out.println(e.getId());
//        System.out.println(e.getName());
//        System.out.println(e.getSal());
        
        Person p=loc.getBean(Person.class);
        System.out.println(p.getMob());
        
//        System.out.println(p.getS());s
        
        List<String> list = (List<String>) loc.getBean("i");    
        System.out.println(list);
        
        Map<String,String> map= loc.getBean("m",Map.class);
        System.out.println(map);
       
    }
    
}