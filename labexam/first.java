package labexam;

import java.util.Scanner;

public class first {
    public static int countOccurrences(int[] arr, int num) {
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

        // Taking input for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking input for the number to be searched
        System.out.print("Enter the number to be searched: ");
        int searchNum = scanner.nextInt();

        // Counting occurrences and displaying the result
        int occurrences = countOccurrences(arr, searchNum);
        if (occurrences > 0) {
            System.out.println("The number " + searchNum + " appears " + occurrences + " time(s) in the array.");
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