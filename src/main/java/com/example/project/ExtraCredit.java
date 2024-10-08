// This is the Extra Credit

package com.example.project;
import java.math.RoundingMode; // Rounding learned from: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
import java.text.DecimalFormat; // same as above
import java.util.Scanner;
// learned stringbuilder tp string from https://www.geeksforgeeks.org/stringbuilder-tostring-method-in-java-with-examples/


public class ExtraCredit {

    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        DecimalFormat df = new DecimalFormat("#.##"); 
        double tip = cost * ((double)percent / 100); // Multiples the cost of the food with the tip (whole number/100 to make it a decimal)
        double total = tip + cost; // Adds the tip and food cost together
        double originalCostPerPerson = cost / people; // divides the food cost prior to the tip by the number of people
        double tipPerPerson = tip / people; // divides the tip cost by the number of people 
        double totalPerPerson = total / people; // divides the cost with tip by the number of people



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
        System.out.print("Enter item or say 'x' to quit: "); 
        String items = scan.nextLine(); // I put the first item outside the list so "x" does not get appended to the string (1/2)


        while (!items.equals("x")) {
            order.append(items + "\n"); // The append is at the top of the list so "x" does not get appended to the string (2/2)
            System.out.print("Enter item or say 'x' to quit: ");
            items = scan.nextLine();
        }  
        System.out.println(calculateTip(people,percent,cost,order.toString()));              
    } 
}
