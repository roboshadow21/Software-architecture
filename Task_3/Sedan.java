package Homework.Task_3;

public class Sedan extends Car implements Refueling, Wiping {
    @Override
    public void fuel() {
        System.out.println("Fuel tank is full");

    }

    @Override
    public void wipeWindshield() {
        System.out.println("Windshield is clear");
    }

    @Override
    public void wipeFogLight() {
        System.out.println("FogLight is clear");

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {
        System.out.println("Head lights is clear");

    }

    @Override
    public void wipMirrors() {

    }
    Sedan cityCar = new Sedan();

    public void setCityCar(Sedan cityCar) {
        this.cityCar = cityCar;
    }

    @Override
    public void setEngineCapacity(double engineCapacity) {
        super.setEngineCapacity(engineCapacity);
        this.engineCapacity = 2000;
    }

}
