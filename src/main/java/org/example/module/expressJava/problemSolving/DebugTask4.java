package org.example.module.expressJava.problemSolving;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Рак"));
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
