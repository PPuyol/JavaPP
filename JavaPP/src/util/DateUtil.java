package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

public class DateUtil {

	//a. static int getAnio(Date fecha)	
	public static int getAnio(Date pFecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(pFecha);
		return cal.get(Calendar.YEAR);
		
	}

	//b. static int getMes(Date fecha)
	public static int getMes(Date Fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(Fecha);
		return cal.get(Calendar.MONTH) + 1;
	}

	//c. static int getDia(Date fecha)
	public static int getDia(Date Fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(Fecha);
		return cal.get(Calendar.DATE);
	}

	//d. static boolean isFinDeSemana(Date fecha)
	public static boolean isFinDeSemana(Date Fecha) {
		Calendar cal = Calendar.getInstance();
		//boolean FinDeSemana = false;
		cal.setTime(Fecha);
		return (cal.get(Calendar.DAY_OF_WEEK) ==  Calendar.SUNDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY);
		}
				

	//e. static boolean isDiaDeSemana(Date fecha)

	//f. static int getDiaDeSemana(Date fecha)
	//public static int getDiaDeSemana(Date Fecha) {
	//	Calendar cal = Calendar.getInstance();
	//	cal.setTime(Fecha);
	//	return cal.get(Calendar.DAY_OF_WEEK);
	//}

	
	//g. static Date asDate(String pattern, String fecha)
	//dd-MM-YYYY
	//0123456789
	//public static Date asDate() {
	//	SimpleDateFormat strFechaForm = new SimpleDateFormat("dd-MM-yyyy");
	//	Object strPattern;
	//	if(strPattern.equal("dd-MM-YYYY")) {
	//		int dia =Integer.parseInt(strFecha.subString(0, 2));
	//		int mes =Integer.parseInt(strFecha.subString(3, 5));
	//		int anio=Integer.parseInt(strFecha.subString(6));
	//		Calendar cal = Calendar.getInstance();
	//		cal.set(dia,  mes-1, anio);
	//		Date result = cal.getTime();
	//	}
		//else if strPattern.equal ("MM-dd-YYYY") {
		
		//}
	//}
	
	//h. static Calendar asCalendar(String pattern, String fecha)
	//i. static String asString(String pattern, Date fecha)
	
}

