package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int time;
        System.out.print("Input how many seconds, you would like converted to hours, minutes and seconds: ");
        Scanner in = new Scanner(System.in);
        time = in.nextInt();
        int hours = time / 3600;
        int minutes = (time % 3600 / 60);
        int seconds = (time % 3600 % 60);
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds.", time, hours, minutes, seconds);
    }
}
