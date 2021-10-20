package modulo7;

public abstract class Cuenta {
	//los atributo
	private static int cantidadDeCuentas;
	private int numero;
	protected float saldo; //significa que lo puede ver el hijo
	
	//constructores
	//es el primer m�todo que se ejecuta cuando se crea un objeto
	//cuando 2 m�todos tienen el mismo nombre y se diferencia por la cantidad o tipo de par�metros se dice SOBRE-CARGA
	//o sea, el constructor est� sobrecargado
	public Cuenta() {
		cantidadDeCuentas++;
	}
	public Cuenta(int pNum, float pSaldo) {
		this(); //llama al contructor vac�o
		numero = pNum;
		saldo = pSaldo;
	}
	//accesos
	//en el set le asigno el n�mero - el saldo se lo asigno en el debitar y acreditar
	public void setNumero(int pNum)  {
		numero=pNum;
	}
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	
	//m�todos de negocio
	public void acreditar(float pMonto) {
		saldo +=pMonto;
	}

	//public  void debitar(float pMonto) {
	//	saldo -=pMonto;
	//}
	public abstract void debitar(float pMonto);
	
	public boolean equals(Object obj) {
		boolean bln = false;
		if(obj instanceof Cuenta) {
			//downCast (pregunto si es una instancia de cuenta)
			Cuenta cue = (Cuenta) obj;
			bln = numero == cue.getNumero() && 
				  saldo  == cue.getSaldo();
		}
		return bln;
	}
	
	public int hashCode() {
		return numero + (int) saldo;
	}
	public String toString() {
		//ac� tengo que resolver 4objetos para resolver esta suma
		//return "numero=" + numero + ",saldo=" + saldo;

		//con el stringBuilder voy sumando as�:
		StringBuilder sb = new StringBuilder("\nnumero=");
		sb.append(numero);
		sb.append(", saldo=");
		sb.append(saldo);
		return sb.toString();
	}
	
}
