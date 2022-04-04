package com.example.bugtracker.model;

public class User {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;

    public User(){};

    public User(String fn, String ln, String email, String pw){
        this.setFirstName(fn);
        this.setLastName(ln);
        this.setEmail(email);
        this.setPassword(pw);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

}
