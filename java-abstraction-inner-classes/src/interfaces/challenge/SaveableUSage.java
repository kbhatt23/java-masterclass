package interfaces.challenge;

import java.util.List;

public class SaveableUSage {
public static void main(String[] args) {
	Player player  =new Player("kanishk", "brain", 100);
	System.out.println("initial player "+player);
	List<String> savedObject = player.save();
	player.setHealth(55);
	System.out.println("after hit "+player);
	
	player.load(savedObject);
	System.out.println("after loading "+player);
}
}
