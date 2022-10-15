package Homework.task_2;

public class GemGenerator extends ItemGenerator{

    /**
     * Класс создает объект класса GemReward
     * @return - объект класса GemReward
     */
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
