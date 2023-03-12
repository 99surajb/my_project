package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.demo.entity.enums.City;
import com.example.demo.entity.enums.Department;
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
public class StaffDto implements Serializable {
	
	private Long staffid;
	private String staffname;
	private String stafflastname;
	private String gender;
	private String email;
	private City city;
	private Department department;
    private Date bornDate;
}
