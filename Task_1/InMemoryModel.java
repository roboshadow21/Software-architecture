package Homework.Task_1;

import Homework.Task_1.ModelElements.Scene;
import Homework.Task_1.ModelElements.PoligonalModel;
import Homework.Task_1.ModelElements.Flash;
import Homework.Task_1.ModelElements.Camera;

public class InMemoryModel {

    /**
     * Основной класс, включающий классы Полигональная модель, Сцена, Свет, Камера
     * и интерфейс обновляющий модель
     */
    public class ModelStore {
        public PoligonalModel models;
        public Scene scenes;
        public Flash flashes;
        public Camera cameras;
        private IModelChangedObserver changeObservers;

        /**
         * Метод создает объект класса Сцена
         * @param p - целое число
         * @return - возвращает объект класса Сцена
         */

        public Scene getScena(int p) {
            Scene scenOne = new Scene();
            return scenOne;

        }

        /**
         * Метод интерфейса отслеживающий изменения модели
         * @param x - объект IModelChanger
         */
        public void NotifyChange(IModelChanger x) {

        }


    }

}
