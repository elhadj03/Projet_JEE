package com.masterips.ProjetJEE.Service;
import com.masterips.ProjetJEE.modele.Lieu;
import java.util.List;
import java.util.Optional;

public interface LieuService {
	Optional<Lieu> findOne (String Id);
	List<Lieu> findAll();
	void save(Lieu lieu);
	void update (Lieu lieu);
	void delete (String id);
	void delete (Lieu lieu);

}
