package Homework.task_2;

public class BowGenerator extends ItemGenerator{

    /**
     * Класс  наследник ItemGenerator. Создает объект класса BowReward
     * @return - объект класса BowReward
     */

    @Override
    public GameItem createItem() {
        return new BowReward();
    }
}
