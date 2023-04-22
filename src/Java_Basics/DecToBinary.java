package Java_Basics;

import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be converted =>");
        int n = sc.nextInt();
        int rem =0; // -10^9 -> 10^9
        int ans = 1;
        System.out.println("Division by 2 | Quotient | Remainder");
        while(n !=1 || n == 0){
            rem = n%2;
            ans = ans*10 + rem;
        System.out.print( "   (" + n + ")/2 ");
            n /= 2;
        System.out.println( "   | " + n + "         |  " + rem);
        }
        System.out.println(ans);

    }
}
