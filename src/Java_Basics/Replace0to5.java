package Java_Basics;

import java.util.Scanner;

public class Replace0to5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long rem;
        long pow = 1;
        long ans = 0;
        while(num >=0 ){
            if(num == 0){
                num = 5;
                break;
            }
            rem = num%10;
            if(rem == 0){
                rem = 5;
            }
            ans = rem * pow + ans;
            num /= 10;
            pow *= 10;
        }
        System.out.println(ans);
    }
}
