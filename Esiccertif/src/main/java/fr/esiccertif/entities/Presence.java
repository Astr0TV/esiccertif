package fr.esiccertif.entities;

import java.util.Collection;
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
public class Presence {
	
	@Id @GeneratedValue
	private Long id;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date jour1; 
	private String hours1; 
	
    @ManyToOne
    private Formation formation;
    
    @ManyToOne
    private User candidat;
    
    @ManyToOne
    private User formateur;

}
