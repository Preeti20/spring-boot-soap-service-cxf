package com.codenotfound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codenotfound.client.HelloWorldClient;

@SpringBootApplication
public class SpringBootSoapServiceCxfApplication {
	
/*	@Autowired
	  private static HelloWorldClient helloWorldClient;*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapServiceCxfApplication.class, args);
		/*String res = helloWorldClient.sayHello("John", "Doe");
		System.out.println("res:"+res);*/
	}

}

