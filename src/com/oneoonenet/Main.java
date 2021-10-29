package com.oneoonenet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        int result = 1;
        for (int i = 1; i < n; i++) {
            result += result * i;
        }
        System.out.println(n + "! = " + result);
    }
}