public class B {
    public static void printB(){
        String[][] arr = new String[5][4];

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == 3){
                    arr[i][j] = "*";
                }
                else if(i == 0 || i == 2 || i == 4){
                    arr[i][j] = "*";
                }
                else{
                    arr[i][j] = " ";
                }
            }
            
        }
        for (String[] row : arr){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
