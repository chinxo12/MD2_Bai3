public class Main {
    public static void main(String[] args) {
        int [] a = {1,3,4,5,12,3};
        int [] b = {123,12,512,21,35};
        int [] c = new int[a.length + b.length];
        int i;
        System.out.println("mang sau khi gop: ");
        for (i = 0; i < c.length; i++) {
            if (i<a.length){
                c[i]=a[i];
            }else {
                c[i]=b[i-a.length];
            }
            System.out.print(c[i] + "\t");
        }
    }
}