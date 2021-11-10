package by.overone.lesson22;

public class Car {
    public int yearModel;
    public String make;
    public int speed;
    public int number;
    public double engine;


    public Car(int yearModel, String make, int speed, int number, double engine) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
        this.number = number;
        this.engine = engine;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearModel=" + yearModel +
                ", make='" + make + '\'' +
                ", speed=" + speed +
                ", number=" + number +
                ", engine=" + engine +
                '}';
    }
}
