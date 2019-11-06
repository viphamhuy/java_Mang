import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach cac phan tu cua mang: ");
        for(int i=0;i<100;i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n vui long nhap bat ki 1 phan tu: ");
        int x = sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số " + x + " o vi tri " + arr[x]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}
