package fr.esiccertif.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor @NoArgsConstructor  @Data
@Entity
public class PageEvaluation {
	@Id @GeneratedValue
private Long id;
	private String section;
private String question;
//private String reponse;
private String reponsechoisie;
private int scoreFormation;
private int scoreFormateur;

}
