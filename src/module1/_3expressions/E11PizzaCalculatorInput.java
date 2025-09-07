package module1._3expressions;

import java.util.Scanner;

public class E11PizzaCalculatorInput {
	
	//Exercise 11: Add code to complete the program according to the flow chart given here:
	
	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#storing-user-input-in-variables
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //add code to initialize pizzaSlices and numPeople from user input 
        System.out.println("Enter number of pizza slices: ");
        int pizzaSlices = scan.nextInt();
        System.out.println("Enter number of people sharing pizza: ");
        int numPeople = scan.nextInt();
        int slicesPerPerson = pizzaSlices/numPeople;
        int leftoverSlices = pizzaSlices % numPeople;
        System.out.println("Each person gets " + slicesPerPerson + " slices of pizza and there will be " + leftoverSlices + " slice(s) remaining.");


        
        
        //add code to compute and print slicesPerPerson and leftoverSlices
       

    }

}
