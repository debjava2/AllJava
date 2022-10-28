package com.springboot.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity(name="area")
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_area")
	private Long idArea;
	@Column(name="area_name")
	private String areaName;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "area")
	private User user;
}
