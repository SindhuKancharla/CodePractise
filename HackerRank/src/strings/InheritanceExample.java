package strings;

public class InheritanceExample {

	public static void main(String []argh){
        Adder X=new Adder();
       
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
	
	
}

class Adder extends Arithmetic{
    
    int add(int x,int y)
    {
        return x+y;
    }
    
    
    
}

class Arithmetic{
	
	String getName(){
		return this.getName();
	}
}