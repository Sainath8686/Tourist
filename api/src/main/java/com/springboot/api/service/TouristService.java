package com.springboot.api.service;

import java.util.List;

import com.springboot.api.entity.Tourist;


public interface TouristService {
	
	
	public List<Tourist> getTourists();
	public boolean saveTouristInformation(Tourist tourist);

}
