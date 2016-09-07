package email;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Demo {

	public static void main(String[] args) {
		SendEmail sender = new SendEmail();
		sender.setSender("iliyanavitanova96@gmail.com", "vita96nova");
		try {
			sender.addRecipient("ivan.qnachkov@gmail.com");
		} catch (AddressException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sender.setSubject("The subject");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sender.setBody("The body");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sender.addAttachment("TestFile.txt");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sender.send();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
