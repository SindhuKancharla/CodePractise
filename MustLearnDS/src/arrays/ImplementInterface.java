package arrays;

public class ImplementInterface implements MyInterface {

		@Override
		public int m1() {

			System.out.println("In method m1 "+ Inf2.x);
			return x;
		}
		
		@Override
		public void m2() {

			System.out.println("In method m2 x = "+x);
		}

		public static void main(String[] args)
		{
			MyInterface obj = new ImplementInterface();
			obj.m1();
			obj.m2();
		}

		
}
