//WAP to take input from the user and print it in descending order
import java.util.Scanner;
public class Print_From_N_To_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int n=sc.nextInt();
        while(n>0){
            System.out.print(n+" ");
            n--;
            sc.close();
        }
    }    
}
