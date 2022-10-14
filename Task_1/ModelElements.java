package Homework.Task_1;

public class ModelElements {

    /**
     * Класс содержащий поля Светб Полигональная модель и методы, возвращающие типы
     */

    class Scene {
        public int id;
        public PoligonalModel models;
        public Flash flashes;

        public Type method1(Type t) {
            return t;
        }
        public Type method2(Type t1, Type t2) {
            return t1;
        }
    }

    /**
     * Класс Полигональная модель
     */
    class PoligonalModel {
        public Poligon poligons;
        public Texture texture;
    }

    /**
     * Класс Свет
     */
    class Flash {
        public Point3D location;
        public Angle3D angle;
        public Color color;
        public Float power;

        /**
         * Метод поворота объекта 3D
         * @param a
         */

        public void Rotate(Angle3D a) {

        }

        /**
         * Метод перемещения объекта 3D
         * @param p
         */
        public void Move(Point3D p) {

        }
    }

    /**
     * Класс Камера
     */
    class Camera {
        public Point3D location;
        public Angle3D angle;

        public void Rotate(Angle3D a) {

        }
        public void Move(Point3D p) {

        }
    }

    /**
     * Класс Текстура
     */
    class Texture {

    }

    /**
     * Класс Полигон
     */
    class Poligon {

        public Point3D points;
    }
}
