package com.example.demo.model;
import javax.persistence.*;

@Entity
public class Parties {
    @Id
    private int Party;

    private int NumberOfVotes;

    private int NumberOfSeats;

    public int getParty() {
        return Party;
    }

    public void setParty(int party) {
        Party = party;
    }

    public int getNumberOfVotes() {
        return NumberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        NumberOfVotes = numberOfVotes;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }
}
