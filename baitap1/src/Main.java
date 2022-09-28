import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,n,c=0,i;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vào số phần tử của mảng");
             n = scanner.nextInt();
        }while (n<=0);
            int A[] = new int[n];
        System.out.println("Nhập các phần tử trong mảng");
        for (i=0;i<n;i++){
            System.out.println("Nhap cac phần tử " + (i +1) + ": ");
            A[i]= scanner.nextInt();
        }
        System.out.println("Nhap so nguyen can tìm: ");
        a = scanner.nextInt();
        for ( i=0;i< A.length;i++) {
            if (A[i] != a) {
                A[c] = A[i];
                c++;
            }
        }
        n=c;

        System.out.println("Mang con lại sau khi xóa phẩn tu " +a +" là: ");
        for (i=0;i<n;i++){
            System.out.print(A[i] + "\t");
        }
        System.out.println("so phan tu sau khi xóa" + n);
    }
}