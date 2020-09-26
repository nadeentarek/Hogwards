import java.util.Scanner;
import java.util.Random; 

public class Dining_Hall extends Place implements Character, Object{
	String [] avaliablePos = {"south"};
	public Dining_Hall() {
		super("You arrived at the biggest open area the dinning hall, try not to get lost","dumbledore", "sorting hat", "food",1);
	}
	@Override
	public void look () {
		System.out.println("The dining hall is the biggest open area inside Hogwarts. Professor Dumbledore is in the hall to welcome new students.");
	}
	@Override
	public int walk(String d) {
		Scanner cin = new Scanner(System.in);
		while(true) {
			for(int i=0; i< avaliablePos.length;i++) {
				if((d.contains(avaliablePos[i])) && (d.contains("walk"))) {
					return i;
				}
			}
			System.out.println("You cannot go there!!.\nTry another destination.");
			d=cin.nextLine();
			d = d.toLowerCase();
		}
	}
	@Override
	public void talk(String MP){
		Scanner cin = new Scanner(System.in);
		while(true) {
			if(MP.contains(this.Char) && MP.contains("talk")){
				System.out.println("Welcome to the dining hall! Interact with the sorting hat to be sorted\r\n" + 
						"into a house, then enjoy the food served in the hall.");
				break;
			}
			System.out.println("Who is this?\nPlease enter a valid person to talk to");
			MP =cin.nextLine();
			MP = MP.toLowerCase();
		}
	}
	@Override
	public void use(String MP) {
		Scanner cin = new Scanner(System.in);
		Random rand = new Random();
		String [] houses = {"Gryffindor","Hufflepuff","Ravenclaw" ,"Slytherin"} ;
		int r = rand.nextInt(4);
		while (true)
		{
			if(MP.contains(Obj1) && MP.contains("use")){
				System.out.println("Congraulation!!\nYou have been sorted to "+  houses[r] + "!.");
				break;
			}else if(MP.contains(Obj2) && MP.contains("use")) {
				System.out.println("Yummyyyyy!!! I feel energized");
				break;
			}

		    System.out.println("There is no such object here!\nPlease try using an existing one");
			MP =cin.nextLine();
			MP = MP.toLowerCase();
		}
	}
}
