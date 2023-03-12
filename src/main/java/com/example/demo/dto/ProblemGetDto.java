package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.demo.entity.Patient;
import com.example.demo.entity.enums.ProblemStatus;
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
public class ProblemGetDto implements Serializable {
	private Long problemid;
	private String problemName;
	private String problemDetail;
	private ProblemStatus problemStatus;
	private Long pId;
	private Date creationDate;
	private int status;
	private PatientDtoForProblemGetDto patient;
}
