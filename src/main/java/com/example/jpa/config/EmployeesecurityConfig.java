package com.example.jpa.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class EmployeesecurityConfig {

//    @Bean
//    public InMemoryUserDetailsManager userdetailmanager() {
//
//        UserDetails saurabh = User.builder()
//                .username("snake")
//                .password("{noop}Snake@123")
//                .roles("EMPLOYEE")
//                .build();
//
//        UserDetails shreyank = User.builder()
//                .username("shreyank")
//                .password("{noop}Shreyank@123")
//                .roles("EMPLOYEE", "MANAGER")
//                .build();
//
//        UserDetails tejas = User.builder()
//                .username("tej")
//                .password("{noop}tejas@123")
//                .roles("EMPLOYEE", "MANAGER", "ADMIN")
//                .build();
//
//        UserDetails vedant = User.builder()
//                .username("vedu")
//                .password("{noop}Vedant@123")
//                .roles("EMPLOYEE", "MANAGER", "ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(saurabh, shreyank, tejas, vedant);
 //   }

	
	
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource datasource) {
		return new JdbcUserDetailsManager(datasource);
	}
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/employee").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/employee/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/sendemp").hasRole("MANAGER")
                      //  .requestMatchers(HttpMethod.POST, "/api/employee/**").hasRole("MANAGER")

                        .requestMatchers(HttpMethod.PUT, "/api/employee/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/employee/**").hasRole("ADMIN")
        );

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
