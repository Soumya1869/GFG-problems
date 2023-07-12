import java.util.Scanner;

public class pattern16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(char i='A';i<'A'+n;i++){
            for(char j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
input: 5
output:
A
BB
CCC
DDDD
EEEEE
 */