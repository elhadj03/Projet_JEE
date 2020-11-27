package com.masterips.ProjetJEE.Service;

import java.util.List;
import java.util.Optional;

import com.masterips.ProjetJEE.modele.Monument;

public interface MonumentService {
	Optional<Monument> findOne (String Id);
	List<Monument> findAll();
	void save(Monument monument);
	void update (Monument monument);
	void delete (String id);
	void delete (Monument monument);

}
