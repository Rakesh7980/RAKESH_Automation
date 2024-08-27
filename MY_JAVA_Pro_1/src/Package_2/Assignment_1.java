package Package_2;

public class Assignment_1 {

	public int sum(int a, int b)
	{	
		int c=a+b;
		System.out.println("sum result" +c);
		return c;	
	}
	public int mul(int h, int i)
	{
		int j;
		j=h*i;
		System.out.println("mul result" +j);
		return j;
	}
	public int sub(int e, int f)
	{
		int g;
		g=e-f;
		System.out.println("sub result" +g);
		return g;
	}
	public void divide(int x, int y)
	{
		int z;
		z=x/y;
		System.out.println("divide result" +z);
	}
	//(((((10+2)*2)-2)*2)/2)
	public static void main(String[] args) {
		Assignment_1 a1 = new Assignment_1();
		int add=a1.sum(10, 2);
		int multiply = a1.mul(add, 2);
		int subtra=a1.sub(multiply,2);
		int multiA=a1.mul(subtra,2);
		a1.divide(multiA, 2);
				
	}
}
