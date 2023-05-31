package com.joalvarez.springsecurity.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "samples")
public class Sample {

	@Id
	private int id;
}