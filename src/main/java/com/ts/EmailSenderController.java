package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

import com.dao.EmailSenderService_DAO;

@RestController
public class EmailSenderController {
	
	@Autowired
	private EmailSenderService_DAO senderService;
	
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
	
	@RequestMapping("/sendMail/{emailId}")
	public String sendMail1(){
		
		// to generate OTP
		Random random = new Random();
		int OTP = ( random.nextInt(80) * 100 ) + (1000 + random.nextInt(99) );

		
		senderService.sendEmail("shindes12121@gmail.com", 
								"OTP For Forgot Password", 
								"Your OTP for Forgot Password is " + OTP + "\nDo Not Share this Code with anyone" );
		return "Mail Sent Successfully " + OTP  ;
	}
	
}
