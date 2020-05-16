package com.kishor.home.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ProductEnt {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String manufactorer;
}