package com.codenotfound.endpoint;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codenotfound.client.HelloWorldClient;

@Configuration
public class EndpointConfig {
	
	 @Autowired
	  private Bus bus;
	 
	/* @Autowired
	 private HelloWorldClient helloWorldClient;
*/
	  @Bean
	  public Endpoint endpoint() {
	    EndpointImpl endpoint =
	        new EndpointImpl(bus, new HelloWorldImpl());
	   // endpoint.setWsdlLocation("/src/main/resources/wsdl/helloworld.wsdl");
	    //endpoint.setServiceName("helloworld");
	    endpoint.publish("/helloworld");

	    return endpoint;
	  }

}
