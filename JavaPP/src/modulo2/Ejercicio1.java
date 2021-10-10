package modulo2;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("post incremento");
		System.out.println("---------------");
		int a = 0;
		int b = a++;
		System.out.println("\nint a = 0");
		System.out.println("int b = a++");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int i = 6;
		int j = i++;
		System.out.println("\nint i = 6");
		System.out.println("int j = i++");
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		
		System.out.println("\npre incremento");
		System.out.println("--------------");
		int c = 0;
		int d = ++c;
		System.out.println("\nint c = 0");
		System.out.println("int d = ++c");
		System.out.println("c=" + c);
		System.out.println("d=" + d);

		int k = 6;
		int l = ++k;
		System.out.println("\nint k = 6");
		System.out.println("int l = ++k");
		System.out.println("k=" + k);
		System.out.println("l=" + l);

				System.out.println("\ndesplazamiento de bits");
		System.out.println("----------------------");
		int m = 1357;
		int n = m>>5;
		System.out.println("el valor de  " + m + " desplazado 5 lugares es =  " + n);
		m = -1357;
		n = m>>5;
		System.out.println("el valor de " + m + " desplazado 5 lugares es = " + n);
		
	}

}
