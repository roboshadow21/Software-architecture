package Homework.task_2;

public class GoldGenerator extends ItemGenerator{

    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
