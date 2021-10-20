package modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Alumno extends Persona {
	private int legajo;
	
	public Alumno() {
		//llamar al constructor del padre
		super();
	}

	public Alumno(String pNom, String pApe, int pLegajo) {
		super(pNom, pApe);
		legajo = pLegajo;
	}
	
	public float getLegajo() {
		return legajo;
	}

	public boolean equals(Object obj) {
		boolean bln=false;
		if(obj instanceof Alumno) { 
			Alumno al = (Alumno) obj;
			bln=super.equals(al) 					 && 
				obj instanceof Alumno 				 &&
				((Alumno) obj).getLegajo() == legajo;
		}
		return bln;
	}
		
	public int hashCode() {
		return super.hashCode() + (int) legajo;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(", legajo=");
		sb.append( legajo);

		return sb.toString();
	}
}
