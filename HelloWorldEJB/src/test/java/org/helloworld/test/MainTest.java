package org.helloworld.test;

import static org.junit.Assert.assertEquals;

import org.helloworld.ejb.HelloWorldBean;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

	HelloWorldBean helloWorldBean;
	
	@Before
	public void setUp() {
		helloWorldBean = new HelloWorldBean();
	}
	
	@Test
	public void test() {
		assertEquals("Hello Andriy!", helloWorldBean.sayHello("Andriy"));
	}
}
