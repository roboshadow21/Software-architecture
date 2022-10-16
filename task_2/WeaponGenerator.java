package Homework.task_2;

public class WeaponGenerator extends ItemGenerator {

    /**
     * Класс  наследник ItemGenerator. Создает объект класса WeaponReward.
     * @return - объект класса WeaponReward
     */
    @Override
    public GameItem createItem() {
        return new WeaponReward();
    }
}
