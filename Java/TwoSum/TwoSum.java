package TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 10, -2, 5, 3, 1, 7, 4 };

		twoSumArray(arr, 8);
	}

	public static void twoSumArray(int[] arr, int i) {

//		sort the array using Arrays  sort

		Arrays.sort(arr);
		int size = arr.length;
		int left = 0;
		int right = size - 1;
		List<Integer> list = new ArrayList<Integer>();

		while (left < right) {
			int diff = arr[left] + arr[right];
			if (diff < i) {
				left++;
			} else if (diff > i) {
				right--;
			} else {
				list.add(arr[left]);
				list.add(arr[right]);
				left++;
				right--;
			}
		}

		for (Integer it : list) {
			System.out.println(it);
		}
	}
}