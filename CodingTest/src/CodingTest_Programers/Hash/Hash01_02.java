package CodingTest_Programers.Hash;

import java.util.Arrays;

public class Hash01_02 {

	public static void main(String[] args) {
		// 프로그래머스 코딩테스트 연습
		// 해시(Hash)_01_완주하지 못한 선수_정렬
		Solution2 s = new Solution2()	;
		System.out.println( (s.solution(new String[] {"kiki",  "eden", "leo"}, new String[] {"eden", "kiki"}) ));
	}
	
}

class Solution2 {
	public String solution(String[] participant, String[] completion) {
		
		String answer	= "";
		String temp		= "";
		
		// Arrays.sort(배열) 을 사용하면 배열을 오름차순 정렬시킬 수 있다.
		// Arrays.sort(배열, 시작, 끝) : 부분 정렬
		// Arrays.sort(배열, Collections.reverseOrder()) : 내림차순 정렬
		// 객체의 경우 CompareTo() 메소드를 Override 로 구현해놔야 정렬 가능.
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		
		while(i<completion.length) {
			if(!completion[i].equals(participant[i])) {
				answer = participant[i];
			}
			i++;
		}
		
		if(!temp.equals(""))	answer = temp;
		else 					answer = participant[participant.length - 1];
		
		return answer;
	}
}
