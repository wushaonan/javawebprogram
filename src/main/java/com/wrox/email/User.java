package com.wrox.email;

import javax.mail.PasswordAuthentication;

/**
 * Created by nan on 17-1-20.
 */
public class User {

    private String userName;

    private String password;

    private String email;

    public String getUserName() {
        return userName;
    }
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(userName, password);
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
