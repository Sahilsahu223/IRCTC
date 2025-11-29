package com.IRCTC.entities;

import java.util.List;

public class User {
    private String Name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticket_booked;
    private String userid;
}
