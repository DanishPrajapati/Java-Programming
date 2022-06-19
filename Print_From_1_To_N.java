//WAP to take input from user and print it in ascending order
import java.util.Scanner;
public class Print_From_1_To_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }    
}
