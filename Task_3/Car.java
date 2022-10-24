package Homework.Task_3;

public abstract class Car {
    CarBrand carBrand;
    CarModel carModel;
    TypeCar bodyType;
    int numberWheels;
    BodyColor bodyColor;

    TypeCar typeCar;
    TypeFuel fuelType;
    TypeGearBox gearboxType;
    double engineCapacity;

    public void setCarBrand(CarBrand brand) {
        this.carBrand = brand;
    }
    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarModel(CarModel model) {
        this.carModel = model;
    }

        public void setBodyType(TypeCar bodyType){
            this.bodyType = bodyType;
        }
        public TypeCar getBodyType(){
            return bodyType;
        }

        public void setBodyColor(BodyColor color){
        this.bodyColor = color;
        }
        public BodyColor getBodyColor(){
        return bodyColor;
        }

        public void setNumberWheels(int numberWheels){
            this.numberWheels = numberWheels;
        }
        public int getNumberWheels(){
            return numberWheels;
        }

        public void setFuelType(TypeFuel fuelType){
            this.fuelType = fuelType;
        }
        public TypeFuel getFuelType(){
            return fuelType;
        }

        public void setGearboxType(TypeGearBox gearboxType){
            this.gearboxType = gearboxType;
        }
        public TypeGearBox getGearboxType(){
            return gearboxType;
        }

        public void setEngineCapacity(double engineCapacity){
            this.engineCapacity = engineCapacity;
        }
        public double getEngineCapacity(){
            return engineCapacity;
        }
//        public void move() {
//        System.out.println("Car move");
//        }
}
