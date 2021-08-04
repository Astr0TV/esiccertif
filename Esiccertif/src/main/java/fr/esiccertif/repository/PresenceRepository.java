package fr.esiccertif.repository;


import org.springframework.data.repository.CrudRepository;

import fr.esiccertif.entities.Presence;

public interface PresenceRepository extends CrudRepository<Presence, Long>{
	

}
