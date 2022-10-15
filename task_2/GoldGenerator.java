package Homework.task_2;

public class GoldGenerator extends ItemGenerator{

    /**
     * Класс создает объект класса GoldReward
     * @return - объект класса GoldReward
     */
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
