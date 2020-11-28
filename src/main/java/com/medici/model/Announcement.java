package com.medici.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_ANNOUNCEMENT", schema = "DBKINGDOM")
public class Announcement {

	@Id
	@Column(name = "ID_ANNOUNCEMENT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date announceDate;

	private Date availableDate;

	private String description;

	@Column(name = "ID_ANIMAL", nullable = true)
	private Long idAnimal;

	@Column(name = "ID_ANNOUNCEMENT_TYPE")
	private Long idAnnouncementType;

	@JoinColumn(name = "ID_ANNOUNCEMENT_TYPE", referencedColumnName = "ID_ANNOUNCEMENT_TYPE", insertable = false, updatable = false)
	@OneToOne(fetch = FetchType.EAGER)
	private AnnouncementType announcementType;

}
