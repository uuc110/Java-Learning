package Java_Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Occurance_checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        int target = in.nextInt();
        int count = 0;
        int rem;
        while(n!=0){
            rem = n%10;
            if (rem == target){
                count++;
            }
                n = n/10;
        }
        System.out.println("Number of Timer " + target + " found is " + count);
    }
}
