import java.util.Scanner;

public class bj1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextInt();
        double B = scanner.nextInt();
        scanner.close();

        System.out.println(A / B);
    }
}