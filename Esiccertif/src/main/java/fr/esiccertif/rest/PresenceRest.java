package fr.esiccertif.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esiccertif.entities.Presence;
import fr.esiccertif.repository.PresenceRepository;

@RestController @CrossOrigin("*")
public class PresenceRest {
	
	@Autowired
	private PresenceRepository presencerepo;
	
	@PostMapping("/presence")
	public  Presence savePresence(@RequestBody Presence p) {
		return presencerepo.save(p);
	}
	
	@GetMapping("/allpresence")
	public Iterable<Presence> getAllPresence(){
		return presencerepo.findAll();
	}

}
