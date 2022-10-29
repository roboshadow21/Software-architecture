package Homework.Task_4;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Customer {
    int id;
    Ticket tickets;
    CashProvider cash;

    public boolean buyTicket(Ticket t) {
        return true;
    }

    public Ticket searchTicket(Date date, int num) {
        TicketProvider tp = new TicketProvider();
        tickets = tp.getTickets(tickets.rootNumber);
        return tickets;
    }
}
