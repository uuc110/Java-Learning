package Java_Basics;

public class StariCase {
    public static void main(String[] args) {
        int n = 2;
        if(n==1) System.out.println(1);
        int counter = n;
        for(int i=1; i<= n;i++){
            counter = counter -i;
            if(counter < 0){
                System.out.println(i-1);
                break;
            }
        }
    }
}
