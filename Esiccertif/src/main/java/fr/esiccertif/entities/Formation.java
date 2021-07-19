package fr.esiccertif.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Formation {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date date_debut;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date date_fin;
	private boolean progress;
	private boolean valider;
	
	@ManyToOne
	 private User candidat;
	
	@ManyToOne
	private User formateur;

}
