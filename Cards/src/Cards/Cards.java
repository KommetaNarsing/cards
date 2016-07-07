package Cards;

public class Cards {
        int sequence;
	private Cards(int a){
		sequence=a;
	}

        String getsuit(){
	int arr[]=new int[52];
	for(int i=0;i<52;i++){
   	arr[i]=i;
	if(sequence<=12&&sequence>=0)
        return "clubs";
	if(sequence<=25&&sequence>=13)
	return "Diamonds";
	if(sequence<=38&&sequence>=26)
	return "Hearts";
	else
 	return "spades";
	}

        int pip(){
	return sequence%13+1;
	}
}
