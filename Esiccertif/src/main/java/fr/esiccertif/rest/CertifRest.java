package fr.esiccertif.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esiccertif.entities.Certif;
import fr.esiccertif.repository.CertifRepository;


@RestController @CrossOrigin("*")
public class CertifRest {
	@Autowired
	private CertifRepository certifrepo;
	
	
	@PostMapping("/certif")
	public Certif saveCertif(@RequestBody Certif c) {
		return certifrepo.save(c);
	}
	
	@GetMapping("/allcertif")
	public Iterable<Certif> getAllCertif(){
		return certifrepo.findAll();
	}
	

	
	
}
