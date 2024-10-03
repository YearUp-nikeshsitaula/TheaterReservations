package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //KNOWN VARIABLES

        String fullName = promptForString("Enter your full name: ");
        String dateOfShow = promptForString("What date will you be coming (MM/dd/yyyy): ");
        String numberOfTickets = promptForString("How many tickets would you like? ");
        DateTimeFormatter formatter;

        //CALCULATIONS

        //For Name
        //For String to be under first name and last name
        String[] nameFull = fullName.split(Pattern.quote(" "));
        String firstName = nameFull[0];
        String lastName = nameFull[1];

        //For Date
        //Local date formatter with formatter pattern of MM-dd-yyyy
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //changing dateOfShow String to formatted date
        LocalDate date = LocalDate.parse(dateOfShow, formatter);

        //For Number of tickets.
        //Changing String to int value
        int valueOfTickets = Integer.parseInt(numberOfTickets);

        //If condition that will print out either number of tickets, or a number of ticket
        if (valueOfTickets > 1){
            System.out.println(valueOfTickets + " " + "tickets reserved for " + date + " " + "under " + lastName + ", " + firstName);
        }else {
            System.out.println(valueOfTickets + " " + "ticket reserved for " + date + " " + "under " + lastName + ", " + firstName);
        }

    //METHODS
    }
    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
