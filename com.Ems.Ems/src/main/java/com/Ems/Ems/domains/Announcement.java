package com.Ems.Ems.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="announcement")

public class Announcement {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
	
@Column(name="title")	
private String title;

@Column(name="category ")	
private String category;

}
