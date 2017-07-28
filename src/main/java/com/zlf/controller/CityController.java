package com.zlf.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zlf.bean.MyTestBean;
import com.zlf.service.CityService;

@Controller
@RequestMapping("/city")
public class CityController {
	@Autowired
	private CityService cityService;
	
	

//	@RequestMapping("/queryCityList")
//	@ResponseBody
//	public List<City> queryCityList() {
//		List<City> cityList = cityService.queryCityList();
//		return cityList;
//	}
	
	
	@RequestMapping("/test")
	public void test(){
		System.out.println("asdsssssss");
	}
	
//	@Bean
//	public FileUtil getFileUtil(){
//		return new FileUtil();
//	}
	
//	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("context.xml");  
//	    BeanFactory factory=new DefaultListableBeanFactory();  
//	    BeanDefinitionReader bdr=new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);  
//	    bdr.loadBeanDefinitions(resource);  
//	    
//
//	    ExampleBean city=(ExampleBean)factory.getBean("zlfBean",new Object[]{"bla bla"});
//	    city.write();
//	}

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beantest.xml"));
		MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
		System.out.println(bean.getStr());
		
	}
}
