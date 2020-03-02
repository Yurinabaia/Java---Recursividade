
public class Exercicio5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("O somatorio = " + Somatorio(3));
	}
	public static int Somatorio(int n)
	{
		if(n ==0) 
		{
			return n;
		}
		else 
		{
			return n + Somatorio(n -1);
		}
	}
}
