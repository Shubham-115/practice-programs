import java.util.*;
public class practice{

//     public static int indices(int arr[], int target){
//         int sum=0;
//         int ind[];
//         for(int i=0;i<arr.length-1){
//            if(sum == target){
            
//             System.out.print()
//            } 
//         }
//     }
//     public static void main(String [] args){
// int arr[] = {9,5,1,7,9};
// for(int i=0;i<arr.length-1;i++){
//     for(int j=1;j<arr.length-1;j++){
//         if(arr[i]+arr[j] == 9){
//             System.out.print(i+" "+j);
//         }
//     }
// }    
//     }
// }


// reverse the singly linkedlist

//  function to get the largest value of an array

public static int getLargest(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    return largest;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");

    int n=sc.nextInt();
    int arr[] = new int[n];
    
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");5
    
 //}5
 
    // call the largest function
      System.out.print("the largest value of an  array is "+(getLargest(arr)));
}


}