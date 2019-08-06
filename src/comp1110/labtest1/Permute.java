package comp1110.labtest1;

import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    public static boolean isPermute(String str1,String str2){
        int len1 = str1.length(), len2 = str2.length();
        if (len1 != len2)
            return false;
        char ch1[] = str1.toCharArray(),ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int flag = 0;
        for (int i = 0;i<len1;i++){
            if (ch1[i] != ch2[i]){
                flag = 1;
            }
        }
        if (flag==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str1 = scann.nextLine();
        String str2 = scann.nextLine();
        if (isPermute(str1,str2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}