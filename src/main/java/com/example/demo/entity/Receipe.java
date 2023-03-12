package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.boot.jackson.JsonComponent;

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
@Entity
@Getter
@Setter
@Table(name="aareceipe")
@JsonComponent

@JsonIgnoreProperties
public class Receipe {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_PATIENT_SEQ")
    @SequenceGenerator(sequenceName = "AA_PATIENT_SEQ", allocationSize = 1, name = "AA_PATIENT_SEQ")
	@Column(name = "receipeid")
	private Long receipeid;
	
	private String detail;
	private String barcode;
	private String drug_detail;
	private String usage;
	private String delivery_date;
	private Long problemid;
	private Long patientid;
	private int status;
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id")
    private Problem problem;
	
}
