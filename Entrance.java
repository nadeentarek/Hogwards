import java.util.Scanner;

public class Entrance extends Place implements Character, Object{
	String [] avaliablePos = {"north","east","west"};
	
	public Entrance() {
		super ("You are now at the Entrance.","player"," "," ",0);
	}
	@Override
	public void look() {
		System.out.println("The Entrance\r\n" + 
				"You arrive at the doors of Hogwarts. The door on the north wall leads to\r\n" + 
				"the dining hall, the door to the east leads to the Potions class, and\r\n" + 
				"the door to the west leads to the Library.");
	} 
	@Override
	public int walk(String d) {
		Scanner cin = new Scanner(System.in);
		while(true) {
			for(int i=0; i<avaliablePos.length;i++) {
				if((d.contains(avaliablePos[i])) && (d.contains("walk")) ) {
					return i+1;
				}

			}
			System.out.println("You cannot go there!!.\nTry another destination.");
			d=cin.nextLine();
			d=d.toLowerCase();
		}
	}
	@Override
	public void talk(String MP) {
		System.out.println("There are no characters here to talk to.\nTry different command!!");
	}
	public void use(String MP) {
		System.out.println("There are no objects here to use.\nTry going to another room!!");
	}

}
