package Homework2.Work1;

public class Rectangle {
    double side1,side2;
    public Rectangle(){}
    public double areaCalculator(double num1,double num2){
        side1 = (num1 * num2);
        return side1;
    }
    public double perimeterCalculator(double num1,double num2){
        side2 = (num1 + num2 + num1 + num2);
        return side2;
    }

    public void viewResult(){
        System.out.println("Площа прямокутника = "+side1+ "см");
        System.out.println("Периметр прямокутника = "+side2+ "см");
    }
}

