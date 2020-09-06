package learning.map.stockbasketexample;

import java.util.Map;
import java.util.Scanner;

public class BasketApplicationrunner {
	private static Scanner scanner = new Scanner(System.in);
	// each user can have its own runner acn copy of basket list will be seperate
	private static BasketList basketList = new BasketList();

	public static void main(String[] args) {
		boolean quit = false;
		System.out.println("Welcome to my cart basket");
		while (!quit) {
			showOptions();
			if (scanner.hasNextInt()) {
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					displayAllstocks();
					break;
				case 2:
					displayBasket();
					break;
				case 3:
					addItemToBasket();
					break;
				case 4:
					removeItemFromBasket();
					break;
				case 5:
					basketList.checkout();
					break;
				case 0:
					System.out.println("thanks for choose my basket");
					quit = true;
					break;

				default:
					break;
				}
			} else {

			}
			scanner.nextLine();
		}

		scanner.close();
	}

	private static void removeItemFromBasket() {
		System.out.println("Please enter skuId:");
		String skuId = scanner.next();
		System.out.println("Please enter quantity:");
		// add check for quantity int
		while (true) {
			if (scanner.hasNextInt()) {
				int quantity = scanner.nextInt();
				basketList.removeItemFromCart(skuId, quantity);
				break;
			} else {
				System.err.println("Please enter valid quantity");
			}
		}
	}

	private static void addItemToBasket() {
		System.out.println("Please enter skuId:");
		String skuId = scanner.next();
		System.out.println("Please enter quantity:");
		// add check for quantity int
		while (true) {
			if (scanner.hasNextInt()) {
				int quantity = scanner.nextInt();
				basketList.addItemToCart(skuId, quantity);
				break;
			} else {
				System.err.println("Please enter valid quantity");
			}
		}

	}

	private static void displayBasket() {
		basketList.displayAllItems();
	}

	private static void displayAllstocks() {
		Map<String, StockItem> stockLists = StockList.fetchStockUnitsAvailable();
		stockLists.values().forEach(System.out::println);
	}

	private static void showOptions() {
		System.out.println("Enter 1 to fetch all stock items");
		System.out.println("Enter 2 to display your basket");
		System.out.println("Enter 3 to add item to basket");
		System.out.println("Enter 4 to remove item from basket");
		System.out.println("Enter 5 to checkout basket");
		System.out.println("Enter 0 to quit");
	}
}
