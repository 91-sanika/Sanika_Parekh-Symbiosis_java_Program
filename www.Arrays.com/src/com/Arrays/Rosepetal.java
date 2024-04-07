package com.Arrays;

import java.util.Scanner;

public class Rosepetal {

	public void getData(int n, String str) {

        String arr[] = new String[5];
        arr[0] = "at madly";
        arr[1] = "passionatly";
        arr[2] = "desparately";
        arr[3] = "from bottom of my heart";
        arr[4] = "crazyly";

        // Check if n is within range
        if (n > 0 && n <= arr.length) {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and " + arr.length);
        }
    }

    public static void main(String[] args) {
        Rosepetal r = new Rosepetal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements to print:");
        int userInput = scanner.nextInt();
        r.getData(userInput, "sanika");

        scanner.close();
    }
}