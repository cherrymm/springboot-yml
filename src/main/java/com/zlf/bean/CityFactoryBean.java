package com.zlf.bean;

import org.springframework.beans.factory.FactoryBean;

import com.zlf.model.City;

public class CityFactoryBean implements FactoryBean<City>{
	private String cityInfo;
	
	@Override
	public City getObject() throws Exception {
//		City city = new City();
		
		return null;
	}

	@Override
	public Class<City> getObjectType() {
		return City.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
