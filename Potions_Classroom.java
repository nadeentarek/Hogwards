import java.util.Scanner;

public class Potions_Classroom extends Place implements Character, Object{
	String [] avaliablePos = {"west"};
	public Potions_Classroom() {
		super("You arrived to the class.\nYou are late!!\nMake sure Professor Snape does not catch you.","snape", "cauldron","potion",2);
	}
	@Override
	public void look() {
		System.out.println("Potions is one of the core subjects that first year students are required to study. You can find Professor Snape experminting magical potions.");
	}
	@Override
	public int walk(String d) {
		Scanner cin = new Scanner(System.in);
		while(true) {
			for(int i=0; i<avaliablePos.length;i++) {
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
				System.out.println("Welcome to the Potions Classroom! use the cauldron to ceate your potions\r\n" + 
						"and drink the potion to cast magical spells!.");
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
		while (true)
		{
			if(MP.contains(Obj1)&& MP.contains("use")){
				System.out.println("Lets invent something new to impress the professor!");
				break;
			}else if(MP.contains(Obj2)&& MP.contains("use")) {
				System.out.println("Apra Kadpra!!. Wow!! I never felt that before!");
				break;
			}
		    System.out.println("There is no such object here!\nPlease try using an existing one");
			MP =cin.nextLine();
			MP = MP.toLowerCase();
		}
	}
}
