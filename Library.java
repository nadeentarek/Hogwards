import java.util.Scanner;

public class Library extends Place implements Character, Object {
	String [] avaliablePos = {"east"};
	public Library() {
		super("You entered the great library. Please stay quite", "hermione", "book", "quill",3);
	}
	@Override
	public void look() {
		System.out.println("Once the academic year starts, students spend a lot of their time in the school library.\\nYou can find Hermione stuying with her firends.");
	}
	
	@Override
	public int walk(String d) {
		Scanner cin = new Scanner(System.in);
		while(true) {
			for(int i=0; i<avaliablePos.length;i++) {
				if((d.contains(avaliablePos[i])) && (d.contains("walk"))) {
					return i;
				}
				/*if(d.equals(avaliablePos[i])) {
					return i;
				}*/
			}
			System.out.println("You cannot go there!!.\nTry another destination.");
			d=cin.nextLine();
			d=d.toLowerCase();
		}
	}
	
	@Override
	public void talk(String MP){
		Scanner cin = new Scanner(System.in);
		while(true) {
			if(MP.contains(this.Char) && MP.contains("talk")){
				System.out.println("Welcome to the library! read the books to be educated\r\n" + 
						"and use the quill to take your notes!.");
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
			if(MP.contains(Obj1) && MP.contains("use")){
				System.out.println("What an intersting book.\nI never knew such things exists!!");
				break;
			}else if(MP.contains(Obj2)&& MP.contains("use")) {
				System.out.println("I cannot miss this.\nAsk professor Snape about it later!");
				break;
			}
		    System.out.println("There is no such object here!\nPlease try using an existing one");
			MP =cin.nextLine();
			MP = MP.toLowerCase();
		}
	}
	
}
