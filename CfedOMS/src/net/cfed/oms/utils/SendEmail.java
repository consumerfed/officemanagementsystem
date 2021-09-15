package net.cfed.oms.utils;


import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.cfed.oms.model.SendMailModel;

/**
 * 
 */

/**
 * @author computer
 *
 */
public class SendEmail {
	
	private String []emailHeaders = {"https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/DQCTRnJ_aiLN02INKbcry829tDtsrApJlvq6PuKqt0o=w621-h207-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/1AwUeA3ZpHls-b5nS9xSiPdYTE49N7hkMaDfxOvtBWk=w595-h198-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/VLRv0XFhOF1-r6ZPkj7otvwRKF3ownSb8ixaGKZKY8M=w594-h198-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/JQaUXEP4wji63NDq0hZRs6KbOISHVHGOn3NXYEO-L9s=w595-h198-p-no","https://lh3.googleusercontent.com/J8_DA_Yoa8AmUdoj-usJmfKW-UsFqVT3BNWT5iyYhHk=w594-h198-p-no","https://lh3.googleusercontent.com/zlfKnr5HzEASls-deIf1_0r7IBXH61Leq7aIGLvafSE=w475-h158-p-no","https://lh3.googleusercontent.com/J8_DA_Yoa8AmUdoj-usJmfKW-UsFqVT3BNWT5iyYhHk=w594-h198-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no","https://lh3.googleusercontent.com/GgNyLGVQjcwLvc5hiFv6wIeJKi12vg2QUgDJLGhLsZI=w621-h207-p-no"};

