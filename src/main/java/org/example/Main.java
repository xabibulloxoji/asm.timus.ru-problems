package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    }


    // 1083 Factorial
    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String trim = input.trim();
        String[] s = trim.split(" ");
        int sum = 1;
        int num = Integer.parseInt(s[0]);
        int length = s[1].length();
        for (int i = num; i >= 1; i -= length) {
            sum *= i;
        }
        System.out.println(sum);
    }


    // 1063 Sum
    private static void sum() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 1;
        if (input >= 1) {
            for (int i = 2; i <= input; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= input; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
    }


    // 1073 Square Country
    private static void squareCountry() {
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        int dp[] = new int[60001];
        dp[0] = 0;

        for (int i = 1; i <= N; ++i) {
            dp[i] = i + 1;

            for (int j = 1; j * j <= i; ++j)
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
        }

        System.out.printf("%d\n", dp[N]);
        ;
    }

    // 1001 Reverse Root

    private static void reverseRoot() {
        Scanner sc = new Scanner(System.in);
        double[] roots = new double[256 * 1000];
        int k = 0;

        while (sc.hasNextLong()) {
            roots[k++] = sqrt(sc.nextLong());
        }

        for (int i = k - 1; i >= 0; i--)
            System.out.printf("%.4f\n", roots[i]);
    }


    // 1001 Reverse Root
    public static void reverseRoot(String input) {
        String trim = input.trim();
        String[] s = trim.split(" ");
        List<String> res = new ArrayList<>();

        for (String s1 : s) {
            if (!s1.equals("")) {
                res.add(s1);
            }
        }

        for (int i = res.size() - 1; i >= 0; i--) {
            if (Double.parseDouble(res.get(i)) == 0) System.out.println("0.0000");
            else {
                double sqrt = sqrt(Long.parseLong(res.get(i)));
                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                System.out.println(decimalFormat.format(sqrt));
            }
        }

    }

}

