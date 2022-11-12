package com.springboot.api.repository;


import org.springframework.data.repository.CrudRepository;

import com.springboot.api.entity.Tourist;

public interface TouristRepository extends CrudRepository<Tourist,Integer>{

}
