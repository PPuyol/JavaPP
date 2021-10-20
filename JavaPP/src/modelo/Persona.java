package modelo;

public abstract class Persona {

	//los atributos
	private String nombre;
	private String apellido;

	//constructores
	public Persona() {}
	public Persona(String pNom, String pApe) {
		this(); //llama al contructor vacío
		nombre = pNom;
		apellido = pApe;
	}
	
	//accesos
	//public void setNombre(String pNom)  {
	//	nombre = pNom;
	//}
	public String getNombre() {
		return nombre;
	}
	//public void setApellido(String pApe)  {
	//	apellido = pApe;
	//}
	public String getApellido() {
		return apellido;
	}
	
	public boolean equals(Object obj) {
		boolean bln = false;
		if(obj instanceof Persona) {
			//downCast (pregunto si es una instancia de persona)
			Persona per = (Persona) obj;
			bln = nombre   == per.getNombre() && 
				  apellido == per.getApellido();
		}
		return bln;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnombre=");
		sb.append(nombre);
		sb.append(", apellido=");
		sb.append(apellido);
		return sb.toString();
	}

}
