package com.securityPractice.SpringSecurityDBConnection.Security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity  //Ye annotation use krne ke baad ab hum seedha service class me seedha method ke upar @PreAuthorize annotation use krke rolebased autorization apply kr sakte h, pehle security config me changes krne padte the
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder encode() {  //It is used to encrypt the password.
		return new BCryptPasswordEncoder();   
	}
	
	
	@Bean
	public SecurityFilterChain filter(HttpSecurity http) throws Exception {
		return http.csrf(csrf->csrf.disable())
				   .authorizeHttpRequests(auth->auth
				   .requestMatchers("/create").permitAll()
				   .requestMatchers("/public/**").permitAll()
				   .requestMatchers("/admin/**").hasRole("ADMIN")  //("/admin/**") this represents admin/anything that can be an endpoint
				   //.requestMatchers("/find-all").hasRole("ADMIN")    //We can do like this for find-all the rows in the table but we have given /admin/** sp we can change the end point in the controller to /admin/all so that no need to create another requestMatcher.
				   .anyRequest().authenticated())
				   .httpBasic(Customizer.withDefaults()).build();
	}

}
