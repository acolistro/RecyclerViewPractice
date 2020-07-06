package com.fes.ui_exercise1.model;
//creating a model class


public class User {
    String name, ni, passport, gender, bdate;

    public User(String name, String ni, String passport, String gender, String bdate) {
        this.name = name;
        this.ni = ni;
        this.passport = passport;
        this.gender = gender;
        this.bdate = bdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }
}
