import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end range:");
        int n=sc.nextInt();
        int x=0;
        int y=1;
        int z=0;
        for(int i=1;i<=n;i++){
            System.out.print(z+" ");
            x=y;
            y=z;
            z=x+y;
        }
        sc.close();
    }    
}
