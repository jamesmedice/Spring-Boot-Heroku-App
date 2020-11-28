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
@Table(name = "T_ANNOUNCEMENT_TYPE", schema = "DBKINGDOM")
public class AnnouncementType {

	@Id
	@Column(name = "ID_ANNOUNCEMENT_TYPE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descriptionType;

}
