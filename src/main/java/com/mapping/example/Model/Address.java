package com.mapping.example.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sector;
	private String city;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="e_id")
	private Employe employe;

	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	
}
