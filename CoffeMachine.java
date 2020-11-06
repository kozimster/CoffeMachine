/*JetBrains Academy Coffee Machine project
 * Description

Let's start with a program that makes you a coffee – virtual coffee, of course. But in this project, 
you will implement functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans,
 it can make different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.
 * Stage 1 - Write a program that prints the steps necessary to make coffee.
 * Stage 2 - Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
 * Stage 3 - Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.
 */
import java.util.Scanner;
public class CoffeMachine {

	public static void main(String[] args) {
		
		int waterNeed= 200;
		int milkNeed = 50;
		int coffeeNeed = 15;
				
		Scanner scan = new Scanner(System.in);
		int cups;
		int water;
		int milk;
		int coffeeBeans;
		
		System.out.println("Write how many ml of water the coffee machine has:");
		water = scan.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		milk = scan.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		coffeeBeans = scan.nextInt();
		
		System.out.println("Write how many cups of coffee you will need:");
		cups = scan.nextInt();
		
		int availableCoffee = Math.min(water / waterNeed,(Math.min(milk/milkNeed, coffeeBeans/coffeeNeed)) );
				
		
				
		if (((water >= waterNeed *cups) && (milk >=milkNeed*cups)) && (coffeeBeans >=coffeeNeed*cups) && availableCoffee >1){
			System.out.println("Yes, I can make that amount of coffee (and even " + (availableCoffee -cups) + " more than that)");
		}else if (((water >= waterNeed *cups) && (milk >=milkNeed*cups)) && (coffeeBeans >=coffeeNeed*cups) || (cups == 0)){
			System.out.println("Yes, I can make that amount of coffee");
		}else if (water <= waterNeed*cups || milk <=milkNeed*cups || coffeeBeans <=coffeeNeed*cups) {
			System.out.println("No, I can make only " + availableCoffee + " cup(s) of coffee");
		}
		
		
		
	scan.close();
	
		
		
		
		
		
	}

}
