package es.unileon.prg.date;

public class Main {

	public static void main(String[] args) {
		try{
			Date date1 = new Date(7, 4, 2016);
			Date date2 = new Date(30, 12, 2017);
			
			System.out.println("Mes de la 1ª fecha: " + date1.monthName(date1));
			System.out.println("Mes de la 2ª fecha: " + date2.monthName(date2));
			System.out.println("Estacion de la primera fecha: " + date1.yearSeason(date1));
			System.out.println("Estacion de la segunda fecha: " + date2.yearSeason(date2));
			System.out.println("Meses hasta el final del año de la 1ª fecha: " +date1.monthsToEndOfYear(date1));
			System.out.println("Meses hasta el final del año de la 2ª fecha: " +date2.monthsToEndOfYear(date2));
			System.out.println("1ª fecha: "+ date1);
			System.out.println("2ª fecha: "+ date2);
			System.out.println("Dias hasta fin de mes de la 1ª fecha: " +date1.daysEndofMonth(date1));
			System.out.println("Dias hasta fin de mes de la 2ª fecha: " +date2.daysEndofMonth(date2));
			System.out.println("Meses con los mismos dias que el mes de la 1ª fecha: " +date1.sameDaysMonth(date1));
			System.out.println("Meses con los mismos dias que el mes de la 2ª fecha: " +date2.sameDaysMonth(date2));
			System.out.println("Dias desde el 1 de enero hasta la 1ª fecha: " +date1.daysPassed(date1));
			System.out.println("Dias desde el 1 de enero hasta la 2ª fecha: " +date2.daysPassed(date2));
			System.out.println("Intentos para adivinar 1ª fecha: "+ date1.DoWhileTriedGuessDate(date1));
			System.out.println("Intentos para adivinar 2ª fecha: "+ date2.DoWhileTriedGuessDate(date2));
			System.out.println("Dia de la semana 1ª fecha: "+ date1.dayOfWeek(date1));
			System.out.println("Dia de la semana 2ª fecha: "+ date2.dayOfWeek(date2));
		}catch(DateException exception){
			System.err.println(exception.toString());
		}
		
	}

}
