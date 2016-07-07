package Cards;

import java.util.ArrayList;

public class TestCards {
	public static void main(String[] args) {
		Cards card1 = new Cards(9);
		Cards card2 = new Cards(19);
		Cards card3 = new Cards(29);
		Cards card4 = new Cards(30);
		Cards card5 = new Cards(10);
		Rummy rum =new Rummy(new int[]{0,12,15,13,25,19,25,26,40,39,45,51,1});
		rum.maintain();
	}

}
