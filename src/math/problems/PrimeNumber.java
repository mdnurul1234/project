package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int count=0;
		int Number=100000;

		for(int i=2; i<10; i++) {
			if(i==2) {
				System.out.println(i);
				count++;
			}else {
				if(isPrime(i)) {
					System.out.println(i);
					count++;
				}
			}
		}
		System.out.println("Total prime number as of :"+ Number + " is "+ count);
	}

	public static boolean isPrime(int n) {

		if(n%2==0)
			return false;
		for(int i=2; i*i<=n; i=i+2) {

			if(n%i==0)
				return false;
		}
		return true;

	}

}
