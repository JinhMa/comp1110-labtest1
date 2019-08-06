package comp1110.labtest1;

import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float b = a.nextFloat();
        double c = b * 5.0;
        long d = Math.round(c);
        System.out.println(d);
    }
}
