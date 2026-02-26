package spring_boot_withoutXML_basic;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
//	public void msg() {
//		System.out.println("Hi");
//	}
	
//	@Autowired
	private Mobile mob;

	
	public Person(Mobile mob) {
//		super();
		this.mob = mob;
//		this.s = s;
	}
	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	
//	@Autowired
//	private Scanner s;
//
//	public Scanner getS() {
//		return s;
//	}
//
//	public void setS(Scanner s) {
//		this.s = s;
//	}
	
}
