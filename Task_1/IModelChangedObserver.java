package Homework.Task_1;

/**
 * Интерфейс отслеживающий изменения модели
 */

public interface IModelChangedObserver {
    default void ApplyUpdateModel() {

    }
}
