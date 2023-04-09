import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, teacher!");
        System.out.println("Which problem do you want to check? (choose between 1-10, write '0' if you are done)");
        Scanner scan = new Scanner(System.in);
        int problemNum = scan.nextInt();
        problemNum = enterProblem(problemNum);
        do{
            switch (problemNum) {
                case 1 -> {
                    System.out.print("Enter a number n: ");
                    int n = scan.nextInt(); //n - number of elemets of array
                    int[] array = new int[n]; //creates new array
                    System.out.print("Enter n elements of array: ");
                    for (int i = 0; i < n; i++){//allows user to enter elements
                        array[i] = scan.nextInt();
                    }
                    System.out.println(findMin(array, n));//calls findMin() method
                }
                case 2 -> {
                    System.out.print("Enter a number n: ");
                    int n = scan.nextInt();
                    int[] array = new int[n];
                    System.out.print("Enter n elements of array: ");
                    for (int i = 0; i < n; i++){
                        array[i] = scan.nextInt();
                    }
                    System.out.println(findAvg(array, n)); //calls findAvg() method
                }
                case 3 -> checkPrime(); //calls checkPrime() method
                case 4 -> {
                    System.out.print("Enter a number n: ");
                    int n = scan.nextInt();
                    System.out.println(n + "! = " + calculateFactorial(n)); //calls calculateFcatorial() method
                }
                case 5 -> {System.out.print("Enter a number n: ");
                    int n = scan.nextInt();
                    System.out.println("nth Fibonacci number is " + findFibonacci(n));} //calls findFibonacci() method
                case 6 -> {System.out.print("Enter a number a: ");
                    int a = scan.nextInt();
                    System.out.print("Enter a number n: ");
                    int n = scan.nextInt();
                    System.out.println("nth power of a is " + calculatePower(a, n));} //calls calculatePower() method
                case 7 -> {
                    System.out.print("Enter a number n: ");
                    int n = scan.nextInt();
                    int[] array = new int[n]; //creates a new array
                    System.out.print("Enter n elements of array: ");
                    for (int i = 0; i < n; i++){ //lets user write elements of the arrray
                        array[i] = scan.nextInt();
                    }
                    reverseArray(array, 0, n-1); //calls reverseArray() method that reverses it
                    System.out.println("Reversed array: ");
                    for (int i = 0; i < n; i++){
                        System.out.print(array[i] + " "); //outputs elements of reversed array 1 by 1
                    }
                    System.out.println();
                }
                case 8 -> {
                    System.out.print("Enter a String s: ");
                    String s = scan.next();
                    System.out.println("Is s fully from digits?");
                    System.out.println(isDigit(s)); //calls isDigit() method
                }
                case 9 -> {System.out.print("Enter a number a: ");
                    int a = scan.nextInt();
                    System.out.print("Enter a number b: ");
                    int b = scan.nextInt();
                    System.out.println("Binomial Coefficient of a and b is " + calculateFactorial(a)/(calculateFactorial(b)*calculateFactorial(a-b)));
                } //calls calculateFactorial() method for a, b and a-b and puts them on Binomial coefficient formula
                case 10 -> {System.out.print("Enter a number a: ");
                    int a = scan.nextInt();
                    System.out.print("Enter a number b: ");
                    int b = scan.nextInt();
                    System.out.println("GCD of a and b is " + findGCD(a, b));} //calls findGCD() method
            }
            System.out.println("Which problem should be next?");
            problemNum = scan.nextInt(); //asks fir the next problem to check
            problemNum = enterProblem(problemNum);
        } while (problemNum != 0); //terminates the process
        System.out.println("Thanks for your attention!");
    }
    public static int enterProblem(int problemNum){ //checks, if input is not less than 0 and not more than 10
        Scanner scan = new Scanner(System.in);
        try {
            if (problemNum < 0 || problemNum > 10){
                throw new Exception("Enter numbers from 1 to 10!");
            }
        } catch (Exception e){
            System.out.println(e);
            problemNum = scan.nextInt();
            enterProblem(problemNum); //allows user to write another problem number and then by using recursion checks new input again
        }
        return problemNum; //returns checked problem number
    }
    public static int findMin(int[] array1, int n){ //finds the minimum value element of array
        if (n == 1){ //returns the only element of array, if there is 1 left
            return array1[0];
        }
        return (Math.min(array1[n-1], findMin(array1, n-1))); //returns minimum with a built-in method between the last element and the minimum between other elements, until there is only one element left
    }
    public static float findAvg(int[] array2, int n){ //finds average of array
        if (n == 0){ //returns 0, if there is 1 element
            return 0;
        }
        float average = (array2[n-1] + findAvg(array2, n-1) * (n-1)) / n;//finds sum of all elements (including previous ones) and divides them on their amount (n)
        return average; //returns the average of elements of array
    }
    public static void checkPrime(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        String answer;
        if (n <= 0 || n % 2 == 0){ //checks if n is negative or even since those are composite (can be divided by -1 and 2 respectively)
            answer = "Composite";
        } else {
            answer = "Prime"; //sets "Prime" as default
        }
        for (int i = 2; i <= (n+1)/2; i++){ //checks if any number less than half of n can be a divisor for n without remainder
            if (n % i == 0) {
                answer = "Composite";
                break;
            }
        }
        System.out.println(n + " is " + answer); //returns if n is "Prime" or "Composite"
    }
    public static int calculateFactorial(int n){
        int factorial = 1; // factorial - factorial of n
        if (n >= 1){
            factorial = n * calculateFactorial(n-1);//multiplies n and n-1, n-2, n-3… until it reaches 1
        }
        return factorial; //returns factorial of n
    }
    public static int findFibonacci(int n){
        int fibonacci = 1; // fibonacci - nth fibonacci number
        if (n>2){
            fibonacci = findFibonacci(n-1) + findFibonacci(n-2); //splits n to (n-1)+(n-2) until the value of reaches 2 and finds their sum
        }
        return fibonacci; //returns nth fibonacci number
    }
    public static int calculatePower(int a, int n){
        int power = 1; //power - power n of a
        if (n >= 1){
            power = a * calculatePower(a, n-1);//multiplies a by itself as many times as we need to minus 1 from n until n = 1
        }
        return power; //returns calculated power n of a
    }
    public static void reverseArray(int[] array, int start, int end){
        if (start <= end){//code compares first and last index of array and switches them
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseArray(array, start+1, end-1);//switches next after the first and previous before the last elements, continuing till reaches the center and returns reversed array
        }
    }
    public static String isDigit(String s){

        if (!Character.isDigit(s.charAt(0)))//Code indexes every char with built-in method charAt() and checks if it is digit with isDigit built-in method
            return "No";
        if (Character.isDigit(s.charAt(0))){
            return "Yes";
        }
        return isDigit(s.substring(1)); //checks every next character with a substring and returns final answer
    }

    public static int findGCD(int a, int b){
        if (a < b){ // makes sure that a is bigger than b and switches their values if no
            int temp = a;
            a = b;
            b = temp;
        }// gcd - the greatest common divisor of a and b
        int gcd = a % b; //by the Euclidean Algorithm, code finds x aka remainder of the division a/b
        if (gcd > 1){//keeps finding remainders of b/x and dividing new b’s on them till there is no remainder
            gcd = findGCD(b, gcd);
        } else if (gcd == 0){ //current b can be a greatest common divisor after there is no remainder
            gcd = b;
        }
        return gcd;//method returns gcd aka final b
    }
}



