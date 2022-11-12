package com.springboot.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.entity.Tourist;
import com.springboot.api.repository.TouristRepository;


@Service
public class TouristServiceImpl implements TouristService {
	
	@Autowired
	  public TouristRepository touristRepository;
	
	@Override
	public boolean saveTouristInformation(Tourist tourist) {
		// TODO Auto-generated method 
		touristRepository.save(tourist);
        return true;
	}

    @Override
    public List<Tourist> getTourists() {
        return (List<Tourist>) touristRepository.findAll();
    }


}
