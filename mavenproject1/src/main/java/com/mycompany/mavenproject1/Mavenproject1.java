package com.mycompany.mavenproject1;

import java.util.Calendar;

public class Mavenproject1 {
    public static void main(String[] args) {
        // Get current hour
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        // Determine greeting based on time of day
        String greeting = (hour < 12) ? "Good morning" : "Good afternoon";

        // Display the message
        System.out.println(greeting + ", Jayant Mangla, Welcome to COMP367");

        // Keep the application running
        while (true) {
            try {
                Thread.sleep(10000); // Keeps the application alive
            } catch (InterruptedException e) {
                System.out.println("Application interrupted!");
                break;
            }
        }
    }
}
