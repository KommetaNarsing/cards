package Cards;

public class Cards {
	boolean compare(Cards card1,Cards card2){
		if(card1.pip() == card2.pip())
			return true; 
		return false;
	}
}
