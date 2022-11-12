package com.springboot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.springboot.api.entity.Tourist;
import com.springboot.api.service.TouristService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tourists")
public class TouristContrller {
	
	@Autowired
    TouristService service;
	
	@PostMapping("save")
    public boolean createTourist(@RequestBody Tourist tourist){
        service.saveTouristInformation(tourist);
        return true;
    }
	
	 @GetMapping("tourists")
	   	public MappingJacksonValue getListOfTourists() {
	   		List<Tourist> tourists = service.getTourists() ;
	   		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");

	   		FilterProvider filters = new SimpleFilterProvider().addFilter("TouristFilter", filter);

	   		MappingJacksonValue mapping = new MappingJacksonValue(tourists);

	   		mapping.setFilters(filters);

	   		return mapping;
	   	}

}
