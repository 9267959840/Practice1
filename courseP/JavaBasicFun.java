import java.util.Scanner;

public class JavaBasicFun {
    public static int calculateSum(int num1, int num2) {// parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("number a :" + a);
        System.out.println("number b :" + b);
    }

    public static int productOfNum(int a, int b) {
        int prod = a * b;
        // System.out.println(prod);
        return prod;
    }

    public static int sumOfNum(int a) {
        int sumOfN = a * (a + 1) / 2;
        return sumOfN;
    }

    public static int factorialOfNum(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;// factorial
    }

    public static int binCoff(int n, int r) {
        int fact_n = factorialOfNum(n);
        int fact_r = factorialOfNum(r);
        int fact_nmr = factorialOfNum((n - r));

        int binCoff = fact_n / (fact_r * fact_nmr);
        return binCoff;

    }

    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }

        // only for n>=2
        // first
        // boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {// completey divide
                // first
                // return isPrime;
                // break;
                // second
                return false;
            }
        }
        return true;
    }

    public static boolean primeOptm(int n) {

        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void binToDeci(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + "=" + decNum);
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeOptm(i)) {// true
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    public static void deciToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String args[]) {

        // functions and methods
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
        System.out.println("number a :" + a);
        System.out.println("number b :" + b);
        int sum = calculateSum(a, b);// arguments or actual parameters
        System.out.println("sum is ::" + sum);
        // first way
        productOfNum(a, b);
        // second way
        int product = productOfNum(a, b);
        System.out.println(product);
        // sum of n num
        // int sum = sumOfNum(a);
        System.out.println("factorial of number::" + sum);
        // factorial of number
        System.out.println(factorialOfNum(4));

        // binomial cofficient
        System.out.println(binCoff(5, 2));

        // prime check
        System.out.println(prime(14));

        // prime optimize
        System.out.println(primeOptm(2));

        // prime number from range 2 to 20
        primeInRange(20);
        // binary to decimal
        binToDeci(111);

        // decimal to binar
        deciToBin(7);
    }

}
