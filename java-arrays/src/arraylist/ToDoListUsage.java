package arraylist;

import java.util.Scanner;

public class ToDoListUsage {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		printInstructions();
		while (!quit) {
			if (scanner.hasNextInt()) {
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					// add
					addItem();
					break;
				case 2:
					// add
					removeItem();
					break;
				case 3:
					// add
					updateItem();
					break;
				case 4:
					// add
					findItem();
					break;
				case 5:
					printAllTodos();
					break;
				case 6:
					quit = true;
					break;
				case 0:
					printInstructions();
					break;

				default:
					break;
				}
				printInstructions();
			} else {
				System.out.println("Please enter valid options");
			}
			scanner.nextLine();
		}
		scanner.close();
	}

	private static void updateItem() {
		System.out.println("Please enter todo to update");
		String todo = scanner.next();
		System.out.println("Please enter index for updation");
		int index = scanner.nextInt();
		ToDoList.updateTodo(index-1, todo);
	}

	private static void addItem() {
		System.out.println("Please enter todo to add");
		String todo = scanner.next();
		ToDoList.addTodo(todo);
	}

	private static void removeItem() {
		System.out.println("Please enter todo to remove");
		String todo = scanner.next();
		ToDoList.deleteTodo(todo);
	}

	private static void findItem() {
		System.out.println("Please enter todo to find");
		String todo = scanner.next();
		System.out.println("Todo found "+ToDoList.findTodo(todo));
	}
	
	private static void printAllTodos() {
		ToDoList.printAllTodos();
	}

	private static void printInstructions() {
		System.out.println("Enter 1 to add item");
		System.out.println("Enter 2 to remove item");
		System.out.println("Enter 3 to update item");
		System.out.println("Enter 4 to find item");
		System.out.println("Enter 5 to print all todos");
		System.out.println("Enter 6 to Quit");
		System.out.println("Enter 0 to print instructions");
		
	}
}
