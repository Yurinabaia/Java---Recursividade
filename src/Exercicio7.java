import java.io.*;
public class Exercicio7 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		/*
		 Caso queira ir mais rapido excluir os comentarios
		String palavra = "A grama é amarga";
		palavra = palavra.replaceAll(" ", "");//tirar os espaços da palavra
		//Caso quiser adiantar em vez do usuario digitar inverter a palavra automaticamente com Stirng invertida abaixo.
		String invertida = new StringBuilder(palavra).reverse().toString();
		*/
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite uma palavra");
		String palavra = entrada.readLine().toUpperCase();
		palavra = palavra.replaceAll(" ", "");//tirar os espaços da palavra
		char[] vetPalavra = palavra.toCharArray();
		int tamanho = palavra.length() -1;
		int tms = 0;
		char[] vetInvertido = new char[50];
		System.out.println(Palindromos(vetPalavra, vetInvertido, tamanho, tms));
	}
	public static String Palindromos(char[] vetPalavra,  char[] vetInvertido, int tmg, int vetinv) 
	{ 
		if(tmg < 0) 
		{
			String suaString = new String(vetInvertido);
			return suaString;
		}
		else
		{
			vetInvertido[vetinv] = vetPalavra[tmg];
			return Palindromos(vetPalavra, vetInvertido, tmg -1, vetinv+ 1);
		}
		
	}
}
