package fr.esiccertif.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.esiccertif.entities.Formation;

public interface FormationRepository extends CrudRepository<Formation, Long> {
	
	public List<Formation> findAllById (Long id);

}
