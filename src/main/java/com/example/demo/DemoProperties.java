package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Immutable configuration properties showcase.
 *
 * @author Stephane Nicoll
 */
@ConfigurationProperties("demo")
public class DemoProperties {

	/**
	 * Name of the demo property. Some more insight as what that property does.
	 */
	private final String name;

	/**
	 * Da counter.
	 */
	private final int counter;

	public DemoProperties(String name, @DefaultValue("42") int counter) {
		this.name = name;
		this.counter = counter;
	}

	public String getName() {
		return this.name;
	}

	public int getCounter() {
		return this.counter;
	}

}
