package com.masterips.ProjetJEE.modele;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table
@Entity 
public class Lieu {
	@Id
	@Column (name="codeInsee", length = 12)
	private String codeInsee;
	
	@Column (name="nomCom")
	private String nomCom;
	
	@Column (name="longitude")
	private double longitude;
	
	@Column (name="latitude")
	private double latitude;
	
	@ManyToOne
	@JoinColumn
	private Departement lieu;
	
	
	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
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
	public Departement getLieu() {
		return lieu;
	}
	public void setLieu(Departement lieu) {
		this.lieu = lieu;
	}
	
	
	

}
