public class Harmonik {
    public static void calculate(int n){
        double arr[] = new double[n];
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for(int j = 0; j < arr.length; j++){
            sum  += 1 / arr[j];
        }
        double avarage = n / sum ;

        System.out.println("Avarage is : " + avarage);
    }
}
