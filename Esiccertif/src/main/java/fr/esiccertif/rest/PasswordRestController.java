package fr.esiccertif.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordRestController {
	private static final String redirect_login="redirect:/login";
	private static final String msg="resetPasswordMsg";
	
	
	@Autowired
	private MessageSource messageSource;
	//@Autowired
	//private CustomerAccountService customerAccountService;
	

}
