import java.util.Scanner;
public class DemKiTu {
    public static void main(String[] args) {
        String str ="aabcddabc";
        String value = "a";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==value.charAt(0)){
                count++;
            }
        }
        System.out.println("So lan xuat hien: "+count);
    }
}
