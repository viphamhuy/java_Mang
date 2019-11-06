import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Them phan tu: ");
        int X = sc.nextInt();
        System.out.println("Vao vi tri: ");
        int index = sc.nextInt();
        int[] array = new int[10];
        if (index < 0 || index > array.length - 1) {
            System.out.println("Khong them dc");
        } else {
            array[index] = X;
            System.out.println("vi tri " + index + "la" + X);
        }

    }
}

