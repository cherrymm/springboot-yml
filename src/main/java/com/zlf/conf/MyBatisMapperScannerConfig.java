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
//		// ��ȡ֮ǰע���beanNameΪsqlSessionFactory�Ķ���
//		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//		// ָ��mapper�ļ�·��
//		mapperScannerConfigurer.setBasePackage("com.zlf.mapper");
//		return mapperScannerConfigurer;
//	}
//}
