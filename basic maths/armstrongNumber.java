import java.util.*;
public class armstrongNumber {
    public static boolean ArmstrongNum(int n){
        int num =n;
        int count=0;
        int temp=n;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        int sumOfPow=0;
        while(n!=0){
            int digit=n%10;
            sumOfPow += Math.pow(digit,count);
            n/=10;
        }
        return (sumOfPow==num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(ArmstrongNum(number)){
            System.out.println("yes ,it is an armstrong number");
        }
        else{
            System.out.println("no , its not an armstrong number");
        }
    }
}
