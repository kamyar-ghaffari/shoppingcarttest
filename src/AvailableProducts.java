import java.util.Scanner;

public class AvailableProducts {
    public static void printList() {
        Scanner input = new Scanner(System.in);
        System.out.println("   _______________________________________________");
        System.out.println("  |     Here's the list of available products     |");
        System.out.println("  |_______________________________________________|");
        System.out.println("  |        |       |                              |");
        System.out.println("  |  name  | price |       quantityType           |");
        System.out.println("  |________|_______|______________________________|");
        System.out.println(" 1|  rice  |   5   |        Kg                    |");
        System.out.println(" 2|  milk  |   5   |        Packet                |");
        System.out.println(" 3|  oil   |   2   |        Liter                 |");
        System.out.println("  |________|_______|______________________________|");
        System.out.println();
        System.out.println("Please enter the number of the product you're willing to add to cart, ");
        System.out.println("or simply enter 0 to open shopping cart.");
        int item = input.nextInt();
        System.out.println("please enter the desired quantity of the product: ");
        int quantity = input.nextInt();
    }
    public static void add() {

    }

}
