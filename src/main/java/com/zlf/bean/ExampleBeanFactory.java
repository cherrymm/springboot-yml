package com.zlf.bean;

import com.zlf.model.ExampleBean;

public class ExampleBeanFactory {
	public static ExampleBean createZlfBean(String name) {
	    return new ExampleBean(name);
	}

}
