import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("What is your height? ");
            height = reader.nextDouble();
            System.out.print("What is your weight? ");
            weight = reader.nextDouble();

            bmi = (weight / (height * height)) * 703;

            System.out.printf("Your BMI is %.2f.\n", bmi);
            System.out.println(bmi > 25 ? "You are overweight. You should see your doctor." : bmi < 18.5 ? "You are underweight. You should see your doctor." : "You are within the ideal weight range.");
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
