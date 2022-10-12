package Homework.Task_1;

public interface IModelChanger {
    public default void NotifyChange(IModelChanger sender) {

    }
}
