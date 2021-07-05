package fr.esiccertif.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esiccertif.entities.User;
import fr.esiccertif.repository.UserRepository;

@RestController @CrossOrigin("*")
public class UserRest {
	
	@Autowired
	private UserRepository userreop;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User u) {
		return userreop.save(u);
	}
	
	@GetMapping("/alluser")
	public Iterable<User> getAllUser(){
		return userreop.findAll();
	}
	
	@PostMapping("/connexion")
	public Optional<User> connexion(@RequestBody User u){
		return userreop.findByEmailAndMdp(u.getEmail(), u.getMdp());
	}
	
	@GetMapping("/user/{id}")
	public List<User> findById(@PathVariable Long id){
		return userreop.findAllById(id);
	}
	
	@GetMapping("/users/{email}")
	public List<User> getUserByEmail(@PathVariable String email){
		return userreop.findAllByEmail(email);
	}
	

}
