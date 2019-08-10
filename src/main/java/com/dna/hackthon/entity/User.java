package com.dna.hackthon.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dna_user")
public class User {
	private long id;
	private String name;
	private String email;
	private long phonenumber;
	private String adress;

}
