package com.example.demo.entity;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties
@JsonComponent
@Getter
@Setter

public class Problems {

	private Long id;
	private String problemName;
	private String problemDetails;
	
	
}
