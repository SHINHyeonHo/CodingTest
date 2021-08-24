package CodingTest_Programers.Hash;

import java.util.HashMap;

public class Hash01_01 {

	public static void main(String[] args) {
		// 프로그래머스 코딩테스트 연습
		// 해시(Hash)_01_완주하지 못한 선수
		
		Solution1 s = new Solution1()	;
		System.out.println( (s.solution(new String[] {"kiki",  "eden", "leo"}, new String[] {"eden", "kiki"}) ));
	}

}

class Solution1 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		// HashMap.getOrDefault : 키가 있으면 엔트리를 가지고 오고 없으면 Default 값으로 셋팅
		// HashMap.get, put
		for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
		for(String player : completion) hm.put(player, hm.get(player) - 1);
		
		// HashMap.keySet : Key들의 배열
		// HashMap.entrySet : Key와 value 의 배열, Key=value 로 나온다.
		// ** set 클래스는 list와 다르게 요소간 저장순서가 유지되지 않아, Iterator()를 사용해서 불러와도 처음 저장순서와 다르다.
		// ** Iterator
		for(String key : hm.keySet()) {
			if(hm.get(key) != 0) answer = key;
		}
		
		return answer;
	}
}

