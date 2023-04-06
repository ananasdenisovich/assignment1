import java.util.Scanner;
// n this commit, I am thinking if it is okay that I have only 7 commits because I pushed many problems together
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, teacher!");
        System.out.println("Which problem do you want to check? (choose between 1-10, write '0' if you are done)");
        Scanner scan = new Scanner(System.in);
        int problemNum = scan.nextInt();
        problemNum = enterProblem(problemNum);
        do{
            switch (problemNum) {
                case 1 -> Task1();
                case 2 -> Task2();
                case 3 -> Task3();
                case 4 -> Task4();
                case 5 -> Task5();
                case 6 -> Task6();
                case 7 -> Task7();
                case 8 -> System.out.println(Task8());
                case 9 -> Task9();
                case 10 -> Task10();
            }
            System.out.println("Which problem should be next?");
            problemNum = scan.nextInt();
            problemNum = enterProblem(problemNum);
        } while (problemNum != 0);
        System.out.println("Thanks for your attention!");
    }
    public static int enterProblem(int problemNum){
        Scanner scan = new Scanner(System.in);
        try {
            if (problemNum < 0 || problemNum > 10){
                throw new Exception("Enter numbers from 1 to 10!");
            }
        } catch (Exception e){
            System.out.println(e);
            problemNum = scan.nextInt();
            enterProblem(problemNum);
        }
        return problemNum;
    }
    public static void Task1(){
        int[] array = {10, 1, 32, 3, 45};
        for (int i = 0; i < 5; i++){
            if (array[0] > array[i]){
                array[0] = array[i];
            }
        }
        System.out.println("min = " + array[0]);
    }
    public static void Task2(){
        int[] array = {3, 2, 4, 1};
        float x = 0;
        for(int i = 0; i < 4; i++){
            x += array[i];
        }
        x /= 4;
        System.out.println("average = " + x);
    }
    public static void Task3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        String answer;
        if (n <= 0 || n % 2 == 0){
            answer = "Composite";
        } else {
            answer = "Prime";
        }
        for (int i = 2; i <= (n+1)/2; i++){
            if (n % i == 0) {
                answer = "Composite";
                break;
            }
        }
        System.out.println(n + " is " + answer);
    }
    public static void Task4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        System.out.println(n + "! = " + Rec(n));
    }
    public static int Rec(int n){
        int x = 1;
        if (n >= 1){
            x = n * Rec(n-1);
        }
        return x;
    }
    public static void Task5(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        System.out.println("nth Fibonacci number is " + Fib(n));
    }
    public static int Fib(int n){
        int x;
        if (n>2){
            x = Fib(n-1) + Fib(n-2);
        } else {
            x = 1;
        }
        return x;
    }
    public static void Task6(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = scan.nextInt();
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        System.out.println("nth power of a is " + Power(a, n));
    }
    public static int Power(int a, int n){
        int x = 1;
        if (n >= 1){
            x = a * Power(a, n-1);
        }
        return x;
    }
    public static void Task7(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter n elements of array: ");
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        Reverse(array, 0, n-1);
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void Reverse(int[] array, int start, int end){
        if (start <= end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            Reverse(array, start+1, end-1);
        }
    }
    public static String Task8(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String s: ");
        String s = scan.next();
        System.out.println("Is s fully from digits?");
        return isDigit(s);
    }
    public static String isDigit(String s){

        if (!Character.isDigit(s.charAt(0)))
            return "No";
        if (Character.isDigit(s.charAt(0))){
            return "Yes";
        }
        return isDigit(s.substring(1));
    }
    public static void Task9(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = scan.nextInt();
        System.out.print("Enter a number b: ");
        int b = scan.nextInt();
        System.out.println("Binomial Coefficient of a and b is " + Rec(a)/(Rec(b)*Rec(a-b)));
    }
    public static void Task10(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number a: ");
        int a = scan.nextInt();
        System.out.print("Enter a number b: ");
        int b = scan.nextInt();
        System.out.println("GCD of a and b is " + GCD(a, b));
    }
    public static int GCD(int a, int b){
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        int x = a % b;
        if (x > 1){
            x = GCD(b, x);
        } else if (x == 0){
            x = b;
        }
        return x;
    }
}



