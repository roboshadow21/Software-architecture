package Homework.task_2;

public class GoldGenerator extends ItemGenerator{

    /**
     * Класс - наследник ItemGenerator. Создает объект класса GoldReward
     * @return - объект класса GoldReward
     */
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
