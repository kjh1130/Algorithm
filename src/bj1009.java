import java.util.Scanner;

public class bj1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();

        for (int i = 0; i < testcase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a;

            for (int j = 0; j < b - 1; j++) {
                a = (a % 10) * c;
            }

            if (a % 10 == 0) {
                System.out.println(10);
            } else {
                System.out.println(a % 10);
            }
        }

        scanner.close();
    }
}
