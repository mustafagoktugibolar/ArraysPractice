public class Repeat {
    public static void find(){
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length; k++){
                if(arr[i] == arr[k]){
                    if(k < i){
                        break;
                    }
                    count++;
                }
            }
            if(count > 0){
                System.out.println(arr[i] + " is repeated  "+ count + " times.");
                count = 0;
            }
        }
    }
}
