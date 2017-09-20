package com.mazbah.Entity;

public class Doctor{
    private int id;
    private String name;
    private String email;
    private String speciality;

    public Doctor(int id, String name, String email, String speciality) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
    }

    public Doctor(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

