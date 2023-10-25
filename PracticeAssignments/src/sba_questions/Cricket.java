package sba_questions;

import java.text.DecimalFormat;

public class Cricket implements Sport {

	int[] playerIDs = {};

	Cricket() {

		for (int i = 1; i < 11; i++) {
			playerIDs[i] = i;
		}
		System.out.println("A new cricket team has been formed");
	}

	@Override
	public void calculateAvgAge(int[] age) {
		double sum = 0;
		for (int age1 = 0; age1 < age.length; age1++) {

			sum = sum + age[age1];
		}
		// System.out.println("sum "+sum);
		double avg = sum / age.length;

		System.out.println("The average age of the team is " + new DecimalFormat("####.##").format(avg)); // we are
	}

	@Override
	public void retirePlayer(int id) {
		if (playerIDs[id] == -1) {
			System.out.println("Player has already retired");

		} else {
			System.out.println("Player with id: " + id + " has retired");
		}
	}
}
