package Cards;

public class TestCards {
	public static void main(String[] args) {
		Cards card1 = new Cards(9);
		Cards card2 = new Cards(19);
		Cards card3 = new Cards(29);
		Cards card4 = new Cards(30);
		Cards card5 = new Cards(10);
		Cards card6 = new Cards(51);
		//System.out.println(card1.compare(card2.sequence));
		System.out.println(card3.isAdjacent(card2));
		System.out.println(card1.isAdjacent(card2));
		System.out.println(card3.isAdjacent(card4));
		System.out.println(card4.isAdjacent(card3));
		System.out.println(card1.isAdjacent(card5));
		System.out.println(card2.isAdjacent(card2));
		
	}

}
