package Homework.Task_2;

public class GemGenerator extends ItemGenerator{

    /**
     * Класс  наследник ItemGenerator. Создает объект класса GemReward
     * @return - объект класса GemReward
     */
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
