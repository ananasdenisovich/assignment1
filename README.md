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
