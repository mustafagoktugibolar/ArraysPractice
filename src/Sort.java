
import java.util.Scanner;

public class Sort {
    public static void sort(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Element Number : ");
        int element = sc.nextInt();

        int arr[] = new int[element];

        for (int i = 0; i < element; i++) {
            System.out.print(i + 1 + ". number : ");
            arr[i] = sc.nextInt();
        }   

        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if(arr[j] > arr[k]){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int j : arr) {
                System.out.println(j);
        }

        //ALTERNATIVE

        //Arrays.sort(arr);

        // for (int j : arr) { 
        //     System.out.println(j); 
        // }        
    }
}
