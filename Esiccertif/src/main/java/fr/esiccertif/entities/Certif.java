package fr.esiccertif.entities;

import java.util.Date;

import javax.persistence.ManyToOne;

public class Certif {
private Long id;
private String nom;
private Date dateCertif;
@ManyToOne
private User Candidat;
}
