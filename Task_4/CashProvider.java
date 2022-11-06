package Homework.Task_4;

/**
 * Класс содержит поля и методы для финансовых операций
 */
public class CashProvider {
    long card;
    boolean isAuthorization;

/**
Метод для покупки билета
 */
    public void buy(int price) {
        TicketProvider tp = new TicketProvider();
        Ticket t = new Ticket();
        t.price = price;
        tp.updateTicketStatus(t);
        System.out.println("Transaction successful");

    }
    /**
    Метод для проверки авторизации перед транзакцией
     */
    public void authorization(Customer c) {

        System.out.println("Card is valid");

    }


}
