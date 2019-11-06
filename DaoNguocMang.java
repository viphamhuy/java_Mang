import java.util.Scanner;
public class DaoNguocMang {
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
        for(int j=0;j<array.length/2;j++){
            int temp = array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.printf("Mang dao nguoc la: ");
        for (int j=0;j<array.length;j++)
        {
            System.out.printf(array[j]+"\t");
        }

    }
}
