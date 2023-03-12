package com.example.demo.entity;

import java.beans.JavaBean;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.management.MXBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.springframework.boot.jackson.JsonComponent;

import com.example.demo.entity.enums.City;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "aapatient")
@JsonIgnoreProperties

@Getter
@Setter

public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_PATIENT_SEQ")
	@SequenceGenerator(sequenceName = "AA_PATIENT_SEQ", allocationSize = 1, name = "AA_PATIENT_SEQ")
	@Column(name = "patientid")
	private Long patientid;
	private String name;
	private String lastname;
	private String phoneNo;
	private Date bornDate;
	private String gender;
	@JsonIgnoreProperties
	
	@Enumerated(EnumType.ORDINAL)
	private City city;
	@Column(name = "email", unique = true)
	private String email;	
	
	@Column(name = "status")
	public int status;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Problem> problems;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Admission> admissions;


	public Patient(String name, String lastname,Date bornDate, String gender, String age, City city, String email, int status) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.bornDate = bornDate;
		this.gender = gender;
		this.city = city;
		this.email = email;
		this.status = status;
	}
	public Patient(String name, String lastname, String gender,  City city, String email, int status) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.city = city;
		this.email = email;
		this.status = status;
	}
	
	
}
