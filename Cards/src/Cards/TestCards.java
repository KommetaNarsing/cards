package Cards;

import java.util.Arrays;

public class TestCards {
	public static void main(String[] args) {
		int[] seq = { 12, 38, 25, 30, 38, 19, 25, 26, 12, 39, 45, 51, 38 };
		//Arrays.sort(seq);
		Rummy rum = new Rummy(seq);
		rum.maintain();
	}

}
