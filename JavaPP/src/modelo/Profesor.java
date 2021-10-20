package modelo;

public class Profesor extends Persona {

	String iosfa;

	public Profesor() {
		super();
	}

	public Profesor(String pNom, String pApe, String pIosfa) {
		super(pNom, pApe);
		iosfa = pIosfa;
	}

	public String getIosfa() {
		return iosfa;
	}


	public boolean equals(Object obj) {
		boolean bln=false;
		if(obj instanceof Profesor) { 
			Profesor pr = (Profesor) obj;
			bln=super.equals(pr) 					 && 
				obj instanceof Profesor 				 &&
				((Profesor) obj).getIosfa() == iosfa;
		}
		return bln;
	}
			
	//public int hashCode() {
	//	return super.hashCode() + iosfa;
	//	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(", iosfa=");
		sb.append( iosfa);

		return sb.toString();
	}
	
}
