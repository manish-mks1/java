public class Sum0fprimeindex {
    public static void main(String[] ar) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int s = 0;
        for (int i = 2; i < a.length; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (c > 2)
                    break;
                else if (i % j == 0)
                    c++;
            }
            if (c == 2) {
                s += a[i];
            }
        }
        System.out.println("Sum of array only on prime index = " + s);
    }
}
