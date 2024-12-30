
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n=sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int sum =0;
        for ( int i = 2; i < j; i++) {
            if(j%i==0)
            {
                sum = sum + i;
            }    
        }
        if(sum>0)
        {
            // System.out.println(j + " is NOT a Prime Number");
        }
        else if(sum==0){
            System.out.println(j + " is a Prime Number");
        }
    }
}
}