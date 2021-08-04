package fr.esiccertif;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.esiccertif.entities.Formation;
import fr.esiccertif.entities.User;
import fr.esiccertif.repository.CertifRepository;
import fr.esiccertif.repository.FormationRepository;
import fr.esiccertif.repository.UserRepository;

@SpringBootApplication
public class EsiccertifApplication implements CommandLineRunner {

	@Autowired 
	private UserRepository userRepo;
	@Autowired 
	private FormationRepository formationRepo;
	@Autowired 
	private CertifRepository certifRepo;
	
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(EsiccertifApplication.class, args);
		System.out.println("************************                               ************************\n************************  ---___ESICCERTIF EST LANCÉ___--- ************************\n************************                               ************************".toUpperCase());

		}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("************************                               ************************\n************************ ---___Debut Instruction Perso___--- ******************\n************************                               ************************".toUpperCase());	

		
		
	}

}
