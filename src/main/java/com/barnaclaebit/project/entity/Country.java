package com.barnaclaebit.project.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Country {

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    
}