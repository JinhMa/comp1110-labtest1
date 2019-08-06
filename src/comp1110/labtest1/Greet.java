package comp1110.labtest1;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        String greet = hi.next();
        System.out.println("Hi "+ greet+ "!");
    }
}
