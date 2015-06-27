package com.niranjan.geeksforgeeks;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.UIDFolder;

public class ReadMail {
	
	public static void main(String[] args) {
		System.out.println(readMail());
	}
	
	public static String readMail() {
		Properties properties = System.getProperties();
		Session emailSession = Session.getDefaultInstance(properties, null);
		Store store;
		//responseBuilder.append("Intialization...");
		try {
			store = emailSession.getStore("imaps");
			// mail.exchange.cs.cmu.edu rr@cmu.edu rr0613cmu
			store.connect("mail.exchange.cs.cmu.edu", 
					"rr@cmu.edu", "rr0613cmu");
			Folder FromFolder = store.getFolder("INBOX");
			FromFolder.open(Folder.READ_WRITE); 
			Message[] messages = FromFolder.getMessages();
			UIDFolder uf = (UIDFolder)FromFolder;
			int count = 0;
			for (Message message:messages){
				if (count > 10)
					break;
				System.out.println(message.getSubject() + "      " + message.getMessageNumber());

			}
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "niranjan";
	}
}
