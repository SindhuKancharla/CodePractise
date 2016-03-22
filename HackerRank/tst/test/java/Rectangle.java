package test.java;

public class Rectangle {

	public Rectangle(){
		System.out.println(" IN main constructor");
	}
	void print(){
		System.out.println("In Main class");
	}
	
	public static void main(String[] args){
		
		Rectangle po = new Rectangle();
		po.print();
		
		Sub so = new Sub();
		
		
		so.print();
		
		Rectangle pb = new Sub();
		pb.print();
		
	}
	
	
}

class Sub extends Rectangle{
	
	public Sub(){
		super();
		System.out.println("in sub constructor");
	}
	
	@Override
	void print(){
		super.print();
		System.out.println("In sub class");
	}
}