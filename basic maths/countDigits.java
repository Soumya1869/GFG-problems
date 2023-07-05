import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        int temp=num;
        while(num>0){
            int lastDigit=num%10;
            if(lastDigit==0){
                num=num/10;
                continue;
            }
            if(temp%lastDigit==0){
                count ++;
            }
            num=num/10;
        }
        System.out.print(count);
    }
}
