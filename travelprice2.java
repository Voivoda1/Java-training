package com.company;

import java.util.Scanner;

public class travelprice2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0.0d;
        double taxirate = 0.0d;
        final double result = (dayOrNight.equals("day")) ? (taxirate = 0.79) : (taxirate = 0.90);
        final double result2 = (km < 20) ? price = 0.70 + (km * taxirate) : (price = km * 0.09);

        System.out.println(price);
        scanner.close();



    }
}
