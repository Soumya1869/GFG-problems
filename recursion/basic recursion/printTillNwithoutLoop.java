import java.util.Scanner;

public class printTillNwithoutLoop {
    static int a=1;
    public static void printNos(int num){
        if(num>0){
            System.out.print(a+" ");
            a++;
            printNos(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNos(num);
    }
}
