package ModelCard;

import java.util.ArrayList;

public class CardFactory {
	public ArrayList<Card> originalCardList;
	public ArrayList<Card> originalPickedCardList;
	public Card hideCard;
	
	
	public ArrayList<Card> getOriginalCardList() {
		return originalCardList;
	}
	
	public void setOriginalCardList(ArrayList<Card> originalCardList) {
		this.originalCardList = originalCardList;
	}
	
	public ArrayList<Card> getOriginalPickedCardList() {
		return originalPickedCardList;
	}
	
	public void setOriginalPickedCardList(ArrayList<Card> originalPickedCardList) {
		this.originalPickedCardList = originalPickedCardList;
	}
	
	public Card getHideCard() {
		return hideCard;
	}
	
	public void setHideCard(Card hideCard) {
		this.hideCard = hideCard;
	}
	
	public void createOriginalCard() {
		originalCardList = new ArrayList<Card>();
		
		// họ nhà tép
		originalCardList.add(new Card(0, "tep", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3tep.png"));
		originalCardList.add(new Card(1, "tep", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4tep.png"));
		originalCardList.add(new Card(2, "tep", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5tep.png"));
		originalCardList.add(new Card(3, "tep", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6tep.png"));
		originalCardList.add(new Card(4, "tep", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7tep.png"));
		originalCardList.add(new Card(5, "tep", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8tep.png"));
		originalCardList.add(new Card(6, "tep", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9tep.png" ));
		originalCardList.add(new Card(7, "tep", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10tep.png"));
		originalCardList.add(new Card(8, "tep", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jtep.png"));
		originalCardList.add(new Card(9, "tep", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qtep.png"));
		originalCardList.add(new Card(10, "tep", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Ktep.png"));
		originalCardList.add(new Card(11, "tep", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Atep.png"));
		originalCardList.add(new Card(12, "tep", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2tep.png"));
		
		// họ nhà rô
		originalCardList.add(new Card(13, "ro", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3ro.png"));
		originalCardList.add(new Card(14, "ro", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4ro.png"));
		originalCardList.add(new Card(15, "ro", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5ro.png"));
		originalCardList.add(new Card(16, "ro", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6ro.png"));
		originalCardList.add(new Card(17, "ro", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7ro.png"));
		originalCardList.add(new Card(18, "ro", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8ro.png"));
		originalCardList.add(new Card(19, "ro", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9ro.png"));
		originalCardList.add(new Card(20, "ro", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10ro.png"));
		originalCardList.add(new Card(21, "ro", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jro.png"));
		originalCardList.add(new Card(22, "ro", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qro.png"));
		originalCardList.add(new Card(23, "ro", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kro.png"));
		originalCardList.add(new Card(24, "ro", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Aro.png"));
		originalCardList.add(new Card(25, "ro", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2ro.png"));
		
		// họ nhà cơ
		originalCardList.add(new Card(26, "co", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3co.png"));
		originalCardList.add(new Card(27, "co", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4co.png"));
		originalCardList.add(new Card(28, "co", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5co.png"));
		originalCardList.add(new Card(29, "co", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6co.png"));
		originalCardList.add(new Card(30, "co", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7co.png"));
		originalCardList.add(new Card(31, "co", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8co.png"));
		originalCardList.add(new Card(32, "co", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9co.png"));
		originalCardList.add(new Card(33, "co", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10co.png"));
		originalCardList.add(new Card(34, "co", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jco.png"));
		originalCardList.add(new Card(35, "co", "Q", "Resource//Qco.png"));
		originalCardList.add(new Card(36, "co", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kco.png"));
		originalCardList.add(new Card(37, "co", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Aco.png"));
		originalCardList.add(new Card(38, "co", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2co.png"));
		
		// họ nhà bích
		originalCardList.add(new Card(39, "bich", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3bich.png"));
		originalCardList.add(new Card(40, "bich", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4bich.png"));
		originalCardList.add(new Card(41, "bich", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5bich.png"));
		originalCardList.add(new Card(42, "bich", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6bich.png"));
		originalCardList.add(new Card(43, "bich", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7bich.png"));
		originalCardList.add(new Card(44, "bich", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8bich.png"));
		originalCardList.add(new Card(45, "bich", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9bich.png"));
		originalCardList.add(new Card(46, "bich", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10bich.png"));
		originalCardList.add(new Card(47, "bich", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jbich.png"));
		originalCardList.add(new Card(48, "bich", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qbich.png"));
		originalCardList.add(new Card(49, "bich", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kbich.png"));
		originalCardList.add(new Card(50, "bich", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Abich.png"));
		originalCardList.add(new Card(51, "bich", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2bich.png"));
		
	}
	
	public void createPickedCard() {
		originalPickedCardList = new ArrayList<Card>();
		
		// picked card họ nhà tép
		originalPickedCardList.add(new Card(0, "tep", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3teppicked.png"));
		originalPickedCardList.add(new Card(1, "tep", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4teppicked.png"));
		originalPickedCardList.add(new Card(2, "tep", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5teppicked.png"));
		originalPickedCardList.add(new Card(3, "tep", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6teppicked.png"));
		originalPickedCardList.add(new Card(4, "tep", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7teppicked.png"));
		originalPickedCardList.add(new Card(5, "tep", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8teppicked.png"));
		originalPickedCardList.add(new Card(6, "tep", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9teppicked.png"));
		originalPickedCardList.add(new Card(7, "tep", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10teppicked.png"));
		originalPickedCardList.add(new Card(8, "tep", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jteppicked.png"));
		originalPickedCardList.add(new Card(9, "tep", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qteppicked.png"));
		originalPickedCardList.add(new Card(10, "tep", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kteppicked.png"));
		originalPickedCardList.add(new Card(11, "tep", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Ateppicked.png"));
		originalPickedCardList.add(new Card(12, "tep", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2teppicked.png"));
		
		// picked card nhà họ rô
		originalPickedCardList.add(new Card(13, "ro", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3ropicked.png"));
		originalPickedCardList.add(new Card(14, "ro", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4ropicked.png"));
		originalPickedCardList.add(new Card(15, "ro", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5ropicked.png"));
		originalPickedCardList.add(new Card(16, "ro", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6ropicked.png"));
		originalPickedCardList.add(new Card(17, "ro", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7ropicked.png"));
		originalPickedCardList.add(new Card(18, "ro", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8ropicked.png"));
		originalPickedCardList.add(new Card(19, "ro", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9ropicked.png"));
		originalPickedCardList.add(new Card(20, "ro", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10ropicked.png"));
		originalPickedCardList.add(new Card(21, "ro", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jropicked.png"));
		originalPickedCardList.add(new Card(22, "ro", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qropicked.png"));
		originalPickedCardList.add(new Card(23, "ro", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kropicked.png"));
		originalPickedCardList.add(new Card(24, "ro", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Aropicked.png"));
		originalPickedCardList.add(new Card(25, "ro", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2ropicked.png"));
		
		// picked card nhà họ cơ
		originalPickedCardList.add(new Card(26, "co", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3copicked.png"));
		originalPickedCardList.add(new Card(27, "co", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4copicked.png"));
		originalPickedCardList.add(new Card(28, "co", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5copicked.png"));
		originalPickedCardList.add(new Card(29, "co", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6copicked.png"));
		originalPickedCardList.add(new Card(30, "co", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7copicked.png"));
		originalPickedCardList.add(new Card(31, "co", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8copicked.png"));
		originalPickedCardList.add(new Card(32, "co", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9copicked.png"));
		originalPickedCardList.add(new Card(33, "co", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10copicked.png"));
		originalPickedCardList.add(new Card(34, "co", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jcopicked.png"));
		originalPickedCardList.add(new Card(35, "co", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qcopicked.png"));
		originalPickedCardList.add(new Card(36, "co", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kcopicked.png"));
		originalPickedCardList.add(new Card(37, "co", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Acopicked.png"));
		originalPickedCardList.add(new Card(38, "co", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2copicked.png"));
		
		// picked card nhà họ bích
		originalPickedCardList.add(new Card(39, "bich", "3", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\3bichpicked.png"));
		originalPickedCardList.add(new Card(40, "bich", "4", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\4bichpicked.png"));
		originalPickedCardList.add(new Card(41, "bich", "5", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\5bichpicked.png"));
		originalPickedCardList.add(new Card(42, "bich", "6", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\6bichpicked.png"));
		originalPickedCardList.add(new Card(43, "bich", "7", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\7bichpicked.png"));
		originalPickedCardList.add(new Card(44, "bich", "8", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\8bichpicked.png"));
		originalPickedCardList.add(new Card(45, "bich", "9", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\9bichpicked.png"));
		originalPickedCardList.add(new Card(46, "bich", "10", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\10bichpicked.png"));
		originalPickedCardList.add(new Card(47, "bich", "J", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Jbichpicked.png"));
		originalPickedCardList.add(new Card(48, "bich", "Q", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Qbichpicked.png"));
		originalPickedCardList.add(new Card(49, "bich", "K", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Kbichpicked.png"));
		originalPickedCardList.add(new Card(50, "bich", "A", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\Abichpicked.png"));
		originalPickedCardList.add(new Card(51, "bich", "2", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\2bichpicked.png"));
		
	}
	
	public void createHideCard() {
		hideCard = new Card(100, "hide", "hideside", "D:\\Study\\Ky 7\\Lap trinh mang\\project\\g4_proj-026075234\\TienLenMienNam\\Resource\\hideside.png");
	}
	
	public static int whichCardIsBigger(Card card1, Card card2) {
		
		if (card1.equals(card2)) {
			return 100;
		}
		
		String pointOfCard1 = card1.getPoint();
		String pointOfCard2 = card2.getPoint();
		
		if (pointOfCard1.equals(pointOfCard2)) {
			String houseOfCard1 = card1.getHouse();
			String houseOfCard2 = card2.getHouse();
			
			if (houseOfCard1.equals("co")) {
				return 1;
			}
			
			if (houseOfCard2.equals("co")) {
				return 2;
			}
			
			if (houseOfCard1.equals("ro")) {
				return 1;
			}
			
			if (houseOfCard2.equals("ro")) {
				return 2;
			}
			
			if (houseOfCard1.equals("tep")) {
				return 1;
			}
			
			if (houseOfCard2.equals("tep")) {
				return 2;
			}
			
			if (houseOfCard1.equals("bich")) {
				return 1;
			}
			
			if (houseOfCard2.equals("bich")) {
				return 2;
			}
			
		} else {
			
			if (pointOfCard1.equals("2")) {
				return 1;
			}
			
			if (pointOfCard2.equals("2")) {
				return 2;
			}
			
			if (pointOfCard1.equals("A")) {
				return 1;
			}
			
			if (pointOfCard2.equals("A")) {
				return 2;
			}
			
			if (pointOfCard1.equals("K")) {
				return 1;
			}
			
			if (pointOfCard2.equals("K")) {
				return 2;
			}
			
			if (pointOfCard1.equals("Q")) {
				return 1;
			}
			
			if (pointOfCard2.equals("Q")) {
				return 2;
			}
			
			if (pointOfCard1.equals("J")) {
				return 1;
			}
			
			if (pointOfCard2.equals("J")) {
				return 2;
			}
			
			if (pointOfCard1.equals("10")) {
				return 1;
			}
			
			if (pointOfCard2.equals("10")) {
				return 2;
			}
			
			if (pointOfCard1.equals("9")) {
				return 1;
			}
			
			if (pointOfCard2.equals("9")) {
				return 2;
			}
			
			if (pointOfCard1.equals("8")) {
				return 1;
			}
			
			if (pointOfCard2.equals("8")) {
				return 2;
			}
			
			if (pointOfCard1.equals("7")) {
				return 1;
			}
			
			if (pointOfCard2.equals("7")) {
				return 2;
			}
			
			if (pointOfCard1.equals("6")) {
				return 1;
			}
			
			if (pointOfCard2.equals("6")) {
				return 2;
			}
			
			if (pointOfCard1.equals("5")) {
				return 1;
			}
			
			if (pointOfCard2.equals("5")) {
				return 2;
			}
			
			if (pointOfCard1.equals("4")) {
				return 1;
			}
			
			if (pointOfCard2.equals("4")) {
				return 2;
			}
			
			if (pointOfCard1.equals("3")) {
				return 1;
			}
			
			if (pointOfCard2.equals("3")) {
				return 2;
			}

		}
		
		return -1;
	}

	public static ArrayList<Card> sortDeck(ArrayList<Card> deck) {
		
		for (int i = 0; i < deck.size(); i++) {
			for (int j = 1; j < deck.size() - i; j++) {
				int kq = whichCardIsBigger(deck.get(j - 1), deck.get(j));
				if (kq == 1) {
					Card tempCard = deck.get(j - 1);
					deck.set(j -1, deck.get(j));
					deck.set(j, tempCard);
				}
			}
		}
		return (ArrayList<Card>) deck.clone();
	}
	
	public static int isComboCardBigger(ArrayList<Card> deckCombo, ArrayList<Card> deckComboTable) {
		
		ArrayList<Card> deckComboSorted = sortDeck(deckCombo);
		ArrayList<Card> deckComboTableSorted = sortDeck(deckComboTable);
		
		boolean isSanh = true;
		if (deckComboSorted.size() == 1) {
			isSanh = false;
		} else {
			for (int i = 0; i < deckComboSorted.size() - 1; i++) {
				if (deckComboSorted.get(i).getPoint().equals(deckComboSorted.get(i + 1).getPoint())) {
					// xám cô hoặc đôi thông
					isSanh = false;
					break;
				} else {
					// nếu không liên tiếp thì bài đánh lên không hợp lệ
					
					// không có sảnh 2 lá
					if (deckComboSorted.size() == 2) {
						return -1;
					}
					
					int pointOfCard1 = Integer.valueOf(deckComboSorted.get(i).getPoint());
					int pointOfCard2 = Integer.valueOf(deckComboSorted.get(i + 1).getPoint());
					
					if (pointOfCard2 != pointOfCard1 + 1) {
						// dã đến đây, tứ 100% là so sánh từ lá 2 - 3 trở lên
						// hay nói cách khác là lá đã có ít nhất lả 2 lá có điểm liên tiếp
						// nên nếu điều kiện này không thỏa thì đây là sam cô, tứ quý hoặc bộ bài không hợp lệ
						// ví dụ: 222. 567, 556, 5555
						// trước mắt thì đây không phải sảnh
						isSanh = false;
					}
				}
			}
		}
		
		// khi trên bàn chỉ có 1 lá bài
		if (deckComboTableSorted.size() == 1) {
			
			// nếu bài trên bàn chỉ có 1 lá thì các set có số lượng sau sẽ không được chấp nhận
			if (deckComboSorted.size() > 1 && (deckComboSorted.size() != 4 || deckComboSorted.size() != 6 
				|| deckComboSorted.size() != 8)) {
				return -1;
			}
			
			
			if (isSanh == false) {
				// chặt 1 heo bằng 3 đôi thông
				if (deckComboSorted.size() == 6 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
					&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())) {
					return 1;
				}
				
				// chặt 1 heo bằng 4 đôi thông
				if (deckComboSorted.size() == 8 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
					&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
					&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())) {
					return 1;
				}
				
				// chặt 1 heo bằng tứ quý
				if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
					&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(3).getPoint())) {
					return 1;
				}
			}
						
			// đánh lá đơn, đã bao gồm trường hợp chặt heo đơn bằng heo đơn lớn hơn
			if (deckComboSorted.size() == 1) {
				int kq = whichCardIsBigger(deckComboSorted.get(0), deckComboTableSorted.get(0));
				if (kq == 1) {
					return 1;
				} 
			}
			
		}
		
		// khi trên bàn có 2 lá bài
		if (deckComboTableSorted.size() == 2) {
			
			// nếu bài đánh lên như vậy thì báo bài lỗi
			if (deckComboSorted.size() < 2 && deckComboSorted.size() != 4 && deckComboSorted.size() != 6) {
				return -1;
			}
			
			// nếu bài trên bàn là heo đôi
			if (deckComboTableSorted.get(0).getPoint().equals("2") && deckComboTableSorted.get(1).getPoint().equals("2")) {
				
				if (isSanh == false) {
					// chặt heo đôi bằng tứ quý
					if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
						&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
						&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(3).getPoint())) {
						return 1;
					}
					
					// chặt heo đôi bằng 4 đôi thông
					if (deckComboSorted.size() == 8 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
						&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint()) 
						&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
						&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())) {
						return 1;
					}
					
					// chặt heo đôi bằng heo đôi lớn hơn
					if (deckComboSorted.size() == 2) {
						if (deckComboSorted.size() == 2 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
							&& whichCardIsBigger(deckComboSorted.get(1), deckComboTableSorted.get(1)) == 1) {
							return 1;
						}
					}
				}
				
			}
			
			// nếu bài đánh trên bàn là 1 đôi thông
			if (deckComboTableSorted.get(0).getPoint().equals(deckComboTableSorted.get(1).getPoint())) {
				// thì đánh bằng 1 đôi thông lớn hơn
				if (isSanh == false) {
					if (deckComboSorted.size() == 2 
						&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
						&& whichCardIsBigger(deckComboSorted.get(0), deckComboTableSorted.get(1)) == 1) {
						return 1;
					}
				}
			}
		}
		
		// khi trên bàn có 3 lá bài
		if (deckComboTableSorted.size() == 3) {
			// nếu 3 lá bài trên bàn là sám cô
			if (isSanh == false) {
				// dánh bằng sám cô lớn hơn
				if (deckComboSorted.size() == 3 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
					&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())
					&& whichCardIsBigger(deckComboSorted.get(2), deckComboTableSorted.get(2)) == 1) {
					return 1;
				}
			} else {
				// đánh bằng sảnh lớn hơn
				if (deckComboSorted.size() == 3 && whichCardIsBigger(deckComboSorted.get(2), deckComboTableSorted.get(2)) == 1) {
					return 1;
				}
				
				// 3 heo thì không hàng nào chặt được
			}
		}
		
		// khi trên bàn có 4 lá bài
		if (deckComboTableSorted.size() == 4) {
			// nếu 4 lá bài trên bàn là tứ quý
			if (isSanh == false) {
				// đánh bằng tứ quý lớn hơn
				if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint()) 
					&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())
					&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
					&& whichCardIsBigger(deckComboSorted.get(3), deckComboTableSorted.get(3)) == 1) {
					return 1;
				}
			}
			
			// nếu 4 lá bài là sảnh, đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 4 && whichCardIsBigger(deckComboSorted.get(3), deckComboTableSorted.get(3)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 5 lá bài
		if (deckComboTableSorted.size() == 5) {
			// nếu 5 lá bài là sảnh, đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 5 && whichCardIsBigger(deckComboSorted.get(4), deckComboTableSorted.get(4)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 6 lá bài
		if (deckComboTableSorted.size() == 6) {
			// nếu 6 lá là 3 đôi thông
			if (deckComboTableSorted.get(0).getPoint().equals(deckComboTableSorted.get(1).getPoint())
				&& deckComboTableSorted.get(2).getPoint().equals(deckComboTableSorted.get(3).getPoint())
				&& deckComboTableSorted.get(4).getPoint().equals(deckComboTableSorted.get(5).getPoint())) {
				
				// đánh bằng 3 đôi thông lớn hơn
				if (isSanh == false) {
					if (deckComboSorted.size() == 6 
						&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
						&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
						&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
						&& whichCardIsBigger(deckComboSorted.get(5), deckComboTableSorted.get(5)) == 1) {
						return 1;
					}
				}
			
			}
			
			// nếu 6 lá bài là sảnh, đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 6 && whichCardIsBigger(deckComboSorted.get(5), deckComboTableSorted.get(5)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 7 lá bài
		if (deckComboTableSorted.size() == 7) {
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 7 && whichCardIsBigger(deckComboSorted.get(6), deckComboTableSorted.get(6)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 8 lá bài
		if (deckComboTableSorted.size() == 8) {
			// nếu 8 lá bài là 4 đôi thông
			if (deckComboTableSorted.get(0).getPoint().equals(deckComboTableSorted.get(1).getPoint())
				&& deckComboTableSorted.get(2).getPoint().equals(deckComboTableSorted.get(3).getPoint())
				&& deckComboTableSorted.get(4).getPoint().equals(deckComboTableSorted.get(5).getPoint())
				&& deckComboTableSorted.get(6).getPoint().equals(deckComboTableSorted.get(7).getPoint())) {
				
				// đánh bằng 4 đôi thông lớn hơn
				if (isSanh == false) {
					if (deckComboSorted.size() == 4
						&& deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
						&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
						&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
						&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())
						&& whichCardIsBigger(deckComboSorted.get(7), deckComboTableSorted.get(7)) == 1) {
						return 1;
					}
				}
				
			}
			
			// nếu 8 lá bài là sảnh 8 lá
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 8 && whichCardIsBigger(deckComboSorted.get(7), deckComboTableSorted.get(7)) == 1) {
				return 1;
			}	
		}
		
		// khi trên bàn có 9 lá bài
		if (deckComboTableSorted.size() == 9) {
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 9 && whichCardIsBigger(deckComboSorted.get(8), deckComboTableSorted.get(8)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 10 lá bài
		if (deckComboTableSorted.size() == 10) {
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 10 && whichCardIsBigger(deckComboSorted.get(9), deckComboTableSorted.get(9)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 11 lá bài
		if (deckComboTableSorted.size() == 11) {
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 11 && whichCardIsBigger(deckComboSorted.get(10), deckComboTableSorted.get(10)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 12 lá bài
		if (deckComboTableSorted.size() == 12) {
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 12 && whichCardIsBigger(deckComboSorted.get(11), deckComboTableSorted.get(11)) == 1) {
				return 1;
			}
		}
		
		// khi trên bàn có 13 lá bài
		if (deckComboTableSorted.size() == 13) {
			// đánh bằng sảnh lớn hơn
			if (deckComboSorted.size() == 13 && whichCardIsBigger(deckComboSorted.get(12), deckComboTableSorted.get(12)) == 1) {
				return 1;
			}
		}
		
		return 2;
	}
	
	// hàm này để kiểm tra xem bài đánh lên lần đầu tiên hoặc bài đè lên tạo 1 round mới có hợp lệ hay không
	public static boolean isRightForBeginNewRound(ArrayList<Card> deckCombo) {
		ArrayList<Card> deckComboSorted = sortDeck(deckCombo);
		
		
		boolean isSanh = true;
		if (deckComboSorted.size() == 1) {
			isSanh = false;
		} else {
			for (int i = 0; i < deckComboSorted.size() - 1; i++) {
				if (deckComboSorted.get(i).getPoint().equals(deckComboSorted.get(i + 1).getPoint())) {
					// xám cô hoặc đôi thông
					isSanh = false;
					break;
				} else {
					// nếu không liên tiếp thì bài đánh lên không hợp lệ
					
					// không có sảnh 2 lá, bài không hợp lệ
					if (deckComboSorted.size() == 2) {
						return false;
					}
					
					int pointOfCard1 = Integer.valueOf(deckComboSorted.get(i).getPoint());
					int pointOfCard2 = Integer.valueOf(deckComboSorted.get(i + 1).getPoint());
					
					if (pointOfCard2 != pointOfCard1 + 1) {
						// dã đến đây, tứ 100% là so sánh từ lá 2 - 3 trở lên
						// hay nói cách khác là lá đã có ít nhất lả 2 lá có điểm liên tiếp
						// nên nếu điều kiện này không thỏa thì đây là sam cô, tứ quý hoặc bộ bài không hợp lệ
						// ví dụ: 222. 567, 556, 5555
						// trước mắt thì đây không phải sảnh
						isSanh = false;
					}
				}
			}
		}
		
		// bất đầu 1 round mà đánh sảnh, thì luôn hợp lệ
		if (isSanh == true) {
			return true;
		}
		
		// bất đầu 1 round mới mà đánh lá đơn, thì luôn hợp lệ
		if (deckComboSorted.size() == 1) {
			return true;
		}
		
		// bất đầu 1 round mới mà đánh 2 lá, thì chỉ được đánh 2 lá đôi
		if (deckComboSorted.size() == 2 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())) {
			return true;
		}
		
		// bắt đầu 1 round mới mà đánh 3 lá, thì chỉ được sảnh hoặc là sám cô
		if (deckComboSorted.size() == 3 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
			&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())) {
			return true;
		}
		
		
		// bắt đầu 1 round mới mà đánh 4 lá, thì chỉ được đánh sảnh hoặc là tứ quý
		if (deckComboSorted.size() == 4 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
			&& deckComboSorted.get(1).getPoint().equals(deckComboSorted.get(2).getPoint())
			&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())) {
			return true;
		}
		
		// bất đầu 1 round mới mà đánh 6 lá, thì chỉ được đánh 3 đôi thông
		if (deckComboSorted.size() == 6 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
			&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
			&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())) {
			return true;
		}
		
		// bất đầu 1 round mới mà đánh 8 lá, thì chỉ được đánh 4 đôi thông
		if (deckComboSorted.size() == 6 && deckComboSorted.get(0).getPoint().equals(deckComboSorted.get(1).getPoint())
			&& deckComboSorted.get(2).getPoint().equals(deckComboSorted.get(3).getPoint())
			&& deckComboSorted.get(4).getPoint().equals(deckComboSorted.get(5).getPoint())
			&& deckComboSorted.get(6).getPoint().equals(deckComboSorted.get(7).getPoint())) {
			return true;
		}
		
		
		return false;
	}
	
	static ArrayList<Card> deck1 = new ArrayList<Card>();
	static ArrayList<Card> deck2 = new ArrayList<Card>();
	public static void main(String[] args) {
		Card card1 = new Card(9,"bich", "5", "url");
		Card card2= new Card(6,"co", "7", "url");
		Card card3 = new Card(7,"tep", "7", "url");
		Card card4 = new Card(6,"co", "7", "url");
		
		deck1.add(card4);
		//deck1.add(card2);
		//deck1.add(card3);
		//deck1.add(card4);
		
		deck2.add(card2);
		//deck2.add(card3);
		//deck2.add(card4);
		
		sortDeck(deck1);
		sortDeck(deck2);
		
//		for (int i = 0; i < deck1.size(); i++) {
//			System.out.println(deck1.get(i).getPoint());
//			System.out.println(deck1.get(i).getHouse());
//		}
		
		System.out.println(isComboCardBigger(deck1, deck2));
	}
}
