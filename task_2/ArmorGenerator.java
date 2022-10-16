package Homework.task_2;

public class ArmorGenerator extends ItemGenerator {

    /**
     * Класс  наследник ItemGenerator. Создает объект класса ArmorReward
     * @return - объект класса ArmorReward
     */
    @Override
    public GameItem createItem() {
        return new ArmorReward();
    }
}
