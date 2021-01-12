/*
 * Chapter 7 Pre-lab
 * Description: writing my descriptions in complete sentences to describe what the code is doing
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
         /*
         * creat an objet input to store the user input */
        java.util.Scanner input = new java.util.Scanner(System.in);
         /*
         *  prompt the user to enter the number of items that needs */
        System.out.print("Enter the number of items: ");
        /*
        * store the user's input in variable n */
         int n = input.nextInt();
         /*
         * create a array of doubles of the size of n (the user's input) */
         double [] numbers = new double[n];
         /*
         * create a double variable sum to add the numbers all together */
         double sum = 0;
         /*
         * prompt the user to enter the numbers that needs to find the average of */
         System.out.print("Enter the numbers: ");
         /*
         * loop through the array of double numbers */
         for (int i = 0; i < n; i++) {
             /*
             * storing the numbers the user's entered and storing them in the array one by one */
             numbers[i] = input.nextDouble();
             /*
             * adding the number one by one and assigning to variable sum */
             sum += numbers[i];
             }
         /*
         * find the average of the numbers entered and assigning it to variable double average */
         double average = sum / n;
         /*
         * create a variable int count to count the numbers that is above the average */
         int count = 0;
         /*
         * loop through the array of numbers */
         for (int i = 0; i < n; i++)
             /*
             * check if the number is greater than average and pump up the counter by 1 */
             if (numbers[i] > average)
             count++;
             /*
             * printing the average */
         System.out.println("Average is " + average);
         /*
         * printing the numbers of elements that are above the average (the counter)*/
         System.out.println("Number of elements above the average is "+ count);
         }
 }

