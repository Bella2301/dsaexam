package labexam4;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	char[] alphabet = {'A', 'S', 'C', 'C', 'I'};
	bubbleSort(alphabet);
	System.out.println("Sorted alphabets: ");
	for (char ch : alphabet) {
	    System.out.print(ch + " ");
	}


	}




// method for bubblesort 
	
public static void bubbleSort(char[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                char temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
}