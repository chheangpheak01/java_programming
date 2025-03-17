package oop.inheritance;

//component class
class Engin{
    public void speedUp(){
        System.out.println("Engin is speeding up");
    }
}
//composite class
class Car{
    private Engin engine;
    public Car(){
        this.engine = new Engin();
    }
    public void carSpeedingUp(){
        engine.speedUp();
    }
}

public class Has_a_relationship_OR_composite{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.carSpeedingUp();
    }
}
