package com;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MailSend extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	//Get properties object    
        /*Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.port", "587");  
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SocketFactory");*/
      final String from="-";
       final String pass="-";
       String to="-";
		String sub="java mail demo";
		String text="abcdefghijklmnopqrstuvwxyz";
       
       Properties prop = new Properties(); 
		 //prop.put("mail.transport.protocol","smtp");
		 prop.put("mail.smtp.host", "smtp.gmail.com");
	      prop.put("mail.smtp.auth", "true");
	      prop.put("mail.debug", "true");
	      prop.put("mail.smtp.starttls.enable", "true");
	      prop.put("mail.smtp.port", "465");
	      prop.put("mail.smtp.socketFactory.port", "465");
	      prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SocketFactory");
	     
	      prop.put("mail.smtp.ssl.enable", "true");
	      Session session = Session.getDefaultInstance(prop,    
         new javax.mail.Authenticator() {    
         protected PasswordAuthentication getPasswordAuthentication() {    
         return new PasswordAuthentication(from,pass);  
         }    
        });    
        //compose message 
        session.setDebug(true);
        try {    
         MimeMessage message = new MimeMessage(session);    
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
         message.setSubject(sub);    
         message.setText(text);    
         //send message  
         Transport.send(message);    
         System.out.println("message sent successfully");    
        } catch (MessagingException e) {
       	 e.printStackTrace();
        }    
           
	
	}
}
