import java.util.Scanner;
class PrimeNo {
	public void primeNoGivenRange(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
            int flag=0;
			for(int j=2;j<i;j++){
                if(i%j==0)
                flag=1;
            }
			if(flag==0){
                System.out.print(i+" ");
            }
		}
	}
}
public class exp4 {
	public static void main(String[] args) {
		PrimeNo ob = new PrimeNo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print prime number:-");
		System.out.print("Enter lower limit range:");
		int ll = sc.nextInt();
		System.out.print("Enter Upper limit range:");
		int ul = sc.nextInt();
		ob.primeNoGivenRange(ll, ul);
	}
}