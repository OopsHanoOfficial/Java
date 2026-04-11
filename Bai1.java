import java.util.Scanner;
public class Bai1 {
    static int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("UCLN: " + UCLN(a, b));
        System.out.println("BCNN: " + BCNN(a, b));
    }
}
