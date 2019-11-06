import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        int X = 3;
        int index =0;
        for(int i =0;i<array.length;i++){
            if(array[i]!=X){
                index++;
            }
            else {
                System.out.println("Vi tri cua X=3 la: "+index);
            }
        }
        for(index=2;index<array.length-1;index++){
            array[index]=array[index+1];
        }
        System.out.printf("Mang da xoa X: ");
        for (int i=0;i<array.length-1;i++){
            System.out.printf(array[i]+",");
        }
    }
}
