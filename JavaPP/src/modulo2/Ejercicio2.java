package modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		//byte bmin = -128;
		//byte bmax = 127;
		byte bmin = (byte) (Math.pow(-2,7));
		byte bmax = (byte) ((bmin * -1) - 1);
		short smin = (short) (Math.pow(-2,15));
		short smax = (short) ((smin * -1) - 1);
		int imin = (int) (Math.pow(-2,31));
		int imax = (int) ((imin * -1) - 1);
		long lmin = (long) (Math.pow(-2,63));
		long lmax = (long) ((lmin * -1) - 1);
		System.out.println("tipo de dato\tminimo\t\t\tmaximo");
		System.out.println("............\t......\t\t\t......");
		System.out.println("\nbyte\t\t" + bmin + "\t\t\t" + bmax);
		System.out.println("\nshort\t\t" + smin + "\t\t\t" + smax);
		System.out.println("\nint\t\t" + imin + "\t\t" +imax);
		System.out.println("\nlogn\t\t" + lmin + "\t" + lmax);

		// otra forma de calcular los mínimos y máximos
		//short smin = Short.MIN_VALUE;
		//short smax = (short) (Math.abs(smin)-1);

	}

}
