package Homework.task_2;

public abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();

    }
    public abstract GameItem createItem();
}
