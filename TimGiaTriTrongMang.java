import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten muon tim: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i=0;i<students.length;i++){
            if(students[i].equals(input_name)){
                System.out.println(input_name+" is "+(i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
        {
            System.out.println("khong co ten trong danh sach");
        }
    }
}
