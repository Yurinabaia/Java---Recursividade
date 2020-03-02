
public class Exercicio3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Resultado " + Divi(3));

	}
	public static double Divi(double den) 
	{
		if(den ==1) 
		{
			return 1;
		}
		else 
		{
			return (1/den)  + Divi(den -1);
		}
	}

}
