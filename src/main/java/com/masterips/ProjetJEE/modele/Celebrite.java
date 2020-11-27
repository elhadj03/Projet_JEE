package com.masterips.ProjetJEE.modele;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table
@Entity 
public class Celebrite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="numCelebrite")
	private double numCelebrite;
	@Column (name ="nom")
	private String nom;
	@Column (name ="prenom")
	private String prenom;
	@Column (name ="nationalite")
	private String nationalite;
	@Column (name ="epoque")
	private String epoque;
	
	
	
	public double getNumCelebrite() {
		return numCelebrite;
	}
	public void setNumCelebrite(double numCelebrite) {
		this.numCelebrite = numCelebrite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getEpoque() {
		return epoque;
	}
	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}
	
	
}
