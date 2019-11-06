import java.util.Scanner;

public class TinhDuongCheo {
    void array(){
        int size;
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size: ");
        size = sc.nextInt();
        arr = new int[size][size] ;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("Nhap phan tu thu "+i+(j+0)+" :");
                arr[i][j] = sc.nextInt();
            }
        }
        int tong=0;
        for(int i=0;i<arr.length;i++){
            tong +=arr[i][i];
        }
        System.out.println("Tong duong cheo: "+tong);
    }

    public static void main(String[] args) {
        TinhDuongCheo arr = new TinhDuongCheo();
        arr.array();

    }
}
