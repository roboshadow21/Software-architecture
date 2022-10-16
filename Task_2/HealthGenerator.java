package Homework.Task_2;

public class HealthGenerator extends ItemGenerator{

    /**
     * Класс - наследник ItemGenerator. Создает объект класса HealthReward
     * @return - объект класса HealthReward
     */
    @Override
    public GameItem createItem() {
        return new HealthReward();
    }
}
