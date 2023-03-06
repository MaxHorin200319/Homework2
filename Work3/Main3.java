package Homework2.Work3;

public class Main3{
    public static void main(String[] args) {
        SteeringWheel sw = new SteeringWheel(31.7, "гума");
        Wheel wheel = new Wheel(150, "шосейні");
        Body body = new Body("чорний");
        Car car = new Car(500, 4, sw, wheel, body);

        System.out.println(car);

        car.setEnginePower(1200);
        car.setNumberOfDoors(2);
        sw.setDiameter(sw.halfSteeringWheelDiameter());
        sw.setMaterial("шкіра");
        wheel.setWheelSize(wheel.wheelSizeEnlarge(10));
        wheel.setTyreType("універсальні");
        body.setColor("білий");

        System.out.println(car);
    }

}
