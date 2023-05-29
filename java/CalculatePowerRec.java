import java.util.Scanner;
public class CalculatePowerRec {
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*Power(x,--n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number and power: ");
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(x+" To the Power "+n+" is :"+Power(x, n));
    }
}
