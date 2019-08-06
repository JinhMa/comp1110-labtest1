package comp1110.labtest1;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int runningTime = scan.nextInt();
        int hours = runningTime/60;
        int mins = runningTime % 60;
        System.out.printf("%s runs for ", movieName);
        if(hours == 1)
            System.out.printf("%d hour", hours);
        if(hours > 1)
            System.out.printf("%d hours", hours);
        if(hours != 0 && mins != 0)
            System.out.printf(" and ");
        if(mins == 1)
            System.out.printf("%d minute", mins);
        if(mins > 1)
            System.out.printf("%d minutes", mins);
        System.out.println();
    }
}
