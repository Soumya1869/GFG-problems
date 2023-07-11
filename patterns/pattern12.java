import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
                //left nos
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                //spaces
                for (int k = i*2;k<n*2; k++) {
                    System.out.print("  ");  //two spaces
                }
                //right nos
                for (int j = i; j >= 1; j--) {
                    System.out.print(j+" ");
                }
                System.out.println();
        }
    }
}
/*
input: 5
output:

1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

 */