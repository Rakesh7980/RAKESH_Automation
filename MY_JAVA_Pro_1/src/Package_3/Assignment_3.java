package Package_3;
//(((((10/2)-2)*2)-2)+2)
public class Assignment_3 {

	public int div (int e, int f)
	 {
		int g = e/f;
		System.out.println("divied " +g);
	    return g;
	 }
	
	public	int mul(int a, int b)
	{
		int c = a*b;
		System.out.println("Multiplication " +c);
		return c;
	}
	
	public int sub (int m, int n) 
	{
		int o = m-n;
		System.out.println("subtration " +o);
		return o;
	}
		public void add (int x , int y)
		{
			int z = x+y;
			System.out.println("addition " +z);
			
		}
		//(((((10/2)-2)*2)-2)+2)
		public static void main(String[] args) {
			Assignment_3 A3 = new Assignment_3();
			int  divied = A3.div(10, 2);
			int  subtratA = A3.sub(divied, 2);
			int  Multiply = A3.mul(subtratA, 2);
			int  subtratb = A3.sub(Multiply, 2);
			A3.add(subtratb, 2);
		
		}
		
}

