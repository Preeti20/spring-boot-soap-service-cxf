package com.codenotfound;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.codenotfound.client.HelloWorldClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootSoapServiceCxfApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	  private HelloWorldClient helloWorldClient;

	  @Test
	  public void testSayHello() {
	    assertThat(helloWorldClient.sayHello("John", "Doe"))
	        .isEqualTo("Hello John Doe!");
	  }

}

