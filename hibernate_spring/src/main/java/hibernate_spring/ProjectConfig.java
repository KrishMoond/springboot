package hibernate_spring;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "hibernate_spring")
public class ProjectConfig {
	
	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("postgres").createEntityManager();
	}
}
