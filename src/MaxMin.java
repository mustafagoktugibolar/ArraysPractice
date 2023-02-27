import java.util.Arrays;

public class MaxMin {
    public static void find(int n){
        int[] list = {15,12,788,1,-1,-778,2,0};

        int max = 0;
        int min = 0;

        Arrays.sort(list);
        //bigger
        // for (int i : list) {
        //     if(i <= n){
        //         continue;
        //     }
        //     else{
        //         bigger = i;
        //         break;
        //     }   
        // }

        for (int i  = 0; i < list.length; i++){
            if (n < list[i]){
                max  = list[i];
                min = list[i-1];
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);
        


    }
}
