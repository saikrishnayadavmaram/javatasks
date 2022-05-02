package ArrayOfIntegers;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfIntegers {

	public int[] input = { 4, 3, 5, 1, 2 };

	public static void main(String[] args) {
		int[] input = { 4, 3, 5, 1, 2 };
		int temp;
		Boolean flag;
		if (flag = true) {
			for (int i = 0; i < input.length; i++) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] > input[j]) {
						temp = input[i];
						input[i] = input[j];
						input[j] = temp;
					}
				}

			}
			System.out.println("Ascending order:" + Arrays.toString(input));
		} else {
			for (int i = 0; i < input.length; i++) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] < input[j]) {
						temp = input[i];
						input[i] = input[j];
						input[j] = temp;

					}
				}
			}
			System.out.println("Descending order:" + Arrays.toString(input));
		}

	}
}