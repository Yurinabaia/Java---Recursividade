
public class Exercicio4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int resto = 93;
		System.out.println(Euclidise(14400,resto, resto));
	}	
	public static int Euclidise(int num, int num2, int resto) 
	{
		if(num % resto == 0 && num2 % resto == 0) 
		{
			return resto;
		}
		else
		{
			if(num % num2 != 0) 
			{
				if(num % resto != 0) 
				{
					resto = num % resto;
				}
			}
			if(num2 % num != 0) 
			{
				if(num2 % resto != 0) 
				{
					resto = num2 % resto;
				}
			}
			if(num % resto != 0) 
			{
				resto = num % resto;
			}
			if(num2 % resto != 0) 
			{
				resto = num2 % resto;
			}
			return Euclidise(num,num2, resto);
		}
	}
}
