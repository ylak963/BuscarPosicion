package es.studium.BuscarPosicion;

import java.util.Scanner;

public class BuscarPosicion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		String frase;
		char c;
		int posicion=-1;

		System.out.println("Introduce una frase:");
		frase=teclado.nextLine();

		System.out.println("Introduce el carácter deseado:");
		c=teclado.next().charAt(0);

		for(int i=0; i<frase.length(); i++)
		{
			if(frase.charAt(i)==c)
			{
				posicion=i;
				i=frase.length();
			}
		}
		if(posicion==1)
		{
			System.out.println("No encontrado");
		}
		else
		{
			System.out.println("Se ha encontrado en la posicion"+" " +(posicion+1));
		}
		teclado.close();
	}
}
