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

		
		
		User c1=new User (null,"ben salah","mariem","0651078812","bsh@esic.fr","1234","candidat",null);
		userRepo.save(c1);
		
		User c2=new User (null,"lamsaouri","Ismail","0551078812","isamail@esic.fr","1234","candidat",null);
		userRepo.save(c2);
		
		User F1=new User (null,"Mermoz","Alamou","0751078812","mermoz@esic.fr","1234","formateur",null);
		userRepo.save(F1);
		
		User F2=new User (null,"Banka","Joel","0851078812","joel@esic.fr","1234","formateur",null);
		userRepo.save(F2);
		
		 DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		 
		Formation f1 =new Formation (null,"Big Data",date.parse("02/07/2021"),date.parse("31/07/2021"),false,false,c1,F1);
		formationRepo.save(f1); 
		f1 =new Formation (null,"Big Data",date.parse("02/07/2021"),date.parse("31/07/2021"),false,false,c2,F1);
		formationRepo.save(f1); 
		Formation f2 =new Formation (null,"Power BI",date.parse("06/06/2021"),date.parse("03/07/2021"),true,true,c1,F2);
		formationRepo.save(f2); 
		f2 =new Formation (null,"Power BI",date.parse("06/06/2021"),date.parse("03/07/2021"),true,true,c2,F2);
		formationRepo.save(f2);
		
		
	}

}
