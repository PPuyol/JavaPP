package modulo4;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("***Suma de números pares con if***");
		int resto =0;
		int sumo = 0;
		for (int i = 0; i < 20; i++) {
			resto = i%2;
			//System.out.println("i = " + i);
			//System.out.println("resto = " + resto);
			if (resto == 0) {
				//System.out.println("número par = " + i);
				sumo = sumo + i;
			}
		}
		System.out.println("\nSuma de números pares = " + sumo);
	
		System.out.println("\n\n***Suma de números pares con algoritmo***");
		resto =0;
		sumo = 0;
		for (int i = 0; i < 20; i++) {
			int j = (i * (1 - i%2));
			sumo = sumo + (i * (1 - i%2));
		}
		System.out.println("\nSuma de números pares = " + sumo);
	}
}
