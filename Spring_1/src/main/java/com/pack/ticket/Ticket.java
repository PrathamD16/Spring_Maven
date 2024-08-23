package com.pack.ticket;

public class Ticket {
    private int id;
    private String date;

    public Ticket(int id, String date){
        this.id = id;
        this.date = date;
    }

    public Ticket(int id){
        this.id = id;
    }

    public Ticket(String date){
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }
}
