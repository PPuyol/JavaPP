package modulo7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CajaDeAhorro extends Cuenta {
	//atributos
	private float interes; 
	
	//constructores
	public CajaDeAhorro() {
		//llamar al constructor del padre
		super();
	}

	public CajaDeAhorro(int pNum, float pSaldo, float pInteres) {
		super(pNum, pSaldo);
		interes = pInteres;
	}
	
	public float getInteres() {
		return interes;
	}
		
	public void setInteres(float interes) {
		this.interes = interes;
	}

	@Override
	public void debitar(float pMonto) {
		if(pMonto<=getSaldo())
			//pongo el saldo protected para poder verlo
			saldo-=pMonto;
	}

	public boolean equals(Object obj) {
		boolean bln=false;
		if(obj instanceof CajaDeAhorro) { 
			CajaDeAhorro ca = (CajaDeAhorro) obj;
			bln=super.equals(ca) 			&& 
					obj instanceof CajaDeAhorro &&
					((CajaDeAhorro) obj).getInteres() == interes;
		}
		return bln;
		
		//&& concatena sentencias, pongo el if de intancie detro del return
		//return super.equals(obj) 			&& 
		//		obj instanceof CajaDeAhorro &&
		//		((CajaDeAhorro) obj).getInteres() == interes;
	}

	public int hashCode() {
		return super.hashCode() + (int) interes;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(", interes=");
		sb.append( interes);

		return sb.toString();
	}

	
}