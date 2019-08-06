package comp1110.labtest1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int grade = a.nextInt();
        int b = grade / 10;
        switch (b){
            case 5:
                System.out.println("P" );
                break;
            case 6:
                System.out.println("C" );
                break;
            case 7:
                System.out.println("D");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("HD");
                break;
                case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                    System.out.println("N");
                    break;
                    default:
                        System.out.println("Bad mark");
        }
    }
}
