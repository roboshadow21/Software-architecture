package Homework.task_2;

public class GemGenerator extends ItemGenerator{

    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
