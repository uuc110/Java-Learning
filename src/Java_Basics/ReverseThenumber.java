package Java_Basics;

import java.util.Scanner;

public class ReverseThenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int temp = n;
        int reverse = 0;
        int rem;
        while(n != 0){
            rem = n%10;
            reverse = reverse*10 + rem;
            n /= 10;
        }
        System.out.println("Original : " + temp);
        System.out.println("Reverse: " + reverse);

    }
}
