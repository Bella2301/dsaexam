package labexam;

import java.util.Scanner;


public class first {
    public static int countAppearance(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The array
        int[] arr = {1, 2, 1, 8};
        System.out.println("Array: {1, 2, 1, 8}");

        
        System.out.print("Enter the number you want to search: ");
        int searchNum = scanner.nextInt();

        // Counting occurrences and displaying the result
        int appearance = countAppearance(arr, searchNum);
        if (appearance > 0) {
            System.out.println("The number " + searchNum + " appears " + appearance + " times in the array.");
        } else {
            System.out.println("The number " + searchNum + " is not present in the array.");
        }

        scanner.close();
    }
}





 /*Write a program that allows the user to enter a sequence of numbers into an 
array. The program should then prompt the user to enter a number to be 
searched. The program should determine if the number is present in the array 
and, if so, display the number of times it appears.
 
*/
