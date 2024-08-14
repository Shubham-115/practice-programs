import java.util.Scanner;
public class reverseOfNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the value of n");
    while(n>0){
        int lastDigit=n%10;
        System.out.print(lastDigit);
        n/=10;
    }    }
    
}