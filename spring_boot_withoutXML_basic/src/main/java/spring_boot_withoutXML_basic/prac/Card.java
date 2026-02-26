package spring_boot_withoutXML_basic.prac;

import org.springframework.stereotype.Component;

@Component
public class Card implements Payment {
	@Override
	public void send() {
		System.out.println("Card");
	}
}
