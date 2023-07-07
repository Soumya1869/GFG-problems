import java.util.Scanner;

public class firstNnaturalNosUsingRecursion {
     public static void printSum(int i,int sum) {
     if(i<1){
         System.out.println(sum);
         return ;
     }
         printSum(i-1,sum+i);
     }
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         printSum(n,0);
     }



}


