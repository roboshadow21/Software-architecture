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
        Customer c = new Customer();
        TicketProvider tp = new TicketProvider();
        CashProvider cp = new CashProvider();
        cp.authorization(c);
        if (cp.isAuthorization) {
            cp.buy(tickets.price);
            tickets = tp.getTickets(1);
        }

        return tickets;
    }
}
