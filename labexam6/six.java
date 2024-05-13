package labexam6;

public class Six {

    public static void main(String[] args) {
        int[] originalArray = {3, 7, 1, 9, 4};
        deleteElement(originalArray, 1); // Deleting element at index 1

        System.out.println("Modified Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }

    public static void deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return;
        }
        int[] newArray = new int[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newIndex++] = array[i];
            }
        }
        
        for (int i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
    }
}
