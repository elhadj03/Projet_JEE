package com.masterips.ProjetJEE.Service;

import java.util.List;
import java.util.Optional;

import com.masterips.ProjetJEE.modele.Celebrite;

public interface CelebriteService {
	Optional<Celebrite> findOne (double Id);
	List<Celebrite> findAll();
	void save(Celebrite celebrite);
	void update (Celebrite celebrite);
	void delete (double id);
	void delete (Celebrite celebrite);
}
