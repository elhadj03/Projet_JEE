package com.masterips.ProjetJEE.modele;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table
@Entity

public class Departement {
	@Id
	@Column(name = "dep", length = 4)
	private String dep;
	
	@Column (name="nomDep")
	private String nomDep;
	
	@OneToOne
	@JoinColumn
	private Lieu cheflieu;
	
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	
	public Lieu getCheflieu() {
		return cheflieu;
	}
	public void setCheflieu(Lieu cheflieu) {
		this.cheflieu = cheflieu;
	}
	
	
}
