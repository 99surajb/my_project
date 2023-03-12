package com.example.demo.dto;

import java.io.Serializable;
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
public class PatientSingleDto implements Serializable {
	private Long patientid;
	private String name;
	private String lastname;
	private String phoneNo;
	private Date bornDate;
	private String gender;
	private City city;
	private String email;
	private int status;
	
	private List<ProblemDtoForPatientSingleDto> problems;
}
