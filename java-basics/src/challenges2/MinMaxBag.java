package challenges2;

public class MinMaxBag {
	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 6));
	}
	//big cout each time is 5kg
	//smallCount each itme is 1 kg
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		int goalCopy = goal;
		for(int a = 0 ; a<bigCount ; a++) {
			if(goalCopy < 5) {
				return false;
			}
			goalCopy -= 5;
		}
		for(int a=0; a<smallCount ; a++) {
			if(goalCopy < 1) {
				return false;
			}
			goalCopy -=1;
		}
		return goalCopy == 0 || goalCopy == 1;
	}
	
	public static boolean canPAckSmartly(int bigCount, int smallCount, int goal) {
		return false;
	}
}
