package Homework.task_2;

public class WeaponGenerator extends ItemGenerator {


    @Override
    public GameItem createItem() {
        return new WeaponReward();
    }
}
