package org.apache.commons.mail;

import static org.junit.Assert.*;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Session;

import org.junit.Before;
import org.junit.Test;

public class EmailDemoTest {

		
		private static final String[] TEST_EMAILS = 
			{
				
				
				"ab@bc.com", "a.b@c.org", "abcdefghijklmopqrstuvwxyz@abcdefghjijlsktew.com.bd"
				
				
		};



		private static final int Date = 0; 
	
	
	
	private EmailConcrete email; 
	
	@Before
	public void setUpEmailTest() throws Exception {
		
		email = new EmailConcrete(); 
		
		
	}
	
	
	@Test
	public void testgetHostName() 
	{
		
		email.setHostName("192.127.0.1");
		String hostname = email.getHostName();
		assertEquals("192.127.0.1", hostname);
		
	
	}
	
	@Test
	public void testGetSetHostNameNull() {
		
		
		
		email.setHostName(null);
		assertEquals(null, email.getHostName());
	}

	
	
		
		//final String username = "username@gmail.com";
		//final String password = "password";
		
		//Properties props = new Properties();
		//props.put(EmailConstants.MAIL_SMTP_AUTH, "true");
		//props.put(EmailConstants.MAIL_HOST, "smtp.gmail.com");
		//props.put(EmailConstants.MAIL_PORT, "587");
		//props.put(EmailConstants.MAIL_SMTP_USER, "username@gmail.com");
		//props.put(EmailConstants.MAIL_SMTP_PASSWORD, "password");
		

	
//Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			
		//	protected PasswordAuthentication getPasswordAuthentication() {
		
	//	
		//return new PasswordAuthentication(username, password); 
//	}
//			
//	});
//	
//email.setMailSession(session);

//assertEquals("smtp.gmail.com", email.getHostName());
	@Test
	public void testGetSetHostNameWithSession()
	{	
		
		Properties properties = new Properties();
		Session session = Session.getDefaultInstance(properties, null);
		properties.put(EmailConstants.MAIL_HOST, "smtp.gmail.com");
		email.setMailSession(session);
		email.setHostName("localhost");
		assertEquals("smtp.gmail.com", email.getHostName());
	
	}
		
		
		
}


@Test
public void testbuildMimeMessage() throws EmailException 
{
	
	
	email.setHostName("localhost"); 
	email.setSmtpPort("1234");
	email.setFrom("a@b.com");
	email.addTo("c@d.com");
	email.setSubject("test mail");
	email.setCharset("IS0=8859-1");
	email.setContent("test content", "text/plain");
	email.addCc("test@abc.com");
	email.addBcc("test2@abx.com"); 
	email.addHeader("test", "abc");
	email.buildMimeMessage(); 
	
}


@Test
public void testaddReplyTo() 
{
	
	email.setHostName("localhost");
	email.addReplyTo("@.b.com");
	email.addReplyTo("a@b.com", "localhost"); 
	email.addReplyTo("c@b.com", "localhost", "test");
	email.addReplyTo("c@b.com");
	
}




@Test
public void getSentDate()
{
	
	
	email.getSentDate();
	email.addReplyTo("c@c.com");
	
	
}


@Test
public void getSocketConnectionTimeout()
{
	
	email.getSocketConnectionTimeout();
	email.getSocketTimeout("10");
	
}

@Test
public void setFrom(String email)
{
	email.setHostName("localhost");
	
}


@Test
public void getMailSession()
{
	
	email.MAIL_PORT("localhost");
	email.setHostName("localhost");
	
}
}