package Homework.Task_4;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Customer c = new Customer();
        Ticket t = new Ticket();
        Date date = new Date();
        c.searchTicket(date, 1);
        c.validateCard(999999999, c);
        c.buyTicket(t);

    }
}
