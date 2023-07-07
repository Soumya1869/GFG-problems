import java.util.Scanner;
public class fiboUsingRecursion {
    static int firstNum=0,secondNum=1,nextNum;
    public static void printFibo(int i){
         if(i>=1){
             nextNum=firstNum+secondNum;
             System.out.print(" "+nextNum);
             firstNum=secondNum;
             secondNum=nextNum;
             printFibo(i-1);
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(firstNum+" "+secondNum);
        printFibo(i);
    }
}