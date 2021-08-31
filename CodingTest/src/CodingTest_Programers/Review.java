package CodingTest_Programers;

import java.util.HashMap;

public class Review {
	public static void main(String[] args) {
		Solution2 s = new Solution2()	;
		System.out.println( (s.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}) ));
	}
}

class Solution2 {
	public String solution(String[] participant, String[] completion) {
		String answer	= "";
		
		HashMap<String, Integer> human = new HashMap<String, Integer>();
		
		for(String player : participant)	human.put(player, human.getOrDefault(player, 0)+1);
		for(String player : completion) 	human.put(player, human.get(player)-1);
		
		for(String key : human.keySet()) {
			if(human.get(key) != 0) answer = key;
		}
				
		return answer;
	}
}

