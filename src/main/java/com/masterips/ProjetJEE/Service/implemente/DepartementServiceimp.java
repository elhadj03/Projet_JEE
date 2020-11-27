package com.masterips.ProjetJEE.Service.implemente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterips.ProjetJEE.Service.DepartementService;
import com.masterips.ProjetJEE.modele.Departement;
import com.masterips.ProjetJEE.repository.DepartementRepository;

@Service
public class DepartementServiceimp implements DepartementService {
	@Autowired
	private DepartementRepository repository;

	@Override
	public Optional<Departement> findOne(String Id) {
		return repository.findById(Id);
	}

	@Override
	public List<Departement> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Departement departement) {
		repository.save(departement);
		
	}

	@Override
	public void update(Departement departement) {
		repository.save(departement);
		
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Departement departement) {
		repository.delete(departement);
	}

}
