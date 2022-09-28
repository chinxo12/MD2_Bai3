import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j;
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
        int max = main[0][0];
        int min = main[0][0];
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                if (main[i][j]>max){
                    max = main[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                if (main[i][j]<min){
                    min = main[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

    }
}