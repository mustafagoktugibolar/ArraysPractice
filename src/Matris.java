import java.util.Scanner;

public class Matris {
    public static void find(int a, int b){

        int arr[][] = new int[a][b];
        int arr2[][] = new int [b][a];

        Scanner sc = new Scanner(System.in);


        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                System.out.print(k + ". row " + l + ". column : ");
                int input = sc.nextInt();
                arr[k][l] = input;
                arr2[l][k] = input;
                
            }
        }
        sc.close();

        for (int[] is : arr2) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
        
    }
}
