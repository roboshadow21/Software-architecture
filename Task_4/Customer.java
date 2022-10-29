package Homework.Task_4;

import java.sql.Time;
import java.util.Date;

public class Customer {
    int id;
    Ticket tickets;
    CashProvider cash;

    public boolean buyTicket(Ticket t) {
        return true;
    }

    public Ticket searchTicket(Date date, Time time, int num) {
        return tickets;
    }
}
