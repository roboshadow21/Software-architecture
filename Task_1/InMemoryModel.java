package Homework.Task_1;

import Homework.Task_1.ModelElements.Scene;
import Homework.Task_1.ModelElements.PoligonalModel;
import Homework.Task_1.ModelElements.Flash;
import Homework.Task_1.ModelElements.Camera;

public class InMemoryModel {

    public class ModelStore implements IModelChanger {
        public PoligonalModel models;
        public Scene scenes;
        public Flash flashes;
        public Camera cameras;

        public Scene getScene(int p) {
            Scene scenOne = new Scene();
            return scenOne;

        }
        public void NotifyChange(IModelChanger x) {

        }


    }

}
