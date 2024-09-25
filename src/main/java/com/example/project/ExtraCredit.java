package com.example.project;
import java.math.RoundingMode; // Rounding learned from: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
import java.text.DecimalFormat; // same as above
import java.util.Scanner;


public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        DecimalFormat df = new DecimalFormat("#.##"); 
        double tip = cost * ((double)percent / 100);
        double total = tip + cost;
        double originalCostPerPerson = cost / people;
        double tipPerPerson = tip / people;
        double totalPerPerson = total / people; 


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + (df.format(tip)) + "\n");
        result.append("Total Bill with tip: $" + (df.format(total)) + "\n");
        result.append("Per person cost before tip: $" + (df.format(originalCostPerPerson)) + "\n");
        result.append("Tip per person: $" + (df.format(tipPerPerson)) + "\n");
        result.append("Total cost per person: $" + (df.format(totalPerPerson)) + "\n");
        result.append("-------------------------------\n");
        result.append("Items ordered:\n" + items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        //Your scanner object and while loop should go here
        StringBuilder order = new StringBuilder();
        int people = 1;
        int percent = 1;
        double cost = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter item or say 'X' to quit: ");
        String items = "";


        while (!items.equals("X")) {
            order.append(items + "\n");
            System.out.print("Enter item or say 'X' to quit: ");
            items = scan.nextLine();
        }  
        System.out.println(calculateTip(people,percent,cost,order.toString()));              
    } 
}
