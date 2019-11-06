import java.util.Scanner;
public class TinhTongCot {
    void array(){
        int[][] arr;
        int width,height,cot;
        int tong =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        width = sc.nextInt();
        System.out.println("Nhap chieu cao: ");
        height = sc.nextInt();
        arr = new int[height][width];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("Nhap phan tu thu "+i+(j+0)+" :");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ban muon tinh tong cot nao: ");
        cot = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            tong += arr[i][cot-1];

        }
        System.out.println("tong cot "+cot+" :"+tong);
    }
    public static void main(String[] args) {
        TinhTongCot number = new TinhTongCot();
        number.array();

    }
}
