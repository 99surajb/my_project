package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.enums.City;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@JsonIgnoreProperties
public class ReceipeDto {
	private Long receipeid;
	
	private String detail;
	private String barcode;
	private String drug_detail;
	private String usage;
	private String delivery_date;
	private int status;
	private Long patientid;
	private Long problemid;
}
