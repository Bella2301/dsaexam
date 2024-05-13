package labexam6;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3,7,1,9,4};
		deleteElement(array,1);
	
		
		
		for(int num: array) {
			System.out.print( array + " ");
		}

		
		
		//yaredmgmt@gmail.com
		
	}


public static int[] deleteElement(int[] array, int index) {
    if (index < 0 || index >= array.length) {
        System.out.println("Invalid index.");
        return array;
    }
    int[] newArray = new int[array.length - 1];
    int newIndex = 0;
    for (int i = 0; i < array.length; i++) {
        if (i != index) {
            newArray[newIndex++] = array[i];
        }
    }
    return newArray;
}
}


/*Consider an array of integers in Java, named array, containing elements as 
follows: {3, 7, 1, 9, 4}. Write a Java method named deleteElement that 
takes two parameters: the array and an integer representing the index of the 
element to delete. 
The method should delete the element at the specified index from the array 
and return the modified array. If the index is invalid (less than 0 or greater 
than or equal to the array length), the method should print "Invalid index." 
and return the original array unchanged.*/
 