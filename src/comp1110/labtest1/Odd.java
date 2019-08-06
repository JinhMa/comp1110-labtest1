package comp1110.labtest1;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int i){
        if (i%2==1||i%2==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (isOdd(b)){
            System.out.println(b + " is odd");
        }
        else{
            System.out.println(b+" is even");
        }
    }
}
