import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        int n1;
        int n2;
        Scanner sc= new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                       System.out.println(n1+n2);
                       break;
            case '-':
                      System.out.println(n1-n2);
                       break;
            case '*':
                System.out.println(n1*n2);
                       break;
            case '/':
                System.out.println(n1/n2);
                       break;
            case '%':
                System.out.println(n1%n2);
                       break;
            default :
            System.out.println("invalid input");
        }

    }
}