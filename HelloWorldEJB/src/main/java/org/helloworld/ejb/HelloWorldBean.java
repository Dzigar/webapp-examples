package org.helloworld.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorld {

	/**
	 * Default constructor.
	 */
	public HelloWorldBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

}
