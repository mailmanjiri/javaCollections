package homeWork8;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// Create a Int Array[] with unsorted numbers and sort without using Arrays.sort() function
		int [] a= {31,5,22,4,87,120,89,32,32};
        System.out.println("Array before sorting: "+Arrays.toString(a));

		int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    // swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
		

	         }

                }
             }
        System.out.println("Array after sorting: "+Arrays.toString(a));
	}
}