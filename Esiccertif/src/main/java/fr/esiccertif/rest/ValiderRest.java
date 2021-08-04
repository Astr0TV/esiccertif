package fr.esiccertif.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esiccertif.entities.Valider;
import fr.esiccertif.repository.ValiderRepository;

@RestController @CrossOrigin("*")
public class ValiderRest {
	
	@Autowired
	private ValiderRepository validerrepo;
	
	@PostMapping("/valider")
	public Valider saveValider(@RequestBody Valider v) {
		return validerrepo.save(v);
	}
	
	@GetMapping("/allvalider")
	public Iterable<Valider> getAllValidatation(){
		return validerrepo.findAll();
	}

}
