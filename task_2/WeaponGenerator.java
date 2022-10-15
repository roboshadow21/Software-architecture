package Homework.task_2;

public class WeaponGenerator extends ItemGenerator {

    /**
     * Класс создает объект класса WeaponReward
     * @return - объект класса WeaponReward
     */
    @Override
    public GameItem createItem() {
        return new WeaponReward();
    }
}
