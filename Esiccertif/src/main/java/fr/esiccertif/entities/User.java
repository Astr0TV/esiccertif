package fr.esiccertif.entities;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class User {
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String tele;
	@Column(unique=true )
	private String email;
    private String mdp;
    private String role = "candidat";
    
    @ManyToMany
    private Collection<Formation> formation;

}
