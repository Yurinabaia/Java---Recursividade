public class Exercicio2 {

	public static void main(String[] args)
	{
		for (int i = 0; i < 4; i++) {
			System.out.println("A pontencia de "+ 2 + " elevado " + i + "= " + Pot(2,i) );
		}
	}
	public static int Pot(int a, int b ) 
	{
		if(b == 0) 
		{
			return 1;
		}
		else if(b%2 == 0)
		{
			return Pot(a,b/2)*Pot(a,b/2);
		}
		else 
		{
			return  a * Pot(a,b/2) * Pot(a,b/2);
		}
	}

}
