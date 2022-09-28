import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi");
        String txt = scanner.nextLine();
        System.out.println("Nhap ky tu can kiem tra");
        char x = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0 ;i<txt.length();i++){
            if (x==txt.charAt(i)){
                count++;
            }
        }
        System.out.println("So lan xuat hien ky tu "+ "'" + x + "'" + " là: " + count);
    }
}