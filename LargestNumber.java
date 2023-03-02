import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int largest;

        if(a >= b && a>= c){
            largest = a;
        } else if (b >= c) {
            largest = b;
        }else{
            largest = c;
        }

//       Using STL
        int max = Math.max(c, Math.max(a,b));


        System.out.println("Largest Number is: " + max);
    }
}
