import java.util.Scanner;

class SumOfOddEven {
	public void sum_odd_even(int ll, int ul) {
		int sum_even = 0, sum_odd = 0;
		for (int i = ll; i <= ul; i++) {
			if (i % 2 == 0)
				sum_even = sum_even + i;
			else
				sum_odd = sum_odd + i;
		}
		System.out.println("SUM of ODD number: " + sum_odd);
		System.out.println("SUM of Even number: " + sum_even);

	}
}

public class exp2 {
	public static void main(String[] args) {
		SumOfOddEven ob = new SumOfOddEven();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to sum of odd and even number:-");
		System.out.print("Enter lower limit range:");
		int ll = sc.nextInt();
		System.out.print("Enter Upper limit range:");
		int ul = sc.nextInt();
		ob.sum_odd_even(ll, ul);
	}
}