	public Boolean sendRegistrationMail(DefaultTableModel tableModel) {
		String username = null;
		username = "Shimjith Kumar";
		Random random = new Random();
		int mailHeader = random.nextInt(10);
        String msg = " Mail sent successfully (java mail service application)";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.debug", "true");  // Debug the program
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("cfedprice@gmail.com","bitheshconsumerfed");
                }
            });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cfedprice@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("nijesh.zgc@gmail.com"));
            message.setSubject(" K.S.C.C.F ltd Employee Portal ");
            // create the message part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            //message body
            messageBodyPart.setContent("<div><div style=\"width:750px;min-height:auto;text-align:center\"><div style=\"width:100%;min-height:123px;border-bottom:1px solid #ccc\"><img width=\"750\" height=\"250\" alt=\"K.S.C.C.F ltd kozhikode \" src=\""+emailHeaders[mailHeader]+"\" class=\"CToWUd\"></div>    <div style=\"min-height:auto;margin:45px auto;font-family:Tahoma,Geneva,sans-serif;font-size:12px;font-weight:normal;color:#585c4b;text-decoration:none;line-height:18px;text-align:justify;background-color:#fff;width:91%\">        <h1 style=\"font-family:Tahoma,Geneva,sans-serif;font-size:13px;font-weight:bold;color:#769f04;text-decoration:none;margin:0px;padding:0 0 15px 0;display:block;line-height:normal;min-height:auto\">Dear  "+username+",</h1>Many Thanks for using <span class=\"il\">K.S.C.C.F ltd</span> Consumerfed/Employee portal. With this website, what we the I T Section are aiming is to provide a breif description of Consumerfed kozhikode region with the best possible assistance &amp; service.<br><br>On this occasion we would like to welcome you as a member to our family of Consumerfed Employee Portal <a style=\"color:#6b9102\" href=\"#138c1b1471a9c6a0_\">consumerfed.net </a> We're glad that you chose to register with us and from now on through this portal; you would be able to explore everything about kozhikode region, one of the best region blessed with efficent productive and experienced staffs. We Thank the Deputy Regional Manager, the price controlling officer and the I T section for their valuable supports  <br><br> Please activate your account by clicking on the link provided below or use the right hand side button on your mouse and copy-paste the link in the address bar on your browser.  <br><br><br><a target=\"_blank\" style=\"color:#6b9102\" href=\"http://15-server:8080/CfedOMS/unitMap.html\">http://cfed.<span class=\"il\">consumerfed</span>.net/<wbr></wbr>registration.htm?refno=<wbr></wbr>7014==</a></div>        <div style=\"min-height:auto;text-align:center;width:750px;border-top:1px solid #ccc;background-color:#f9faf3;padding:10px 0 10px 0\">    <span style=\"background-color:#f9faf3;font-family:Tahoma,Geneva,sans-serif;font-size:11px;font-weight:normal;color:#898988;text-decoration:none;text-align:center\"><strong><img width=\"96\" height=\"21\" alt=\"K S C C F ltd kozhikode\" src=\"https://consumerfed.net#http://tour1.mapview.in/images/footerlogo.jpg\" class=\"CToWUd\"><br>      <span class=\"il\">K.S.C.C.F</span> Ltd.</strong><br>Triveni building, Muthalakkulam Calicut - 673001, Kerala State, INDIA<br>Phone: <a target=\"_blank\" value=\"+914952721081\" href=\"tel:%2B91495271081\">+914952721081</a>  Fax: <a target=\"_blank\" value=\"+914952721081\" href=\"tel:%2B914952721081\">+914952721081</a><br>e-mail: <a target=\"_blank\" style=\"color:#898988\" href=\"mailto:consfedkozhikode@gmail.com\">consfedkozhikode@<span class=\"il\">gmail</span>.com</a></span><br><a href=\"http://plus.google.com/117599535776353036615\"> Developed by </a><div class=\"yj6qo\"></div><div class=\"adL\">    </div></div></div><div class=\"adL\"> </div></div>","text/html");
            //messageBodyPart.setText("<div><div style=\"width:750px;min-height:auto;text-align:center\"><div style=\"width:100%;min-height:123px;border-bottom:1px solid #ccc\"><img width=\"750\" height=\"123\" alt=\"Wayanad Tourism\" src=\"https://ci6.googleusercontent.com/proxy/NyqwpyFkjqbYjETMMLEfIMJKGqN1POpbhLoE-P7YlINOcoZCOjw0tGd2hSL70qT1c-QQf7L7yIfQpbaaFeKl=s0-d-e1-ft#http://tour1.mapview.in/images/banner.jpg\" class=\"CToWUd\"></div>    <div style=\"min-height:auto;margin:45px auto;font-family:Tahoma,Geneva,sans-serif;font-size:12px;font-weight:normal;color:#585c4b;text-decoration:none;line-height:18px;text-align:justify;background-color:#fff;width:91%\">        <h1 style=\"font-family:Tahoma,Geneva,sans-serif;font-size:13px;font-weight:bold;color:#769f04;text-decoration:none;margin:0px;padding:0 0 15px 0;display:block;line-height:normal;min-height:auto\">Dear  nijeshkumar,</h1>Many Thanks for registering with <span class=\"il\">MapView</span> Geo-Tourism/Business portal. With this website, what we are aiming is to provide Wayanad tourists with the best possible assistance &amp; service.<br><br>On this occasion we would like to welcome you as a member to our family of Geo Business Portal <a style=\"color:#6b9102\" href=\"#138c1b1471a9c6a0_\">wynadgeotourism.com.</a> We're glad that you chose to register with us and from now on through this portal; you would be able to explore the endless opportunities of the flora and fauna in and around Wayanad, the true green paradise on planet Earth.  Our services include Geo-Information on various styles of Resorts, Hotels, Restaurants, Banks and related ATM's, Govt. and Private Offices, Businesses and so and so.  Why wait? Rush to enjoy the Wayanad feast. :)<br><br> Please activate your account by clicking on the link provided below or use the right hand side button on your mouse and copy-paste the link in the address bar on your browser.  <br><br><br><a target=\"_blank\" style=\"color:#6b9102\" href=\"http://tour1.mapview.in/registration.htm?refno=MP8omfh7pPRdKAIhfT9i2w==\">http://tour1.<span class=\"il\">mapview</span>.in/<wbr></wbr>registration.htm?refno=<wbr></wbr>MP8omfh7pPRdKAIhfT9i2w==</a></div>        <div style=\"min-height:auto;text-align:center;width:750px;border-top:1px solid #ccc;background-color:#f9faf3;padding:10px 0 10px 0\">    <span style=\"background-color:#f9faf3;font-family:Tahoma,Geneva,sans-serif;font-size:11px;font-weight:normal;color:#898988;text-decoration:none;text-align:center\"><strong><img width=\"96\" height=\"21\" alt=\"Wayanad Tourism\" src=\"https://ci6.googleusercontent.com/proxy/gWeqV3XrG8Dt9kGMzYmWZt97dDDzv52k-irNB7areSzkKM2TAUnjymNLh6brqbN0OPcPXPwTXaIhYW6kATn60w8z5g=s0-d-e1-ft#http://tour1.mapview.in/images/footerlogo.jpg\" class=\"CToWUd\"><br>      <span class=\"il\">MapView</span> Geographical Solutions Pvt. Ltd.</strong><br>Opp. Planetarium, Jaffer Khan Colony Calicut - 673006, Kerala State, INDIA<br>Phone: <a target=\"_blank\" value=\"+914954010161\" href=\"tel:%2B914954010161\">+914954010161</a>  Fax: <a target=\"_blank\" value=\"+914954010162\" href=\"tel:%2B914954010162\">+914954010162</a><br>e-mail: <a target=\"_blank\" style=\"color:#898988\" href=\"mailto:info@mapview.in\">info@<span class=\"il\">mapview</span>.in</a></span><div class=\"yj6qo\"></div><div class=\"adL\">    </div></div></div><div class=\"adL\"> </div></div>");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            //attachment
            //messageBodyPart = new MimeBodyPart();
           // DataSource source = new FileDataSource("D:\\PTXSANCHAYKA\\test.txt");
           // messageBodyPart.setDataHandler(new DataHandler(source));
           // messageBodyPart.setFileName("priceIndent.txt");
           // multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            //message.setFileName("hackThroughEmail.java");

            Transport.send(message);

            //System.out.println("Email sent successfully using this java application");
        } catch (MessagingException e) {
            msg = "Error while sending";
            throw new RuntimeException(e);
        }
        JOptionPane.showMessageDialog(null, msg);
    
		// TODO Auto-generated method stub
		return true;
	}


 public static void main(String[] args) {
	 
	 SendEmail b = new SendEmail();
	 //b.sendRegistrationMail(null);

}


