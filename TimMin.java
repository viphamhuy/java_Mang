import java.util.Scanner;
public class TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Nhap size: ");
        size = sc.nextInt();
        array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Phan tu thu "+(i+1)+" :");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("So nho nhat trong mang: " + min);
    }
}
