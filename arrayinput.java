import java.util.Scanner;

public class arrayinput {
    static Scanner scn =new Scanner(System.in);
    public static void main(String[] args) {
        int [] array=takearray();
        display(array);
        
    }
    public static int[] takearray() 
        {
        int n=scn.nextInt();
        int arr[]=new int [n];  
        for(int i=0;i<=n-1;i++){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
    public static void display(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
