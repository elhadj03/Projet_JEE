package com.masterips.ProjetJEE.Service.implemente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterips.ProjetJEE.Service.MonumentService;
import com.masterips.ProjetJEE.modele.Monument;
import com.masterips.ProjetJEE.repository.MonumentRepository;

@Service
public class MonumentServiceimpl implements MonumentService{
	@Autowired
	MonumentRepository repository;

	@Override
	public Optional<Monument> findOne(String id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Monument> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Monument monument) {
		repository.save(monument);
		
	}

	@Override
	public void update(Monument monument) {
		repository.save(monument);
		
		
	}

	@Override
	public void delete(String id) {
		
		 repository.deleteById(id);
	}

	@Override
	public void delete(Monument monument) {
		 repository.delete(monument);
	}

}
