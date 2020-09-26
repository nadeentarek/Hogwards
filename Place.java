
public abstract class Place implements Character,Object{
	String description;
    String Char;
    String Obj1;
    String Obj2;
    int pos;
    public Place (String d, String C, String O1, String O2, int pos) {
    	this.description = d;
    	this.Char = C;
        this.Obj1 = O1; 
        this.Obj2 = O2;
        this.pos = pos;
    }
    public void look() {}
    public int walk(String d) {
    	return -1;
    }
    public String getdescp() {
    	return this.description;
    }
    public String getChar() {
    	return this.Char;
    }
    public String getObj1() {
    	return this.Obj1;
    }
    public String getObj2() {
    	return this.Obj2;
    }
    public int getpos() {
    	return pos;
    }
    
}
