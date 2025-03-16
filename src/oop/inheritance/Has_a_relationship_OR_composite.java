package oop.inheritance;

class Engine{
    public void speedUp(){
        System.out.println("Engine is speeding up");
    }
}
class Car{
    private Engine engine;
    public Car(){
        this.engine = new Engine();
    }
    public void carSpeedUp(){
        engine.speedUp();
    }
}
public class Has_a_relationship_OR_composite{
    public static void main(String[] args) {
        Car car = new Car();
        car.carSpeedUp();
    }
}
