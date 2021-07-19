package fr.esiccertif.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esiccertif.entities.Formation;
import fr.esiccertif.repository.FormationRepository;

@RestController @CrossOrigin("*")
public class FormationRest {
	
	@Autowired
	private FormationRepository formationrepo;
	
	@PostMapping("/formation")
	public Formation saveFormation(@RequestBody Formation f) {
		return formationrepo.save(f);
	}
	
	@GetMapping("/allformation")
	public Iterable<Formation> getAllFormation(){
		return formationrepo.findAll();
	}
	
	@GetMapping("/formation/{id}")
	public List<Formation> getFormationById(@PathVariable Long id){
		return  formationrepo.findAllById(id);
	}
	
	@GetMapping("/formation/candidat/{id}")
	public List<Formation> getFormationByCandidatId(@PathVariable Long id){
		return  formationrepo.findByCandidatId(id);
	}
	
	

}
