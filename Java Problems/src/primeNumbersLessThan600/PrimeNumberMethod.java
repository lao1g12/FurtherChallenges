package primeNumbersLessThan600;

public class PrimeNumberMethod {
	
	private static final int SIZE=600, SQRTSIZE=25;
	
	public static void main(String[] args)
	{ int[] primes = new int[SIZE];
	int printCounter = 0;
	for (int i=2; i<SIZE; i++) {
		if(printCounter == 10) {
			System.out.println();
			printCounter = 0;
		}
	primes[i] = 1;
	int divisCount = 0;
		for(int j=2; j<i; j++) {

			if((i%j) == 0) {
				divisCount += 1;
			
			}
			if(divisCount > 0) {
				primes[i] = 0;
			}
		}
		if (primes[i] == 1) {
			
			System.out.print(i+" ");
			printCounter += 1;
		}
		}
	}

}
