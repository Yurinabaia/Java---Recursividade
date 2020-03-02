
public class Exercicio4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(Euclidise(144,96));
	}	
	public static int Euclidise(int num, int num2) 
	{

		if(num % num2 == 0) 
		{
			return num2;
		}
		else 
		{
			return Euclidise(num,num % num2);
		}
	}

}
