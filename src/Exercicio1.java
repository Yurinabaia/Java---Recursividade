public class Exercicio1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) 
		{
			System.out.println("O valores de fibonacci na " + i + " posição = " + Fibo(i));
		}
	}
	public static int Fibo(int Valor) 
	{
		if(Valor < 2) 
		{
			return Valor;
		}
		else 
		{
			return Fibo(Valor - 1) + Fibo(Valor -2);
		}
	}

}
