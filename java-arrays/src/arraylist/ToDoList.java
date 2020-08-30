package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

	private static List<String> todos = new ArrayList<String>();
	
	public static void addTodo(String todo) {
		todos.add(todo);
	}
	
	public static void printAllTodos() {
		for(int i=0 ; i< todos.size() ; i++) {
			System.out.println((i+1)+ ". "+ todos.get(i));
		}
	}
	
	public static void deleteTodo(String todo) {
		todos.remove(todo);
	}
	public static String findTodo(String todo) {
		//type 1 -> aprt from normal for each thing
		boolean isExists = todos.contains(todo);
		if(isExists)
			return todo;
		else
			return null;
					
	}
	public static void updateTodo(int index, String todo) {
		//forcing check for update only
		todos.set(index, todo);
	}
}
