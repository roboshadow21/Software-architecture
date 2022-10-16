package Homework.Task_2;

public class SwordGenerator extends ItemGenerator {

    /**
     * Класс  наследник ItemGenerator. Создает объект класса SwordReward.
     * @return - объект класса SwordReward
     */
    @Override
    public GameItem createItem() {
        return new SwordReward();
    }
}
