package com.medici.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_OWNER_PET", schema = "DBKINGDOM")
public class OwnerPet {

	@Id
	@Column(name = "ID_OWNER_PET")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullName;

	private String phone;

	private String email;

	@JoinColumn(name = "ID_OWNER_PET", referencedColumnName = "ID_OWNER_PET")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Animal> animals;

}
