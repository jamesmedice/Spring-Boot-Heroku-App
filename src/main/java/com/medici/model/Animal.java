package com.medici.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_ANIMAL", schema = "DBKINGDOM")
public class Animal {

	@Id
	@Column(name = "ID_ANIMAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;

	private String race;

	private String description;

	private String region;

	private String province;

	private String city;

	private Date birthDate;

	private Boolean privateOwner;

	private Boolean dogHouse;

	private Boolean breeding;

	private BigDecimal price;

	private Boolean pedigree;

	private String pedigreeDetails;

	@JoinColumn(name = "ID_ANIMAL", referencedColumnName = "ID_ANIMAL", nullable = true, insertable = false, updatable = false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<AnimalAttributes> additionalProperties;

	@Column(name = "ID_OWNER_PET")
	private Long idOwner;

	@JoinColumn(name = "ID_OWNER_PET", referencedColumnName = "ID_OWNER_PET", insertable = false, updatable = false)
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private OwnerPet ownerPet;

	@JoinColumn(name = "ID_ANIMAL", referencedColumnName = "ID_ANIMAL", insertable = false, updatable = false)
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Announcement announcement;

}
