//package net.ddr.config.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//	
//	@Override  
//    public void configure(HttpSecurity http) throws Exception {  
//        http  
//            .authorizeRequests()  
//            .anyRequest().hasRole("USER")
//            .and()
//            .formLogin()
//            .and()
//            .logout()
//            .and()
//            .httpBasic();  
//    }
//	
//	@Override  
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
//        auth.inMemoryAuthentication()  
//            .withUser("ddr")  
//            .password("{noop}ddr") // Spring Security 5 requires specifying the password storage format  
//            .roles("USER");  
//    }
//	
//	
//
//}
