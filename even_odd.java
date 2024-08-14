import java.util.Scanner;
public class  even_odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number ,choice;
        int even_sum =0;
        int odd_sum =0;
        do {
            System.out.println("Enter the number :");
            number = sc.nextInt();
            if(number%2==0){
                even_sum = even_sum + number;
            }
            else{
                odd_sum = odd_sum + number;

            }
            System.out.println("do you want to continue");
        choice = sc.nextInt();
        }
        while(choice==1);
        System.out.println("sum of even numbers is "+ + even_sum);
        System.out.println("sum of odd numbers is "+ +odd_sum);
    }
}