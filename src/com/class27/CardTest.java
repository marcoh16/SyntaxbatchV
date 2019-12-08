package com.class27;

public class CardTest {

	public static void main(String[] args) {

		//take an object of the child class and give refence to the parent
		//reference variable- card = new object that is being created AX()
		Card card = new AX();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2 = new Visa();
		card2.creditLimit();
		
		AX ax1 = new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1 = new MC();
		mc1.chargeInterest();
		mc1.creditLimit();
		
		MC mc2 = new MC();
		MC mc3 = new MC();
		
		//loop for MC
		MC[] masterCards = {mc1, mc2, mc3};
		for(MC mCard:masterCards) {
			mCard.cashBack();
			mCard.creditLimit();
			
		}
		//loop for Card
		int[] numArray={10,12,13};
		String [] stringArray = {"aa","bb"};
		Card[] cardArray = {card, card1, card2};
		
		Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
		
		for(Card myCard:cardArray) {
			myCard.chargeInterest();
			myCard.creditLimit();
			
		}
		for (int y=0; y<cardArray.length; y++) {
			cardArray[y].creditLimit();
		}
		
	}

}
