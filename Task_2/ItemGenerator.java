package Homework.Task_2;

public abstract class ItemGenerator {

    /**
     * Абстрактный класс для генерации объектов
     */
    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();

    }
    public abstract GameItem createItem();
}
