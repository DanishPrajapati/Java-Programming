import java.util.Scanner;
public class Check_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        String[] st={"Even","Odd"};
        System.out.println("Entered number "+n+" is "+st[n%2]);
        sc.close();
    }
}
