package comp1110.labtest1;

import java.util.Scanner;

public class BMI {
    private String name;
    private double height;
    private double weight;
    public BMI(String name, double height, double weight) {
        super();
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public double getBMI() {
        return (double)weight/Math.pow(height, 2);
    }
    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of "+getBMI()+"Kg/m^2";
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        double height=a.nextDouble();
        double weight = a.nextDouble();
        BMI bmi = new BMI(name,height,weight);
        System.out.println(bmi.toString());
    }
}
