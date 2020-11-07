package FlippingBits;

import java.util.Scanner;

public class FlippingBits {

    static long flippingBits(long n) {
        return ~n & 0xffffffffL;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            long result = flippingBits(n);
            System.out.println(result);
        }
        scanner.close();
    }
}