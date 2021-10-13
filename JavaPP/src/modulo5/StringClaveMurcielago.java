package modulo5;

import java.util.Scanner;

public class StringClaveMurcielago {

	public static void main(String[] args) {
		System.out.println("***May�scula y min�scula de un string");
		System.out.println("ingrese un texto a codificar en clave murcielago");
		Scanner sc = new Scanner(System.in);
		//MURCIELAGO
		//0123456789
		
		//una vez que un string tiene un valor no se puede cambiar
		String strTextoOriginal = sc.nextLine();
		
		System.out.println("texto original = " + strTextoOriginal);
		System.out.println("todos en may�scula = " + strTextoOriginal.toUpperCase());
		System.out.println("todos en min�scula = " + strTextoOriginal.toLowerCase());
		System.out.println("texto original = " + strTextoOriginal);
		
		String strTextoMayuscula = strTextoOriginal.toLowerCase();
		System.out.println("texto en may�scula = " + strTextoMayuscula);
		
		System.out.println("\n\n***Clave Murcielago***");
		//llamado on the fly..., llamar a objetos
		String strMur = strTextoOriginal.toLowerCase()
										.replace('m',  '0')
										.replace('u',  '1')
										.replace('r',  '2')
										.replace('c',  '3')
										.replace('i',  '4')
										.replace('e',  '5')
										.replace('l',  '6')
										.replace('a',  '7')
										.replace('g',  '8')
										.replace('o',  '9');
		System.out.println("Clave Murcielago = " + strMur);
		
		//c�mo recorrer un string
		System.out.println("\n\n***Recorro un string y pongo la posici�n de cada caracter***");
		for (int i = 0; i<strTextoOriginal.length(); i++)
			System.out.println("pos " + i + " char = " + strTextoOriginal.charAt(i));
			
		
		
		
	}

}
