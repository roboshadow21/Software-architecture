package Homework.Task_4;

import java.sql.Time;
import java.time.format.DateTimeFormatterBuilder;
import java.util.TimeZone;
import java.time.Clock;
import java.util.Date;

public class TicketProvider {
    public Ticket getTickets(int rootNumber) {
        Ticket t = new Ticket();
        t.rootNumber = rootNumber;
        t.date = new Date();
        t.rootNumber += 1;
        return t;
    }

    public boolean updateTicketStatus(Ticket t) {
        return true;
    }
}
