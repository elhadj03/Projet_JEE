package com.masterips.ProjetJEE.Service;

import java.util.List;
import java.util.Optional;

import com.masterips.ProjetJEE.modele.Departement;

public interface DepartementService {
	
	Optional<Departement> findOne (String Id);
	List<Departement> findAll();
	void save(Departement departement);
	void update (Departement departement);
	void delete (String id);
	void delete (Departement departement);
	
}
