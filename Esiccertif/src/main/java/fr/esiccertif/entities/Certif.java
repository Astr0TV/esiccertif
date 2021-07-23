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
public class Certif {
	@Id @GeneratedValue
private Long id;
private String nom;
@JsonFormat(pattern="dd/MM/yyyy")
private Date dateCertif;
@ManyToOne
private User Candidat;
}
