package Cards;

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
//		System.out.println(card1.isSameSuit(card2) + " " + card2.sequence + " "
//				+ card1.sequence + " " + card3.sequence);
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

	void maintain() { 

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 11; j++) {
				if(i!=j){
				if (compareSet(cardSequence[i], cardSequence[j],
						cardSequence[j + 1])) {
					//System.out.println(cardSequence[i].sequence+" "+cardSequence[j].sequence+" "+cardSequence[j+1].sequence);
					System.out.println("got triple");
					return;
				}
				}
			}
		}
	}
}
