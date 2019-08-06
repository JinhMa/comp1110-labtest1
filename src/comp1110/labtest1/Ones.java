package comp1110.labtest1;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b>=0){
            String c = Integer.toBinaryString(b);
            String d = c.replaceAll("1","");
            int len1 = c.length();
            int len2 = d.length();
            System.out.println(len1-len2);
        }
    }
}
