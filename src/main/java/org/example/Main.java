package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Muhammadsodiq Habibulloh
 */

public class Main {
    public static void main(String[] args) {
        reverseRoot(" 23  2 3     32  54    5 56   76    76 " +
                "43 34  3 5   34  0   3412354567");
    }



    // 1000 A+B Problem
    public static void calculate(int a, int b) {
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
}