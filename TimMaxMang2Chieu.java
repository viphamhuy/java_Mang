

public class TimMaxMang2Chieu{
    public static void main(String[] args) {
        int[][] array = {{3,11,7},{2,4,6},{8,9,10}};
        int max = array[0][0];
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
            {
                if(array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("max = "+max);
    }


}