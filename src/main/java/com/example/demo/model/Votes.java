package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Votes {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Vote_id;

    private String Party;//FK

    private int User_id;//FK

    public int getVote_id() {
        return Vote_id;
    }

    public void setVote_id(int vote_id) {
        Vote_id = vote_id;
    }

    public String getParty() {
        return Party;
    }

    public void setParty(String party) {
        Party = party;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }
}
