import java.util.Scanner;

public class PizzaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter the number of individuals at the party: ");
                int numPeople = Integer.parseInt(scanner.nextLine());
                if (numPeople <= 0) {
                    System.out.println("Please enter a positive number of individuals.");
                    continue;
                }
                int[] pizzaSlices = calculatePizzaSlices(numPeople);
                System.out.printf("If there are %d individuals:%n", numPeople);
                System.out.printf("1. we will have %d Large pizza%n", pizzaSlices[0]);
                System.out.printf("2. we will have %d Medium pizza%n", pizzaSlices[1]);
                System.out.printf("3. we will have %d Regular pizza%n", pizzaSlices[2]);
                System.out.printf("4. we will have %d Small pizza%n", pizzaSlices[3]);
                System.out.printf("Total slices: %d%n", numPeople);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        
        scanner.close();
    }
    
    public static int[] calculatePizzaSlices(int people) {
        int[] slices = new int[4];
        slices[0] = people / 8;
        people %= 8;
        slices[1] = people / 6;
        people %= 6;
        slices[2] = people / 4;
        slices[3] = people % 4;
        return slices;
    }
}