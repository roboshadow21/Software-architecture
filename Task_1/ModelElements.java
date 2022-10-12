package Homework.Task_1;

public class ModelElements {

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

    class PoligonalModel {
        public Poligon poligons;
        public Texture texture;
    }

    class Flash {
        public Point3D location;
        public Angle3D angle;
        public Color color;
        public Float power;

        public void Rotate(Angle3D a) {

        }
        public void Move(Point3D p) {

        }
    }

    class Camera {
        public Point3D location;
        public Angle3D angle;

        public void Rotate(Angle3D a) {

        }
        public void Move(Point3D p) {

        }
    }
    class Texture {

    }
    class Poligon {

        public Point3D points;
    }
}
