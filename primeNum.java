import java.util.Scanner;
public class primeNum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        /* boolean isprime= true;
        for(int i=2;i<n-1;i++){
            if (n%i==0){
                isprime=false;
            }
            }
            if(isprime==true){
                System.out.println("the number is  a prime number");
            }
            
            else{
                System.out.println("the number is not a prime number");
            }
            
    }  
    }*/
    boolean isprime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            isprime=false;
        }
        }
        if(isprime==true){
            System.out.println("the number is a prime number");
        }
        else{
        System.out.println("the number is not a prime number ");
    }
    }
}
