/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class RunApplication {

    public static void main(String[] args) {
        // Instantiate using sample test values directly
        ConsoleSales reportOne = new ConsoleSales("PS5", "Cape Town", 6000);
        ConsoleSales reportTwo = new ConsoleSales("XBOX", "Port Elizabeth", 9000);

        // Display reports
        displayHeader();
        reportOne.printReport();
        
        System.out.println(); // Spacing
        
        displayHeader();
        reportTwo.printReport();
    }

    // Helper method to format section output
    private static void displayHeader() {
        System.out.println("==========================================");
        System.out.println("       ELECTRONICS SALES SUMMARY          ");
        System.out.println("==========================================");
    }
}