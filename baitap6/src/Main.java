import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,sumCol = 0,sumCheoChinh=0;
        System.out.println("Nhap số lượng mảng con");
        int row = scanner.nextInt();
        System.out.println("Nhap so luong phan tử trong mang con");
        int col = scanner.nextInt();
        int [][] main  = new int[row][col];
        System.out.println("NHAP GIA TRI CUA mảng");
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                main[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Nhập cột cần tính tổng");
        int cot = scanner.nextInt();
        if (cot>col|| cot<0){
            System.err.println("Vui lòng nhập lại dữ liệu");
            System.out.println("Nhập cột cần tính tổng");
            cot = scanner.nextInt();
        }else {
            for ( i = 0; i < row; i++) {
                for ( j = 0; j < col; j++) {
                   if (cot==j){
                       sumCol += main[i][j];
                   }
                }
            }
            System.out.println("Tong của cột " + cot + " là: " + sumCol);
        }
        if (row==cot){
            for ( i = 0; i < row; i++) {
                for ( j = 0; j < col; j++) {
                    if (i==j){
                        sumCheoChinh += main[i][j];
                    }3
                }
            }
            System.out.println("Tong của đường chéo chính  là: " + sumCheoChinh);
        }
    }
}