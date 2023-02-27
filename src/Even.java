import java.util.ArrayList;

public class Even {
    public static void find(){
        int[] arr = {1,2,124,1,23,4,32,126,3};
        ArrayList<Integer> arr1 = new ArrayList<>(); 

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr1.add(arr[i]);
            }
        }
        for (Integer integer : arr1) {
            System.out.println(integer);
        }
    }
}
