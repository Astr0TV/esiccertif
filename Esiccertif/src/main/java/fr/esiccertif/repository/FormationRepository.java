package fr.esiccertif.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.esiccertif.entities.Formation;

public interface FormationRepository extends CrudRepository<Formation, Long> {
	
	public List<Formation> findAllById (Long id);
	
	public List<Formation> findByCandidatId (Long id);
	
	//@Query(value ="SELECT nom from Formation where id <= ?1 GROUP BY nom")
	public List<Formation> findByFormateurId (Long id);

}
