
package Cards;

import java.util.ArrayList;

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

	boolean issequencewithjoker(ArrayList<Cards> ar)
	{
		boolean ret=true;
		return true;
		
	}
	boolean isNaturalsequence(ArrayList<Cards> ar)
	{
		boolean ret=true;
		for(Cards c : ar)
		{
			
		}
		return true;
	}

	void maintain() {
		int[] naturalSeq = new int[3];
		int[] nextseq = new int[3];
		int[] setSeq1 = new int[3];
		int[] setSeq2 = new int[3];
		for (int i = 0; i < 13; i++) {
			System.out.println(cardSequence[i].sequence);
			for (int j = 0; j < 11; j = j + 2) {
				if (j != i) {
					if (compareSet(cardSequence[i], cardSequence[j],
							cardSequence[j + 1])) {
						setSeq1[0] = cardSequence[i].sequence;
						setSeq1[1] = cardSequence[j].sequence;
						setSeq1[3] = cardSequence[j + 1].sequence;
						cardSequence[i] = null;
						cardSequence[j] = null;
						cardSequence[j + 1] = null;

					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(setSeq1[i]);
		}
	}
}
