import java.util.Scanner;

class factorial {
    public int fact(int n) {
        if (n == 0)
            return 1;
        return (n * fact(n - 1));
    }
}

public class exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to find Factorial:");
        int n = sc.nextInt();
        factorial ob= new factorial();
        System.out.println("Factorial of "+n+" is "+ob.fact(n));
    }

}
