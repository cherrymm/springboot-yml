package com.zlf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zlf.mapper.CityMapper;
import com.zlf.model.City;

@Service
@Transactional
public class CityService {

	@Autowired CityMapper cityMapper;
	
	public List<City> queryCityList(){
		return cityMapper.queryCityList();
	}
}
