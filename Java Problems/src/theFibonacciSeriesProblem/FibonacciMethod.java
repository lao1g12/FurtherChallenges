package theFibonacciSeriesProblem;

import java.util.ArrayList;

public class FibonacciMethod {
	private static int total;
	
	public static int fibSolver(){
		int fibNum = 1;
		total = 0;
		int count = 0;
		ArrayList<Integer> fibSeq = new ArrayList<Integer>();
		fibSeq.add(fibNum);
		while(fibNum < 1000) {
			total += fibNum;
			if (fibSeq.size() == 1) {
			}else {
				int num1 = fibSeq.get(count);
				int num2 = fibSeq.get(count-1);
				fibNum = num1 + num2;
			}
			count += 1;
			fibSeq.add(fibNum);
		}
		return (fibNum);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(fibSolver());
		System.out.println(total);
		
	}
}
