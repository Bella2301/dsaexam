package labexam5;

//Use mergesort to sort the numbers you entered in question 1.
class five {

	public static void merge_sort(int[] nums, int left, int right) {
		if (right > left) {
			int m = (left + right) / 2;
			merge_sort(nums, left, m);
			merge_sort(nums, m + 1, right);
			merge(nums, left, m, right);
		}
	}
	
	public static void merge(int[] A, int left, int middle, int right) {
		int [] leftTmpArray = new int[middle-left+2];
		int [] rightTmpArray = new int[right-middle+1];
		
		for(int i=0;i<=middle-left;i++)
			leftTmpArray[i]= A[left+i];
		for(int i=0;i<right-middle;i++)
			rightTmpArray[i]= A[middle+1+i];
		
		leftTmpArray[middle-left+1]= Integer.MAX_VALUE;
		rightTmpArray[right-middle] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {
			if (leftTmpArray[i] < rightTmpArray[j]) {
				A[k] = leftTmpArray[i];
				i++;
			} else {
				A[k] = rightTmpArray[j];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		//array used in question 1
		int[] array = {1,2,1,8};
		merge_sort(array, 0, array.length-1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
