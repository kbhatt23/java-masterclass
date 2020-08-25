package overloading;

public class PlayingCat {
	public static void main(String[] args) {
		System.out.println(isCatPlaying(false, 35));
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean isPlaying = false;
		if (summer && temperature >=25 && temperature <=45) {
			isPlaying = true;
		} else if(temperature >= 25 && temperature <=35){
			isPlaying = true;
		}
		return isPlaying;
	}
}
