package garbagecollector;

import java.util.Date;

public class RuntimeDemo {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime(); // java.lang;

		System.out.println("total memory =" + runtime.totalMemory());
		System.out.println("free memory =" + runtime.freeMemory());

		for (int i = 0; i < 1000; i++) {

			Date date = new Date();
			date = null;
		}
		System.out.println("after 1000 obj created free memory =" + runtime.freeMemory());
		runtime.gc();
		System.out.println("after gc runs =" + runtime.freeMemory());
	}
}
/*
 * 1)--System.gc() ---> it is static method so call by class name
 * 
 * 2)--r.gc() ----> it is instance method so call by object
 * 
 */