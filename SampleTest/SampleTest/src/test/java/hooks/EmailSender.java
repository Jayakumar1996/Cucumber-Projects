package hooks;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import baseclass.ConfigReader;

public class EmailSender {

	 public static void sendTestReport() {
	        // SMTP server settings
	        String smtpHost = "smtp.gmail.com";
	        int smtpPort = 587;
	        final String senderEmail = ConfigReader.getProperty("SENDEREMAIL");
	        final String senderPassword = ConfigReader.getProperty("SENDERPASSWORD");

	        // Recipient email address
	        String recipientEmail = ConfigReader.getProperty("RECEPIENTEMAIL");

	        // Email properties
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", smtpHost);
	        props.put("mail.smtp.port", smtpPort);

	        // Session object
	        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(senderEmail, senderPassword);
	                
	            }
	        });

	        try {
	            // Create MimeMessage object
	            MimeMessage message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(senderEmail));
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
	            message.setSubject("Test Report");

	            // Create MimeBodyPart for the email body
	            MimeBodyPart messageBodyPart = new MimeBodyPart();
	            messageBodyPart.setText("Please find the attached test report.");

	            // Create MimeBodyPart for the test report attachment
	            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
	            String attachmentFilePath = "C:\\Users\\TLSPC-091\\eclipse-workspace\\SampleTest\\target\\cucumber-reports\\Reports.html"; // Replace with the actual path to the test report
	            attachmentBodyPart.attachFile(attachmentFilePath);

	            // Create Multipart object to combine body and attachment
	            Multipart multipart = new MimeMultipart();
	            multipart.addBodyPart(messageBodyPart);
	            multipart.addBodyPart(attachmentBodyPart);

	            // Set content of the message
	            message.setContent(multipart);

	            // Send the message
	            Transport.send(message);
	            System.out.println("Email sent successfully!");
	        } catch (Exception e) {
	        	System.out.println("Email Not sent successfully!");
	            e.printStackTrace();
	        }
	    }
}
