# assignment1
•	First, I added a switch case in a do-while loop, so that user can check any problem many times. The “enterProblem()” checks if inputted problem number is within a range 0-10 by throwing exception with try-catch:
1.	Try checks, if input is not less than 0 and not more than 10
2.	Catch ouputs the message about wrong input, allows user to write another problem number and then by using recursion checks new input again
3.	In the end, right problem number is be returned

•	PROBLEM 1: find the minimum value of given array
Code iterates every element of the array and compares it with the first element (array[0]), so if iterated element is less than array[0], it will be the new array[0] and will be compared with other elements and may change if one of other elements is less than current array[0]
In the end, method returns the final array[0] aka minimum value.
Code:
```
public static int findMin(int[] array){
        for (int i = 0; i < 5; i++){
            if (array[0] > array[i]){
                array[0] = array[i];
            }
        }
        return array[0];
    }
```
•	PROBLEM 2: find the average of elements of given array
Code finds the sum of all 4 elements and divide it by 4.
In the end, method returns division value. 
Code:
```
public static float findAv(int[] array){
        float x = 0;
        for(int i = 0; i < 4; i++){
            x += array[i];
        }
        x /= 4;
        return x;
    }
```
•	PROBLEM 3: check if a n is prime
User enters n number with Scanner.
Firstly, code checks if n is negative or even since those numbers are composite (can be divided by -1 and 2 respectively)
Secondly, in the “else” statement code sets “Prime” as default value
Thirdly, code additionally checks if any number less than half of n can be a divisor for n without remainder. We start iteration from 2 because any number can be divided by 1, we limit it with first half of n, because second half is respectively every element of the first one multiplied by 2, so it will be redundant to check both.
In the end, method returns final String. 
Code:
```
public static String Check(int n){
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
```
•	PROBLEM 4: find factorial of n
User enters n number with a Scanner. x will be its factorial.
With the use of recursion, code repeatedly multiplies n and n-1, n-2, n-3… until it reaches 1, so that all numbers between n and 1 are included. That is why we use argument n-1 in Rec(n-1) and (n >= 1) in base case.
In the end, method returns x aka value of multiplication . 
Code:
```
public static int Rec(int n){
        int x = 1;
        if (n >= 1){
            x = n * Rec(n-1);
        } else{
            x = 1;
        }
        return x;
    }
```
•	PROBLEM 5: output a Fibonacci sequence number according to its position n
User enters n number with Scanner.
By using recursion, code splits n to (n-1)+(n-2) until the value of reaches 2. EG:
Fib 8
Fib7 + fib6
Fib6 + fib5 + fib5 fib4
Fib5+fib4+fib4+fib3+fib4+fib3+fib3+fib2
Then it turns every term value to 1 and, in the end, returns their sum.
Code:
```
public static int Fib(int n){
        int x = 0;
        if (n>2){
            x = Fib(n-1) + Fib(n-2);
        } else {
            x = 1;
        }
        return x;
    }
```
