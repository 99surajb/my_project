package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.demo.entity.Patient;
import com.example.demo.entity.Problem;
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
public class ProblemDto implements Serializable {

	private String problemName;
	private String problemDetail;
	private ProblemStatus problemStatus;
	private Long pId;
	private int status;
	private Date creationDate;
}
