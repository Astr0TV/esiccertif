package fr.esiccertif.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.esiccertif.entities.PageEvaluation;
import fr.esiccertif.repository.PageEvaluationRepository;

@RestController @CrossOrigin("*")
public class PageEvaluationRest {
	@Autowired
	private PageEvaluationRepository pageEval;
	
	
	@PostMapping("/pageEval")
	public PageEvaluation savepageEval(@RequestBody PageEvaluation p) {
	return pageEval.save(p);
	}
	@GetMapping("/allpageEval")
	public Iterable<PageEvaluation> allpageEval() {
		return pageEval.findAll();
	}

}
