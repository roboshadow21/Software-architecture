package Homework.Task_1;

public interface IModelChanger {
    default void NotifyChange(IModelChanger sender) {

    }
}
