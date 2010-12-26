package com.colorcc.study.git.multiuser.helloworld;

public class HelloWorld {

	public void say(String str) {
		if (str == null) {
			System.out.println("Hello World!");
		} else {
			System.out.println("Hello, " + str);
		}
	}

	public void sayHello() {
		System.out.println("Hello World");
	}

	/**
	 * Add out put by jackqin
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.say(null);
		hw.say("Jack Qin!");
		hw.sayHello();
	}

}
