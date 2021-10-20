package modulo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploCalendar {

	public static void main(String[] args) {
		//*** FECHAS *** 
		Date fechaHoy = new Date();
		System.out.println("hoy es " + fechaHoy);
		
		//Calendar es una clase abstracto y no se pueden crear objetos
		//getInstance es un m�todo est�tico //lo puedo utilizar sin necesidad de crear un objeto
		Calendar cal = Calendar.getInstance();
		System.out.println("\nhoy es " + cal);
		
		SimpleDateFormat calform = new SimpleDateFormat("EEE dd-MM-yyyy - HH:mm:ss");
		System.out.println("\nhoy es " + calform.format(fechaHoy));
		
		System.out.println("\nel numero de d�a de hoy es " + cal.get(Calendar.DATE));
		
		//si quiero saber el d�a de hoy
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("hoy es domingo");
			break;
		case Calendar.MONDAY:
			System.out.println("hoy es lunes");
			break;
		case Calendar.TUESDAY:
			System.out.println("hoy es martes");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("hoy es mi�rcoles");
			break;
		case Calendar.THURSDAY:
			System.out.println("hoy es jueves");
			break;
		case Calendar.FRIDAY:
			System.out.println("hoy es viernes");
			break;
		case Calendar.SATURDAY:
			System.out.println("hoy es s�bado");
			break;
		default:
			break;
		}
		
		//*** Operaciones con fechas ***
		cal.add(Calendar.DATE,  10);
		System.out.println("\nLa fecha de hoy mas 10 d�as es " + calform.format(cal.getTime()));
		
		cal.add(Calendar.MONTH,  3);
		System.out.println("\nLa fecha de hoy mas 3 meses es " + calform.format(cal.getTime()));
		
	}

}
