import java.util.Scanner;
public class sumof_N_naturalNum{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the last natural number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
    
    System.out.println("Sum of natural numbers is "+sum);
    }
}