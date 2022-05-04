package ArrayOfIntegers;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfIntegers {
	int[] array = { 4, 3, 5, 6, 1, 2 };
	boolean flag = true;

	void method(int[] arr, boolean flag) {

		for (int i = 0; i < arr.length; i++) { // Loop over java Array outer Loop use
			for (int j = i + 1; j < arr.length; j++) { // Loop over java array
				int num = 0;
				// Temporary variable in order to compare.
				if (arr[i] > arr[j]) { // compare outer loop object with inner loop
					num = arr[i]; // if greater than swapping.
					arr[i] = arr[j]; // Swapping code here.
					arr[j] = num;
				}
			}
		}
		if (flag) {
			for (int n : arr) {
				System.out.println(n);
			}
		} else {
			for (int reverse = arr.length - 1; reverse >= 0; reverse--) {
				System.out.println(arr[reverse]);
			}
		}
	}

	public static void main(String[] args) {
		ArrayOfIntegers arrayofintegers = new ArrayOfIntegers();
		arrayofintegers.method(arrayofintegers.array, arrayofintegers.flag);
	}
}