import java.util.Scanner;

public class DemSoLuongSv {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap size: ");
            size = sc.nextInt();
            if(size>30){
                System.out.println("Not > 30!!");
            }
        }
        while (size>30);
        array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Diem sinh vien thu "+(i+1)+" :");
            array[i]=sc.nextInt();
        }
        int count =0;
        for(int j=0;j<array.length;j++){
            if(array[j]>=5&&array[j]<=10){
                count++;
            }
        }
        System.out.println("Co "+count+" ban du diem do.");
    }

}
