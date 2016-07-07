package Cards;

import java.util.ArrayList;
import java.util.Random;

public class Rummy {
	Cards cardSequence[] = new Cards[13];
	int joker;

	Rummy(int[] sequence) {
		for (int i = 0; i < sequence.length; i++) {
			cardSequence[i] = new Cards(sequence[i]);
		}
		joker = (int) Math.floor(Math.random() * 52);
	}

	boolean compareSet(Cards card1, Cards card2, Cards card3) {
		if (card1.isSameSuit(card2)) {
			return false;
		}
		if (card2.isSameSuit(card3)) {
			return false;
		}
		if (card3.isSameSuit(card1)) {
			return false;
		}
		return true;
	}

	void maintainSet() {

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 11; j++) {
				if (i != j) {
					if (compareSet(cardSequence[i], cardSequence[j],
							cardSequence[j + 1])) {
						// System.out.println(cardSequence[i].sequence+" "+cardSequence[j].sequence+" "+cardSequence[j+1].sequence);
						System.out.println("got triple");
						return;
					}
				}
			}
		}
	}

	Cards generaterandomjoker() {
		int seq;
		Random r = new Random();
		seq = r.nextInt(51 - 0 + 1) + 0;
		Cards joker = new Cards(seq);
		return joker;
	}

	boolean issequencewithjoker(ArrayList<Cards> ar, Cards joker) {
		/*
		 * boolean ret = true;
		 */
		return true;
	}

	boolean isNaturalsequence(ArrayList<Cards> ar) {

		Cards currentcard;
		int count = 0;
		int i;
		int z;
		for (int k = 0; k < ar.size() - 1; k++) {
			currentcard = ar.get(k);
			z = ar.indexOf(currentcard) + 1;
			for (i = z; i <= z + 2 && i < 10; i++) {
				if ((ar.get(i).sequence - currentcard.sequence) == -1) {
					count++;
					currentcard = ar.get(++k);

				} else
					break;

			}
			if (count >= 3)
				return true;
			else
				return false;

		}
		return true;

	}

}
