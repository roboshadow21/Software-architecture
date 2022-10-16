package Homework.task_2;

public class ManaGenerator extends ItemGenerator{

    /**
     * Класс  наследник ItemGenerator. Создает объект класса ManaReward
     * @return - объект класса ManaReward
     */
    @Override
    public GameItem createItem() {
        return new ManaReward();
    }
}
