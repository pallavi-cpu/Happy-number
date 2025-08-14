public class Main {
    public static void main(String[] args) {
        int a = 19;
        int n = a;

        while (n != 1 && n != 4) {  
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n = n / 10;
            }
            n = sum;
            System.out.println(n + " ");
        }

        if (n == 1) {
            System.out.println(a + " is a Happy number.");
        } else {
            System.out.println(a + " is not a Happy number.");
        }
    }
}
