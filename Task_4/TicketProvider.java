package Homework.Task_4;

/**
 * Класс оператора, предоставляющего билеты
 */
public class TicketProvider {

    /**
    Проверка доступности билетов
     */
    public Ticket getTickets(int rootNumber) {
        Ticket t = new Ticket();
        t.rootNumber = rootNumber;
        return t;
    }

    public boolean updateTicketStatus(Ticket t) {
        return true;
    }

    /**
    Проверка достаточности денежных средств для оплаты
     */
    public boolean checkCash(Ticket t) {
        CashProvider cp = new CashProvider();
        Customer c = new Customer();
        cp.buy(t.price);
        return true;
    }
}
