import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        String s = "";
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (n > 0) {
            s = digits.charAt(n % b) + s;
            n /= b;
        }
        System.out.println(s);
    }
}
