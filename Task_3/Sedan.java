package Homework.Task_3;

public class Sedan extends Car implements Refueling, Wiping {
    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

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
    }
}
