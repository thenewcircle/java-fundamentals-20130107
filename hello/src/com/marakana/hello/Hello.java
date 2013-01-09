package com.marakana.hello;
/**
 * Hello is a class that greets people
 * @author Dan Rosen
 * @since 1.0
 */
public class Hello {

	/**
	 * main is the "entry point" method that the JVM executes
	 * @param args the command line arguments passed into java
	 */
	public static void main(String[] args) {
		if (args.length != 0) {
			for (String name : args) {
				System.out.println("Hello, " + name);
			}
		} else {
			System.out.println("Hello, Nobody!");
		}
	}

}
