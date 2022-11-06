package Homework.Task_4;

import java.util.Date;

/**
 * Класс содержит методы поиска билетов и валидации данных пользователя
 */

public class Customer {
    int id;
    Ticket tickets;
    CashProvider cash;

    public boolean buyTicket(Ticket t) {
        return true;
    }

    /**
    Метод поиска билетов
     */
    public Ticket searchTicket(Date date, int num) {
        TicketProvider tp = new TicketProvider();
        Ticket t;
        t = tp.getTickets(num);
        if (t.isValid) {
            t.date = date;
        }
        else {
            System.out.println("Not available");
        }
        return t;
    }

    /**
    Метод проверки данных пользователя и банковской карты
     */
    public void validateCard(long card, Customer id) {
        CashProvider cp = new CashProvider();
        cp.card = card;
        if (cp.isAuthorization) {
            cp.authorization(id);
        }
        else {
            System.out.println("Transaction denied");
        }

    }

}