public String sendRegistrationMail(SendMailModel sendMailModel) {
	String emailId = sendMailModel.getEmailId();
	String username = null;
	username = "Shimjith Kumar";
	username = getUsernameFromEmail(emailId);
	Random random = new Random();
	int mailHeader = random.nextInt(10);
    String msg = " Mail sent successfully (java mail service application)";
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
            "javax.net.ssl.SSLSocketFactory");
    props.put("mail.debug", "true");  // Debug the program
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");

    Session session = Session.getDefaultInstance(props,
        new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("cfedprice@gmail.com","bitheshconsumerfed");
            }
        });

    try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("cfedprice@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(emailId));
        message.setSubject(" K.S.C.C.F ltd Employee Portal ");
        // create the message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        //message body
        messageBodyPart.setContent("<div><div style=\"width:750px;min-height:auto;text-align:center\"><div style=\"width:100%;min-height:123px;border-bottom:1px solid #ccc\"><img width=\"750\" height=\"250\" alt=\"K.S.C.C.F ltd kozhikode \" src=\""+emailHeaders[mailHeader]+"\" class=\"CToWUd\"></div>    <div style=\"min-height:auto;margin:45px auto;font-family:Tahoma,Geneva,sans-serif;font-size:12px;font-weight:normal;color:#585c4b;text-decoration:none;line-height:18px;text-align:justify;background-color:#fff;width:91%\">        <h1 style=\"font-family:Tahoma,Geneva,sans-serif;font-size:13px;font-weight:bold;color:#769f04;text-decoration:none;margin:0px;padding:0 0 15px 0;display:block;line-height:normal;min-height:auto\">Dear  "+username+",</h1>Many Thanks for using <span class=\"il\">K.S.C.C.F ltd</span> Consumerfed/Employee portal. With this website, what we the I T Section are aiming is to provide a breif description of Consumerfed kozhikode region with the best possible assistance &amp; service.<br><br>On this occasion we would like to welcome you as a member to our family of Consumerfed Employee Portal <a style=\"color:#6b9102\" href=\"#138c1b1471a9c6a0_\">consumerfed.net </a> We're glad that you chose to register with us and from now on through this portal; you would be able to explore everything about kozhikode region, one of the best region blessed with efficent productive and experienced staffs. We Thank the Deputy Regional Manager, the price controlling officer and the I T section for their valuable supports  <br><br> Please activate your account by clicking on the link provided below or use the right hand side button on your mouse and copy-paste the link in the address bar on your browser.  <br><br><br><a target=\"_blank\" style=\"color:#6b9102\" href=\"http://15-server:8080/CfedOMS/unitMap.html\">http://cfed.<span class=\"il\">consumerfed</span>.net/<wbr></wbr>registration.htm?refno=<wbr></wbr>7014==</a></div>        <div style=\"min-height:auto;text-align:center;width:750px;border-top:1px solid #ccc;background-color:#f9faf3;padding:10px 0 10px 0\">    <span style=\"background-color:#f9faf3;font-family:Tahoma,Geneva,sans-serif;font-size:11px;font-weight:normal;color:#898988;text-decoration:none;text-align:center\"><strong><img width=\"96\" height=\"21\" alt=\"K S C C F ltd kozhikode\" src=\"https://consumerfed.net#http://tour1.mapview.in/images/footerlogo.jpg\" class=\"CToWUd\"><br>      <span class=\"il\">K.S.C.C.F</span> Ltd.</strong><br>Triveni building, Muthalakkulam Calicut - 673001, Kerala State, INDIA<br>Phone: <a target=\"_blank\" value=\"+914952721081\" href=\"tel:%2B91495271081\">+914952721081</a>  Fax: <a target=\"_blank\" value=\"+914952721081\" href=\"tel:%2B914952721081\">+914952721081</a><br>e-mail: <a target=\"_blank\" style=\"color:#898988\" href=\"mailto:consfedkozhikode@gmail.com\">consfedkozhikode@<span class=\"il\">gmail</span>.com</a></span><br><a href=\"http://plus.google.com/117599535776353036615\"> Developed by </a><div class=\"yj6qo\"></div><div class=\"adL\">    </div></div></div><div class=\"adL\"> </div></div>","text/html");
        //messageBodyPart.setText("<div><div style=\"width:750px;min-height:auto;text-align:center\"><div style=\"width:100%;min-height:123px;border-bottom:1px solid #ccc\"><img width=\"750\" height=\"123\" alt=\"Wayanad Tourism\" src=\"https://ci6.googleusercontent.com/proxy/NyqwpyFkjqbYjETMMLEfIMJKGqN1POpbhLoE-P7YlINOcoZCOjw0tGd2hSL70qT1c-QQf7L7yIfQpbaaFeKl=s0-d-e1-ft#http://tour1.mapview.in/images/banner.jpg\" class=\"CToWUd\"></div>    <div style=\"min-height:auto;margin:45px auto;font-family:Tahoma,Geneva,sans-serif;font-size:12px;font-weight:normal;color:#585c4b;text-decoration:none;line-height:18px;text-align:justify;background-color:#fff;width:91%\">        <h1 style=\"font-family:Tahoma,Geneva,sans-serif;font-size:13px;font-weight:bold;color:#769f04;text-decoration:none;margin:0px;padding:0 0 15px 0;display:block;line-height:normal;min-height:auto\">Dear  nijeshkumar,</h1>Many Thanks for registering with <span class=\"il\">MapView</span> Geo-Tourism/Business portal. With this website, what we are aiming is to provide Wayanad tourists with the best possible assistance &amp; service.<br><br>On this occasion we would like to welcome you as a member to our family of Geo Business Portal <a style=\"color:#6b9102\" href=\"#138c1b1471a9c6a0_\">wynadgeotourism.com.</a> We're glad that you chose to register with us and from now on through this portal; you would be able to explore the endless opportunities of the flora and fauna in and around Wayanad, the true green paradise on planet Earth.  Our services include Geo-Information on various styles of Resorts, Hotels, Restaurants, Banks and related ATM's, Govt. and Private Offices, Businesses and so and so.  Why wait? Rush to enjoy the Wayanad feast. :)<br><br> Please activate your account by clicking on the link provided below or use the right hand side button on your mouse and copy-paste the link in the address bar on your browser.  <br><br><br><a target=\"_blank\" style=\"color:#6b9102\" href=\"http://tour1.mapview.in/registration.htm?refno=MP8omfh7pPRdKAIhfT9i2w==\">http://tour1.<span class=\"il\">mapview</span>.in/<wbr></wbr>registration.htm?refno=<wbr></wbr>MP8omfh7pPRdKAIhfT9i2w==</a></div>        <div style=\"min-height:auto;text-align:center;width:750px;border-top:1px solid #ccc;background-color:#f9faf3;padding:10px 0 10px 0\">    <span style=\"background-color:#f9faf3;font-family:Tahoma,Geneva,sans-serif;font-size:11px;font-weight:normal;color:#898988;text-decoration:none;text-align:center\"><strong><img width=\"96\" height=\"21\" alt=\"Wayanad Tourism\" src=\"https://ci6.googleusercontent.com/proxy/gWeqV3XrG8Dt9kGMzYmWZt97dDDzv52k-irNB7areSzkKM2TAUnjymNLh6brqbN0OPcPXPwTXaIhYW6kATn60w8z5g=s0-d-e1-ft#http://tour1.mapview.in/images/footerlogo.jpg\" class=\"CToWUd\"><br>      <span class=\"il\">MapView</span> Geographical Solutions Pvt. Ltd.</strong><br>Opp. Planetarium, Jaffer Khan Colony Calicut - 673006, Kerala State, INDIA<br>Phone: <a target=\"_blank\" value=\"+914954010161\" href=\"tel:%2B914954010161\">+914954010161</a>  Fax: <a target=\"_blank\" value=\"+914954010162\" href=\"tel:%2B914954010162\">+914954010162</a><br>e-mail: <a target=\"_blank\" style=\"color:#898988\" href=\"mailto:info@mapview.in\">info@<span class=\"il\">mapview</span>.in</a></span><div class=\"yj6qo\"></div><div class=\"adL\">    </div></div></div><div class=\"adL\"> </div></div>");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        //attachment
        //messageBodyPart = new MimeBodyPart();
       // DataSource source = new FileDataSource("D:\\PTXSANCHAYKA\\test.txt");
       // messageBodyPart.setDataHandler(new DataHandler(source));
       // messageBodyPart.setFileName("priceIndent.txt");
       // multipart.addBodyPart(messageBodyPart);
        message.setContent(multipart);
        //message.setFileName("hackThroughEmail.java");

        Transport.send(message);

        //System.out.println("Email sent successfully using this java application");
    } catch (MessagingException e) {
        msg = "Error while sending";
        throw new RuntimeException(e);
    }
    //JOptionPane.showMessageDialog(null, msg);
    System.out.println(" Send Email "+msg);
    System.out.println(" Send Email "+emailId);

	// TODO Auto-generated method stub
	return "Success";
}


private String getUsernameFromEmail(String emailId) {
	String username = "Guest";
	if(emailId!=null){
		username = emailId.substring(0, emailId.indexOf("@"));
	}
	return username;
}

}
