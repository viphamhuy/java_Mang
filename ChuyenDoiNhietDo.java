import java.util.Scanner;
public class ChuyenDoiNhietDo {
    public static double C(double C){
        double F = (9.0/5)*C+32;
        return F;
    }

    public static double F(double F){
        double C = (5.0/9)*(F-32);
        return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter F: ");
                    F = sc.nextDouble();
                    System.out.println("F --> C : "+F(F));
                    break;
                case 2:
                    System.out.println("Enter C: ");
                    C = sc.nextDouble();
                    System.out.println("C --> F : "+C(C));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while(choice!=0);
    }
}
