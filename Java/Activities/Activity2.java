package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = { 10, 77, 10, 54, -11, 10 };

		int sum = 0;
		for (int num : numArr) {
			if (num == 10) {
				sum += num;
			}

			if (sum > 30) {
				break;
			}
		}

		if (sum == 30) {
			System.out.println("Sum value is " + sum);
		}

		else {
			System.out.println("Sum value is not 30");
		}

	}
}
