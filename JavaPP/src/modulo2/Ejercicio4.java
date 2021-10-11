package modulo2;

public class Ejercicio4 {

	public static void main(String[] args) {
		//4- Completar con el tipo de dato que corresponda, se debe tener en cuenta que la suma de 2 bytes va a sobrepasar el byte.
		byte  b=10;
		short s=20;
		int   i=30;
		long  l=40;
		int  sumabb = b + b;
		int  sumabs = b + s;
		int  sumabi = b + i;
		int  sumaii = i + i;
		long sumasl = s + l;
		System.out.println("byte  = " + b);
		System.out.println("short = " + s);
		System.out.println("int   = " + i);
		System.out.println("long  = " + l);
		System.out.println("la suma de byte + byte  es int (= " + sumabb + ")");
		System.out.println("la suma de byte + short es int (= " + sumabs + ")");
		System.out.println("la suma de byte + int   es int (= " + sumabi + ")");
		System.out.println("la suma de int  + int   es int (= " + sumaii + ")");
		System.out.println("la suma de sort + long  es long (= " + sumasl + ")");
		
		//random
		b = (byte) (Math.random() * Byte.MAX_VALUE);
		s = (short) (Math.random() * Short.MAX_VALUE);
		i = (int) (Math.random() * Integer.MAX_VALUE);
		l = (long) (Math.random() * Long.MAX_VALUE);

		sumabb = b + b;
		sumabs = b + s;
		sumabi = b + i;
		sumaii = i + i;
		sumasl = s + l;
		
		System.out.println("\n\nRandom");
		System.out.println("byte  = " + b);
		System.out.println("short = " + s);
		System.out.println("int   = " + i);
		System.out.println("long  = " + l);
		System.out.println("sumabb = " + sumabb);
		System.out.println("sumabs = " + sumabs);
		System.out.println("sumabi = " + sumabi);
		System.out.println("sumaii = " + sumaii);
		System.out.println("sumasl = " + sumasl);
		
	}

}
