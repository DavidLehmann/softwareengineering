package de.dhbw.softwareengineering.model;

public class User {
    private String name;
    private String email; //TODO to long
    private long regist_date;
    private String password;
    //TODO: Pic, friends, ....


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getRegist_date() {
        return regist_date;
    }

    public void setRegist_date(long regist_date) {
        this.regist_date = regist_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
