package com.Ems.Ems.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="course")
public class Course {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column(name="name")
private String Name;
@Column(name="catagory")
private long Catagory;





}

