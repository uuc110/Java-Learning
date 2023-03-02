package Java_Basics;

import java.util.Scanner;

public class CashCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Its Lower Case");
        }else{
            System.out.println("Its upper Case");
        }
    }
}


