package Homework2.Work2;

import Homework2.CoffeeRobot;
import Homework2.RobotCooker;
import Homework2.RobotDancer;

public class Main2 {
    public static void main(String[] args) {
        Robot defaultRobot = new Robot();
        Robot coffeeRobot = new CoffeeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCooker();
        defaultRobot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();
    }
}
