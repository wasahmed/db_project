package com.example.demo.model;

import com.example.demo.controller.*;
import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer User_Id;

    private String Firstname;

    private String Surname;

    private String Id_Number;

    private String Gender;

    private String Race;

    private String Province;

    public Integer getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(Integer id) {
        this.User_Id = User_Id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String name) {
        this.Firstname = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String name) {
        this.Surname = name;
    }

    public String getId_Number() {
        return Id_Number;
    }

    public void setId_Number(String Id_Number) {
        this.Id_Number = Id_Number;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        this.Race = race;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        this.Province = province;
    }

}
