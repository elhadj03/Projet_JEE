package com.masterips.ProjetJEE.Service.implemente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterips.ProjetJEE.Service.LieuService;
import com.masterips.ProjetJEE.modele.Lieu;
import com.masterips.ProjetJEE.repository.LieuRepository;


@Service
public class LieuServiceimpl implements LieuService{
	@Autowired
	private LieuRepository repository;
	@Override
	public Optional<Lieu> findOne(String Id) {

		return repository.findById(Id);
	}

	@Override
	public List<Lieu> findAll() {
	
		return repository.findAll();
	}

	@Override
	public void save(Lieu lieu) {
		repository.save(lieu);
		
	}

	@Override
	public void update(Lieu lieu) {
		repository.save(lieu);
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);;
	}

	@Override
	public void delete(Lieu lieu) {
		// TODO Auto-generated method stub
		repository.delete(lieu);;
	}
	

}
