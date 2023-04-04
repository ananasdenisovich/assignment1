import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, teacher!");
        System.out.println("Which problem do you want to check? (choose between 1-10, write '0' if you are done)");
        Scanner scan = new Scanner(System.in);
        int problemNum = scan.nextInt();
        do{
           switch (problemNum){
               case 1:
                   System.out.println(Task1());
                   break;
               case 2:
                   System.out.println(Task2());
                   break;
               case 3:
                   System.out.println(Task3());
                   break;
               case 4:
                   System.out.println(Task4());
                   break;
               case 5:
                   System.out.println(Task5());
                   break;
               case 6:
                   System.out.println(Task6());
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   break;
               case 10:
                   break;
           }
            System.out.println("Which problem should be next?");
            problemNum = scan.nextInt();
        } while (problemNum != 0);
    }
    public static int Task1(){
        int[] array = {10, 1, 32, 3, 45};
        for (int i = 0; i < 5; i++){
            if (array[0] > array[i]){
                array[0] = array[i];
            }
        }
        return array[0];
    }
    public static float Task2(){
        int[] array = {3, 2, 4, 1};
        float x = 0;
        for(int i = 0; i < 4; i++){
            x += array[i];
        }
        x /= 4;
        return x;
    }
    public static String Task3(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String answer = null;
        if (n <= 0 || n % 2 == 0){
            answer = "Composite";
        } else {
            answer = "Prime";
        }
        for (int i = 2; i <= (n+1)/2; i++){
            if (n % i == 0){
                answer = "Composite";
            }
        }
        return answer;
    }
    public static int Task4(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return Rec(n);
    }
    public static int Rec(int n){
        Scanner scan = new Scanner(System.in);
        int x = 1;
        if (n >= 1){
            x = n * Rec(n-1);
        } else{
            x = 1;
        }
        return x;
    }
    public static int Task5(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return Fib(n);
    }
    public static int Fib(int n){
        int x = 0;
        if (n>2){
            x = Fib(n-1) + Fib(n-2);
        } else {
            x = 1;
        }
        return x;
    }
    public static int Task6(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        return Power(a, n);
    }
    public static int Power(int a, int n){
        int x = 1;
        if (n >= 1){
            x = a * Power(a, n-1);
        } else {
            x = 1;
        }
        return x;
    }
}