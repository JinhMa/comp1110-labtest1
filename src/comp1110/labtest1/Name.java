package comp1110.labtest1;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.nextLine().toUpperCase();
        int c = b.length();
        System.out.println(b);
        System.out.println(c);
    }
}
