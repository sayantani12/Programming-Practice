package com.java.main;

public class StaticExample {
	static {
        System.out.println("This is in static block");
    }

    public StaticExample(){
        System.out.println("This is in constructor");
    }

    

    public static void main(String[] args){
        StaticExample ex = new StaticExample();
        StaticExample.staticMethod();
    }

    static {
        staticMethod();
        System.out.println("This is in static method in static block");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    
}    

