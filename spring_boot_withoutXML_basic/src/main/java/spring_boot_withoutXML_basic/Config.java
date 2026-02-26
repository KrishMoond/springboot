package spring_boot_withoutXML_basic;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring_boot_withoutXML_basic")
public class Config {
	
	@Bean("scan1")
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean
	public List<String> i(){
//		ArrayList<String> arr= new ArrayList<>();
//		arr.add("A");
//		arr.add("B");
		return List.of("A","B","C");
	}
	
	@Bean
	public Map<String,String> m(){
		Map<String,String> map= new LinkedHashMap<>();
		map.put("a", "1");
		map.put("aa", "31");
		map.put("afa", "11");
		return map;
	}
}