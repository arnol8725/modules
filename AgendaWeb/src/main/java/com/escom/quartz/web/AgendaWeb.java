package com.escom.quartz.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan("com.escom.quartz")
@EnableAutoConfiguration 
@EnableJpaRepositories(basePackages="com.escom.quartz") 
@EntityScan(basePackages="com.escom.quartz") 
public class AgendaWeb {
	
	public static void main( String[] args )
    {
    	SpringApplication.run(AgendaWeb.class, args);
        System.out.println( "Hello World!" );
    }
}
