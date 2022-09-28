import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] ss = new int[n + 1];
        for (i = 0; i < n; i++) {
            System.out.println("Nhap cac phan tu cua mang" + (i + 1));
            a[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần thêm: ");
        int b = scanner.nextInt();
        System.out.println("Nhap vao vị trí can them");
        x = scanner.nextInt();

        if (x < 0 || x > n) {
            System.err.println("vui lòng nhap tu 0 - " + n);
            System.out.println("Nhap vao vị trí can them");
            x = scanner.nextInt();
        }
            System.out.println("mang sau khi them ");
            for (i = 0; i < n + 1; i++) {
                if (i < x) {
                    ss[i] = a[i];
                } else if (i == x) {
                    ss[i] = b;
                } else {
                    ss[i] = a[i - 1];
                }
                System.out.print(ss[i] + "\t");
            }

    }
}