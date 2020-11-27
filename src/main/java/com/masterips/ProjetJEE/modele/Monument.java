package com.masterips.ProjetJEE.modele;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Table
@Entity
public class Monument {
	@Id
	@Column(name="codeM", length = 12)
	private String CodeM;
	
	@Column (name="nomM")
	private String nomM;
	
	@Column (name="proprietaire")
	private String proprietaire;
	
	@Column (name="typeMonument")
	private String typeMonument;
	
	@Column (name="longitude")
	private double longitude;
	
	@Column (name="latitude")
	private double latitude;
	@ManyToOne
	@JoinColumn
	private Lieu localiseDans;
	@ManyToMany
	private Set <Celebrite> associeC;
	
	
	
	public String getCodeM() {
		return CodeM;
	}
	public void setCodeM(String codeM) {
		CodeM = codeM;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getMonument() {
		return typeMonument;
	}
	public void setMonument(String monument) {
		typeMonument = monument;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	

	public Lieu getLocaliseDans() {
		return localiseDans;
	}
	public void setLocaliseDans(Lieu localiseDans) {
		this.localiseDans = localiseDans;
	}
	public Set<Celebrite> getAssocieC() {
		return associeC;
	}
	public void setAssocieC(Set<Celebrite> associeC) {
		this.associeC = associeC;
	}
	
	
}
