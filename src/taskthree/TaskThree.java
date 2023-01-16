package taskthree;

import java.util.Scanner;

/*Write a program which reads five numbers1 of type int and prints the two greatest
of them (in particular, it may happen that they are equal). You can define at most
three variables, not counting the variable for the Scanner.
Do not use loops or arrays.*/

public class TaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int biggestNumber, secondBiggestNumber, currentInput;

        System.out.println("Enter five numbers: ");

        biggestNumber = scanner.nextInt();
        secondBiggestNumber = scanner.nextInt();

        if (secondBiggestNumber > biggestNumber) {
            currentInput = biggestNumber;
            biggestNumber = secondBiggestNumber;
            secondBiggestNumber = currentInput;
        }
        currentInput = scanner.nextInt();
        if (currentInput >= secondBiggestNumber) {
            if (currentInput > biggestNumber) {
                secondBiggestNumber = biggestNumber;
                biggestNumber = currentInput;
            } else {
                secondBiggestNumber = currentInput;
            }
        }
        currentInput = scanner.nextInt();
        if (currentInput >= secondBiggestNumber) {
            if (currentInput > biggestNumber) {
                secondBiggestNumber = biggestNumber;
                biggestNumber = currentInput;
            } else {
                secondBiggestNumber = currentInput;
            }
        }
        currentInput = scanner.nextInt();
        if (currentInput >= secondBiggestNumber) {
            if (currentInput > biggestNumber) {
                secondBiggestNumber = biggestNumber;
                biggestNumber = currentInput;
            } else {
                secondBiggestNumber = currentInput;
            }
        }
        
        System.out.println("The biggest number: " + biggestNumber);
        System.out.println("The second biggest: " + secondBiggestNumber);

    }
}
