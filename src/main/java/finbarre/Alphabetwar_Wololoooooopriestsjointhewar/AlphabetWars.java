package finbarre.Alphabetwar_Wololoooooopriestsjointhewar;

import java.util.LinkedHashMap;

public class AlphabetWars {
	public static String woLoLoooooo(String battlefield) {

		LinkedHashMap<String, Integer> leftMap = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> rightMap = new LinkedHashMap<>();

		leftMap.put("t", 0);
		leftMap.put("s", 1);
		leftMap.put("b", 2);
		leftMap.put("p", 3);
		leftMap.put("w", 4);

		rightMap.put("j", 0);
		rightMap.put("z", 1);
		rightMap.put("d", 2);
		rightMap.put("q", 3);
		rightMap.put("m", 4);

		int leftScore = 0;
		int rightScore = 0;
		boolean foundNextJ = false;
		boolean foundNextT = false;
		boolean foundPreviousJ = false;
		boolean foundPreviousT = false;
		boolean changedNext = false;

		for (int i = 0; i < battlefield.length(); i++) {
			String letter = Character.toString(battlefield.charAt(i));
			foundNextJ = false;
			foundNextT = false;
			foundPreviousJ = false;
			foundPreviousT = false;

			if (leftMap.get(letter) != null) {
				// find next j
				if (i < battlefield.length() - 2) {
					if (Character.toString(battlefield.charAt(i + 2)).equals("j")
							|| Character.toString(battlefield.charAt(i + 1)).equals("j")) {
						foundNextJ = true;
					}
				}
				// find prevoius j
				if (i > 1) {
					if (Character.toString(battlefield.charAt(i - 2)).equals("j")) {
						foundPreviousJ = true;
					}
				}
				if (letter.equals("t")) {
					changedNext = false;
					if ((i == 0 && leftMap.get(letter) == null) || (i < battlefield.length() - 1
							&& rightMap.get(Character.toString(battlefield.charAt(i + 1))) != null // change next
							&& !foundNextJ)) {
						leftScore = leftScore + rightMap.get(Character.toString(battlefield.charAt(i + 1)));
						changedNext = true;
					}
					if (i > 0 && rightMap.get(Character.toString(battlefield.charAt(i - 1))) != null
							&& !foundPreviousJ) { // change previous

						leftScore = leftScore + rightMap.get(Character.toString(battlefield.charAt(i - 1)));
					}
					if (changedNext)
						i++;

				} else if (i == battlefield.length() - 1
						|| (i < battlefield.length() - 1 && !Character.toString(battlefield.charAt(i + 1)).equals("j"))
						|| (Character.toString(battlefield.charAt(i + 1)).equals("j")
								&& (i > 0 && Character.toString(battlefield.charAt(i - 1)).equals("t")))) {
					leftScore = leftScore + leftMap.get(letter);
				}
			}

			if (rightMap.get(letter) != null) {
				// find t
				if (i < battlefield.length() - 2) {
					if (Character.toString(battlefield.charAt(i + 2)).equals("t")
							|| Character.toString(battlefield.charAt(i + 1)).equals("t")) {
						foundNextT = true;
					}
				}
				// find prevoius t
				if (i > 1) {
					if (Character.toString(battlefield.charAt(i - 2)).equals("t")) {
						foundPreviousT = true;
					}
				}
				if (letter.equals("j")) {

					changedNext = false;
					if ((i == 0 && rightMap.get(letter) == null) || (i < battlefield.length() - 1
							&& leftMap.get(Character.toString(battlefield.charAt(i + 1))) != null && !foundNextT)) {
						rightScore = rightScore + leftMap.get(Character.toString(battlefield.charAt(i + 1))); // change
																												// next
						changedNext = true;
					}

					if (i > 0 && leftMap.get(Character.toString(battlefield.charAt(i - 1))) != null
							&& !foundPreviousT) { // change previous
						rightScore = rightScore + leftMap.get(Character.toString(battlefield.charAt(i - 1)));
					}
					if (changedNext)
						i++;
				} else if (i == battlefield.length() - 1
						|| (i < battlefield.length() - 1 && !Character.toString(battlefield.charAt(i + 1)).equals("t"))
						|| (Character.toString(battlefield.charAt(i + 1)).equals("t")
								&& (i > 0 && Character.toString(battlefield.charAt(i - 1)).equals("j")))) {

					rightScore = rightScore + rightMap.get(letter);
				}
			}
		}

		if (leftScore > rightScore) {
			return "Left side wins!";
		} else if (leftScore < rightScore) {
			return "Right side wins!";
		} else {
			return "Let's fight again!";
		}
	}
}
