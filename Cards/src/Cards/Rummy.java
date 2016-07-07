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

	boolean compareSet(Cards card1,Cards card2,Cards card3) {
		return true;
	}

	void maintain() {
		int[] naturalSeq = new int[3];
		int[] nextseq = new int[3];
		int[] setSeq1 = new int[3];
		int[] setSeq2 = new int[3];
		for (int i = 0; i < 13; i++) {
			for (int j = i; j<11; j++) {
			compareSet(cardSequence[j],cardSequence[j+1],cardSequence[j+2]);
			}
		}
	}
}
