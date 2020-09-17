package java8_package.extras_sums;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BigLongSum {
    static long aVeryBigSum(long[] ar) {
         long sum=0;

        for (long val : ar) {
            sum += val;
        }

        return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int arCount =100;

        long[] ar = new long[arCount];

        for(int i=0;i<arCount;i++)
            ar[i]=scanner.nextLong();

        long result = aVeryBigSum(ar);
        System.out.println(result);

    }
}
