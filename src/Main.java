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
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
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
            problemNum = scan.nextInt();
        } while (problemNum != 0);
    }


}