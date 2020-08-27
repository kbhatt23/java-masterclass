package challenges2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumCoinChallenge {
public static void main(String[] args) {
	System.out.println(findMinCoinToAddRuppeeAlgoSingleLoop(new int[] {5,1,10}, 8));
}
	public static Map<Integer, Integer> findMinCoinToAddRuppeeAlgoSingleLoop(int[] coins, int ruppees) {
		
		//we know that the only way to have mininum number of coin is to have maxium coins with the highest coin cost
		//hence we sort
		Arrays.sort(coins);
		Map<Integer, Integer> coinMap = new HashMap<Integer, Integer>();
		int index= coins.length-1;
		int remainingMoney = ruppees;
		while(true) {
			if(ruppees == 0 || index < 0) {
				break;
			}
			int coin = coins[index];
			int numberOfCoins = remainingMoney/coin;
			if(numberOfCoins <= 0) {
				index--;
				continue;
			}
			coinMap.put(coin, numberOfCoins);
			remainingMoney = remainingMoney % coin;
		}
		return coinMap;
	}
}
