import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1,size2;
        int[] array1,array2,array3;
        System.out.println("Nhap size1: ");
        size1 = sc.nextInt();
        array1 = new int[size1];
        System.out.println("Nhap size2: ");
        size2 =  sc.nextInt();
        array2 = new int[size2];
        for(int i=0;i<array1.length;i++){
            System.out.println("Nhap phan tu mang1 thu "+(i+1)+" :");
            array1[i] = sc.nextInt();
        }
        for(int j=0;j<array2.length;j++){
            System.out.println("Nhap phan tu mang2 thu "+(j+1)+" :");
            array2[j] = sc.nextInt();
        }
        array3 = new int[size1+size2];
        for(int i=0;i<array1.length;i++)
        {
            array3[i]=array1[i];
        }
        for(int i=0;i<array2.length;i++)
        {
            array3[array1.length+i]=array2[i];
        }
        System.out.printf("Array3: ");
        for (int i=0;i<array3.length;i++){
            System.out.print(array3[i]+",");
        }

    }
}
