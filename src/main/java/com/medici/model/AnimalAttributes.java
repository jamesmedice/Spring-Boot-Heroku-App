package com.medici.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_ATTR_ANIMAL", schema = "DBKINGDOM")
public class AnimalAttributes {

	@Id
	@Column(name = "ID_ANIMAL_ATTRIBUTES")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ID_ANIMAL")
	private Long idAnimal;

	private String name;

	private String description;
}