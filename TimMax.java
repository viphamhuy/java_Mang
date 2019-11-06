import java.util.Scanner;
public class TimMax {
    public static void main(String[] args) {
            int size;
            int[] array;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Nhap size: ");
                size = sc.nextInt();
                if(size>20){
                    System.out.println("size not >20");
                }
            }
            while (size>20);
            array = new int[size];
            int i=0;
            while (i<array.length){
                System.out.println("Nhap phan tu thu "+(i+1) +" :"  );
                array[i]=sc.nextInt();
                i++;
            }
        System.out.print("Danh sach cac phan tu trong mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
            int max = array[0];
            for(i=0;i<array.length;i++){
                if(array[i]>max)
                {
                    max=array[i];
                }
            }
        System.out.println("gia tri lon nhat trong mang la: "+max);
    }
}
