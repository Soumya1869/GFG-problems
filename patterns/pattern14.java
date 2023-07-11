import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(char i='A';i<'A'+n;i++){
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
