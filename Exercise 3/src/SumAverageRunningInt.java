
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// FOR LOOP
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for(int number = lowerbound; number <= upperbound ; ++number) {
			sum = sum + number;
		}
		average = sum / 100;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
		System.out.println();
		
		// WHILE LOOP
		int sum1 = 0;
		double average1;
		int lowerbound1 = 1;
		int upperbound1 = 100;
		
		while(lowerbound1 <= upperbound1) {
			sum1 = sum1 + lowerbound1;
			++lowerbound1;
		}
		average1 = sum1 / 100;
		System.out.println("The sum of 1 to 100 is " + sum1);
		System.out.println("The average is " + average1);
		System.out.println();
		
		// DO WHILE LOOP
		int sum2 = 0;
		double average2;
		int lowerbound2 = 1;
		int upperbound2 = 100;
		
		do {
			sum2 = sum2 + lowerbound2;
			++lowerbound2;
		} while(lowerbound2 <= upperbound2);
		
		average2 = sum2 / 100;
		System.out.println("The sum of 1 to 100 is " + sum2);
		System.out.println("The average is " + average2);
		System.out.println();
	}

}
