package org.example;

import java.text.DecimalFormat;
import java.util.*;

import static java.lang.Math.*;

/**
 * Muhammadsodiq Habibulloh
 */

public class Main1 {
    public static void main(String[] args) {




    }


    // 1000 A+B Problem
    private static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }

    // 1001. Reverse Root "shdbsbd sdhbvhjs hsjdhjs"

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


    // 1014. Product of Digits

    public static String productOfDigits(int n) {
//        if (checkTop(n)) return -1 + "";
        int end = n;
        int start = 1;
        int sum = 0;
        while (end * start != n) {
            for (start = 1; start <= end; start++) {
                sum = end * start;
                if (sum == n) break;
            }
            if (sum == n) break;
            end--;
        }
        int i = firstNumber(end);
        int i1 = firstNumber(start);
        if (i > i1) return start + "" + end;
        else return end + "" + start;
    }

    public static int firstNumber(int n) {
        int firstNum = 0;
        int qoldiq = 0;
        while (n != 0) {
            firstNum = n % 10;
            n /= 10;
            qoldiq = n % 10;
        }
        return firstNum;
    }

    public static boolean checkTop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum++;
        }
        if (sum == 2) return true;
        else return false;
    }

    public static long getQ(long n) {

        long nn = n;

        if (n == 0) return 10;
        else if (n == 1) return 1;
        else {
            long q = 0;
            int i = 0;

            for (int j = 9; j >= 2; j--)
                while (nn % j == 0) {
                    q += Math.pow(10, i) * j;
                    nn = nn / j;
                    i++;
                }
            if (nn == 1) {
                return q;
            } else {
                return -1;
            }

        }
    }

}
