package fr.esiccertif.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Valider {
	
	@Id @GeneratedValue
	private Long id;
	private boolean valider;
	
	@ManyToOne
	private Formation formation;

}
