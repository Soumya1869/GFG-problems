import java.util.Scanner;

public class printNto1 {
    public static void printNos(int i,int n){
        if(i<1)
            return;
        System.out.print(i+" ");
        //functon call to increment i
        printNos(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n,n);
    }
}
