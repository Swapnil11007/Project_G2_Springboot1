package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

import com.dao.EmailSenderService_DAO;
import com.dao.UsersDAO;
import com.model.Users;

@RestController
public class EmailSenderController {
	
	@Autowired
	private EmailSenderService_DAO senderService;
	@Autowired
	private UsersDAO usersDAO;
	
	//@EventListener(ApplicationReadyEvent.class)
	
	@RequestMapping("/sendMail")
	public String sendMail(){
		
		// to generate OTP
		Random random = new Random();
		int OTP = ( random.nextInt(80) * 100 ) + (1000 + random.nextInt(99) );

		
		senderService.sendEmail("shindes12121@gmail.com", 
								"OTP For Forgot Password", 
								"Your OTP for Forgot Password is " + OTP + "\nDo Not Share this Code with anyone" );
		return "Mail Sent Successfully " + OTP  ;
	}
	
	
	@GetMapping("/sendMail/{emailId}")
	public Users sendMail1(@PathVariable("emailId") String emailId){
		
		//System.out.println(emailId);
		Users user1 = usersDAO.getUserByEmailId(emailId);
		
		if(user1.getUserId() == -1)
			return new Users(1,"unsuccessfule",null,null, emailId);
		
		// to generate OTP
		Random random = new Random();
		int OTP = ( random.nextInt(80) * 100 ) + (1000 + random.nextInt(99) );

		senderService.sendEmail(emailId, 
								"OTP For Forgot Password", 
								"Your OTP for Forgot Password is " + OTP + "\nDo Not Share this Code with anyone" );
		return user1;
		//return "Mail Sent Successfully " + OTP  ;
	}
	
	
}
