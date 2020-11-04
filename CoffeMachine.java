/*JetBrains Academy Coffee Machine project
 * Description

Let's start with a program that makes you a coffee – virtual coffee, of course. But in this project, 
you will implement functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans,
 it can make different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.
 * Stage 1 - Write a program that prints the steps necessary to make coffee.
 * Stage 2 - Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
 */
import java.util.Scanner;
public class CoffeMachine {

	public static void main(String[] args) {
		
		System.out.println("Starting to make a coffee");
		System.out.println("Grinding coffee beans");
		System.out.println("Boiling water");
		System.out.println("Mixing boiled water with crushed coffee beans");
		System.out.println("Pouring coffee into the cup");
		System.out.println("Pouring some milk into the cup");
		System.out.println("Coffee is ready!");

		Scanner scan = new Scanner(System.in);
		int cups;
		int water;
		int milk;
		int coffeeBeans;
		
		
		System.out.println("Write how many cups of coffee you will need:");
		cups = scan.nextInt();
		scan.close();
		
		water = cups*200;
		milk = cups*50;
		coffeeBeans = cups* 15;
		
		System.out.println("For " + cups + " cups of coffee you will need:");
		System.out.println(water + " ml of water");
		System.out.println(milk + " ml of milk");
		System.out.println(coffeeBeans + " g of coffee beans");
		
	}

}
