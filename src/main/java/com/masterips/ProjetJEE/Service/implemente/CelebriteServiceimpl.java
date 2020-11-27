package com.masterips.ProjetJEE.Service.implemente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterips.ProjetJEE.Service.CelebriteService;
import com.masterips.ProjetJEE.modele.Celebrite;
import com.masterips.ProjetJEE.repository.CelebriteRepository;

@Service
public class CelebriteServiceimpl implements CelebriteService{
	@Autowired
	private CelebriteRepository repository;
	@Override
	public Optional<Celebrite> findOne(double Id) {
		return repository.findById(Id);
	}

	@Override
	public List<Celebrite> findAll() {
		
		return repository.findAll();
	}

	@Override
	public void save(Celebrite celebrite) {
		repository.save(celebrite);
		
	}

	@Override
	public void update(Celebrite celebrite) {
		repository.save(celebrite);
		
	}

	@Override
	public void delete(double id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Celebrite celebrite) {
		repository.delete(celebrite);
	}

}
