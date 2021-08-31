package CodingTest_Programers.BruteForce;

import java.util.ArrayList;

public class BruteForce01_01 {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution(new int[] {1,2,3,4,5}));
	}
}

class Solution1 {
	public int[] solution(int[] answers) {
		int[] answer = {};
		
		int[] a = {1,2,3,4,5};
		int[] b = {2,1,2,3,2,4,2,5};
		int[] c = {3,3,1,1,2,2,4,4,5,5};
		int aa = 0;
		int ba = 0;
		int ca = 0;
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == a[i%(a.length+1)]) aa++;
			if(answers[i] == b[i%(b.length+1)]) ba++;
			if(answers[i] == c[i%(c.length+1)]) ca++;
		}
		
		int maxScore = Math.max(aa, Math.max(ba, ca));
		ArrayList<Integer> list = new ArrayList<>();
		if(maxScore == aa) list.add(1);
		if(maxScore == ba) list.add(2);
		if(maxScore == ca) list.add(3);
		
		
		return answer;
	}
}