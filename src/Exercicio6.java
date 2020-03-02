
public class Exercicio6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = "A CASA DO SEU ZÉ";
		char c = 'Z';
		int tamanho = s.length() - 1;
		char[] vetorS = s.toCharArray();
		if(Caracteres(vetorS, c, tamanho) == true) 
		{
			System.out.println("Existe o caracter C no vetor S");
		}
		else 
		{
			System.out.println("Não existe o caracter C no vetor S");
		}

	}
	public static boolean Caracteres(char[] vet, char C, int pos)  
	{
		if(vet[pos] == C) 
		{
			return true;
		}
		else if(pos == 0)
		{
			return false;
		}
		else 
		{
			return Caracteres(vet,C,pos -1);
		}
	}
}
