import java.util.Scanner;

public class bj1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] a = new int[T];
        int[] b = new int[T];
        for (int i = 0; i < T; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int j = 0; j < T; j++) {
            System.out.println(lastComputerNum(a[j], b[j]));
        }
        sc.close();
    }
    public static int lastComputerNum (int a, int b) {
        int lastDigit = a % 10;

        int[][] patterns = {{0}, {1}, {2,4,6,8}, {3,9,7,1}, {4,6}, {5}, {6}, {7,9,3,1}, {8,4,2,6},{9,1}};
        int[] cycle = patterns[lastDigit];
        int cycleLength = cycle.length;

        int index = (b-1) % cycleLength;
        int result = cycle[index];

        return result == 0? 10: result;
    }
}


