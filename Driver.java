import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Place [] places = new Place [4];
		places[0] = new Entrance();
		places[1] = new Dining_Hall();
		places[2] = new Potions_Classroom();
		places[3] = new Library(); 
			
		System.out.println("“Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\r\n" + 
				"magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\r\n" + 
				"Say the magic phrase to reveal the map:");
		Scanner cin = new Scanner(System.in);
		String MP = cin.nextLine();
	    while (!MP.equals("I solemnly swear that I am up for no good"))
	    {
	    	System.out.println("The magic words you entered are not magical enough\nEnter the magic word CORRECTLY:");
	    	MP = cin.nextLine();
	    }
	    
	    places[0].look();  
	    Player me = new Player(0);
	    boolean t = true;
	    while(t) {
		    MP = cin.nextLine();
		    MP = MP.toLowerCase();
	    	if(MP.contains("look")) {
	    		places[me.pos].look();
	    	}
	    	else if(MP.contains("walk")) {
	    		me.pos = places[me.pos].walk(MP);
	    		System.out.println(places[me.pos].getdescp());
	    	}
	        else if(MP.contains("talk")) {
	        	places[me.pos].talk(MP);
	        	
	    	}else if(MP.contains("use")) {	
	        	places[me.pos].use(MP);
	        	
	    	}else if(MP.contains("mischief managed")) {
	        	System.out.println("Thank you for playing The Marauder's Map game, See ya!!");
	    		t = false;
	    	}
	    	else {
	        	System.out.println("Invalid command \nplease enter a valid command");
	    	}
	    }
	    
	    
	}
}
