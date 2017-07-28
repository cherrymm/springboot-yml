package com.zlf.model;

public class ExampleBean {
	private String string;
    public ExampleBean(String string) {
       this.string = string;
    }
    public void write() {
    	System.out.println("The text is: " + string);
    }
}
