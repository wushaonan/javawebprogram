package com.wrox.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by nan on 17-1-20.
 */
public class SendEmail extends Thread{

    private String from = "1695680698@qq.com";

    private String userName  = "1695680698@qq.com";

    private String password = "19920204Wsn";//"ghtzyvyjqgenegba";

    private String host  = "smtp.qq.com";

    private User user;

    public SendEmail(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        Properties properties = new Properties();
        properties.setProperty("mail.host",host);
        properties.setProperty("mail.transport.protocol","smtp");
        properties.setProperty("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        Session session = Session.getInstance(properties, new MyAuthenticator(userName,password));
        session.setDebug(true);

        try {
            Transport transport = session.getTransport();
            transport.connect(host,userName,password);
            Message message =  createEmail(session,user);
            transport.sendMessage(message,message.getAllRecipients());
            transport.close();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建要发送的邮件
     * @param session
     * @param user
     * @return
     * @throws Exception
     */
    public Message createEmail(Session session,User user) throws Exception{

        MimeMessage mimeMessage = new MimeMessage(session);

        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(user.getEmail()));
        mimeMessage.setSubject("用户注册email");

        String  info = "恭喜您注册成功，你的用户名：" +user.getUserName()+" ,您的密码： "+user.getPassword()+"请妥善保管，如有问题请联系网站客服！！！";
        mimeMessage.setContent(info,"text/html;charset=utf-8");
        mimeMessage.saveChanges();
        return mimeMessage;
    }
}
class MyAuthenticator extends Authenticator{
    String userName="";
    String password="";
    public MyAuthenticator(){

    }
    public MyAuthenticator(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(userName, password);
    }
}