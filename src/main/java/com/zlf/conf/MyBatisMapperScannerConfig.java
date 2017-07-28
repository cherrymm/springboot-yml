//package com.zlf.conf;
//
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//@Configuration
//@AutoConfigureAfter(MyBatisConfig.class)
//public class MyBatisMapperScannerConfig {
//	@Bean
//	public MapperScannerConfigurer mapperScannerConfigurer() {
//		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//		// 获取之前注入的beanName为sqlSessionFactory的对象
//		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//		// 指定mapper文件路径
//		mapperScannerConfigurer.setBasePackage("com.zlf.mapper");
//		return mapperScannerConfigurer;
//	}
//}
