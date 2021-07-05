package fr.esiccertif.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.esiccertif.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	public Optional<User> findByEmailAndMdp (String email ,String mdp);
	
	public List<User> findAllById (Long id);
	
	public List<User> findAllByEmail (String email);

}
