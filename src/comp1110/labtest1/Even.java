package comp1110.labtest1;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for (int i=1;i<=n;i=i+1){
            if ((i%2)==0){
                System.out.println(i);
            }
        }
    }
}
