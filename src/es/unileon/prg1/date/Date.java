package es.unileon.prg1.date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

	public class Date{
		private int day;
		private int month;
		private int year;
		public Date(int day, int month, int year)throws DateException{
			Stringbuffer message = new Stringbuffer();
			if(day <= 0){
				message.append("no se permiten valores negativos, valor erroneo" + day + "\n");
			}
			if(day > 31){
				message.append("no se permiten valores mayores de 31 para dias, valor erroneo" + day + "\n");
			}
			if(month <= 0){
				message.append("no se permiten valores negativos, valor erroneo" + month + "\n");
			}
			if(month > 12){
				message.append("no se permiten valores mayores de 12 para meses, valor erroneo" + month + "\n");
			}
			if(year <= 0){
				message.append("no se permiten valores negativos, valor erroneo" + year + "\n");
			}
			if(correctDayOfMonth(day,month) == -1){
				message.append("la combinacion entre dia y mes no es correcta" + day "/" + month + "\n");
			}
			if(message.length() != 0){
				throw new DateException(message.toString());
			}else{
				this.day = day;
				this.month = month;
				this.year = year;
			}
		}

		int getDay(){
			return this.day;
			}

		void setDay(int day)throws DateException{
			if(day < 1 || day>31){
			myBuffer.append("Dia no valido, es un dia negativo, es o, o es mayor de 31"+ day+"\n");
		}
		if(myBuffer.length() != 0){
			throw new DateException(myBuffer);
		}else{
			this.day =day;
			}
		}

		int getMonth(){
			return this.Month;
			}

		void setMonth(int month)throws DateException{
			if(month < 1 || month >12){
			myBuffer.append("Mes no valido, los meses van de 1 a 12: " + month+"\n");
		}
		if(myBuffer.length() != 0){
			throw new DateException(myBuffer);
		}else{
			this.month = month;
			}
		}

		int getYear(){
			return this.year;
			}

		void setYear(int year)throws DateEXception{
			if(year < 1){
			myBuffer.append("Año no valido, es negativo o es 0: "+ year+"\n");
		}
		if(myBuffer.length() != 0){
			throw new MyException(myBuffer);
		}else{
			this.year = year;
			}
		}

		boolean isSameDay(Date date){
			return(this.Day == date.getDay());
		}

		boolean isSameMonth(Date date){
			return(this.Month == date.getMonth();
		}

		boolean isSameYear(Date date){
			return(this.year == date.getYear());
		}

		boolean isSame(Date day, Date month, Date year){
			return(this.year == date.getYear() && this.Month == date.getMonth() && this.Day == date.getDay());
		}

	public String monthName(Date date){
		String nameMonth = " ";
		switch(date.getMonth()){
		case 1: nameMonth = "Enero"; break;
		case 2: nameMonth = "Febrero"; break;
		case 3: nameMonth = "Marzo"; break;
		case 4: nameMonth = "Abril"; break;
		case 5: nameMonth = "Mayo"; break;
		case 6: nameMonth = "Junio"; break;
		case 7: nameMonth = "Julio"; break;
		case 8: nameMonth = "Agosto"; break;
		case 9: nameMonth = "Septiembre"; break;
		case 10: nameMonth = "Octubre"; break;
		case 11: nameMonth = "Noviembre"; break;
		case 12: nameMonth = "Diciembre"; break;
		default: nameMonth = "Mes no valido"; break;
		}
		return nameMonth;
	}
	
	public boolean correctDayOfMonth(Date date){
		boolean correctDay = false;
		switch(date.getMonth()){
		case 1: 
		case 3:
		case 5:
		case 7: 
		case 8:
		case 10:
		case 12:
			if(day.getDay()<=31){
				correctDay = true;
			}
			break;
		case 2: 
			if(date.getYear()%4 == 0 && date.getYear()%100 != 0 && date.getDay()<=29){
				correctDay = true;
			}else if(date.getDay()<=28){
				correctDay = true;
			}
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11: 
			if(date.getDay()<=30){
				correctDay = true;
			}
			break; 
		}
		return correctDay;
	}

	public String yearSeason(Date date){
		String season = " ";
		switch(date.getMonth()){
		case 1: 
		case 2: 
			season= "Invierno"; break;
		case 3: 
			if(date.getDay()>=21){
				season = "Primavera";
			}else{
				season = "Invierno";
			}
			break;
		case 4: 
		case 5:
			season = "Primavera"; break;
		case 6: 
			if(date.getDay()>=21){
				season = "Verano";
			}else{
				season = "Primavera";
			}
			break;
		case 7: 
		case 8: 
			season = "Verano"; break;
		case 9: 
			if(date.getDay()>=23){
				season = "Otoño";
			}else{
				season = "Verano";
			}
			break;
		case 10: 
		case 11: 
			season = "Otoño"; break;
		case 12: 
			if(date.getDay()>=21){
				season = "Invierno";
			}else{
				season = "Otoño";
			}
			break;
		}
		return season;
	}

	public String monthsToEndOfYear(Date date)throws DateException{
		Date aux = new Date(date.getDay(), date.getMonth(), date.getYear());
		StringBuffer months = new StringBuffer();
		for(int i=date.getMonth()+1; i<=12; i++){
			aux.setMonth(i);
			months.append(date.monthName(aux)+ " ");	
		}
		return months.toString();
		
	}
	public String toString() {
		StringBuffer salida = new StringBuffer();
		salida.append(_day + "/"+ _month +"/"+ _year);
		return salida.toString();	
	}

	public String daysEndofMonth(Date date) throws DateException{
		Date aux = new Date(this);
		StringBuffer days = new StringBuffer();
		switch(Date.getMonth()){
		case 1: 
		case 3:
		case 5:
		case 7: 
		case 8:
		case 10:
		case 12:
			for(int i=date.getDay(); i<=31; i++){
				aux.setDay(i);
				days.append(i+ " ");	
			}
			break;
		case 2: 
			if(date.getYear()%4 == 0 && date.getYear()%100 != 0){
				for(int i=date.getDay(); i<=29; i++){
					aux.setDay(i);
					days.append(i+ " ");	
				}
			}else{
				for(int i=date.getDay(); i<=28; i++){
					aux.setDay(i);
					days.append(i+ " ");	
				}
			}
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11: 
			for(int i=fecha.getDay(); i<=30; i++){
				aux.setDay(i);
				dias.append(i+ " ");	
			}
			break; 
		}
		
		return dias.toString();
		
	}

	public String sameDaysMonth(Date date) throws DateExceptionException{
		Date aux = new Date(this);
		StringBuffer months = new StringBuffer();
		StringBuffer months31 = new StringBuffer();
		StringBuffer months30 = new StringBuffer();
		String aux2;
		for(int i=date.getMonth()+1; i<=12; i++){
			aux.setMonth(i);
			aux2 = aux.daysEndofMonth(aux).trim();
			if(aux2.charAt(aux2.length()-1) == '1'){
				months31.append(date.monthName(aux)+ " ");
			}else if(aux2.charAt(aux2.length()-1) == '0'){
				months30.append(date.monthName(aux)+ " ");
			}	
		}
		if(date.getMonth()==4 || date.getMonth()==6 || date.getMonth()==9 || 
				fecha.getMonth()==11){
			months.append(mesesDe30);
		}else if(date.getMonth() == 2){
			months.append("Ningun mes tiene los mismos dias de febrero");
		}else{
			months.append(mesesDe31);
		}
		return months.toString();
	}

	public long daysPassed(Date date){
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(date.getYear(), 1, 1);
		cal2.set(date.getYear(), date.getMonth(), date.getDay());
		
		long milis1 = cal1.getTimeInMillis();
		long milis2 = cal2.getTimeInMillis();
		long diff = milis2 - milis1;
		
		long diffDays = diff / (24 * 60 * 60 * 1000);

		return diffDays;
		
	}

	public int WhileTriedGuessDate(Date date) throws MyException{
		Date date2 = new Date(1,1,date.getDay());
		int conteo = 0;
		Random aleatorio = new Random();
		while(date2.getDay() != date.getDay() || date2.getMonth() != date.getMonth()){
			date2.setDay((int)(aleatorio.nextDouble() * 31 + 1));
			date2.setMonth((int)(aleatorio.nextDouble() * 12 + 1));
			conteor++;
		}
		return conteo;
	}

	public int DoWhileTriedGuessDate(Date date) throws MyException{
		Date date2 = new Date(1,1,fecha.getDay());
		int conteo = 0;
		Random aleatorio = new Random();
		do{
			date2.setDay((int)(aleatorio.nextDouble() * 31 + 1));
			date2.setMonth((int)(aleatorio.nextDouble() * 12 + 1));
			conteo++;
		}while(date2.getDay() != date.getDay() || date2.getMonth() != date.getMonth());
		return conteo;
	}

	public String dayOfWeek(Date date){
		int firstYear;
		int week;
		int variable;
		int secondVariable;
		int thirdVariable;
		int total;
		int fourthVariable;
		int lastVariable;
		week=0;
		String day = " ";
	        if((date.getYear() / 100)%4 == 1){
			variable = week + 5;
	         }else if ((date.getYear()/100)%4==2){
			variable= week+3;
	         }else if ((date.getYear()/100)%4==3){
			variable = week+1;
	         }else if ((date.getYear()/100)%4==0){
			variable = week;                   
	         }else{
			variable=0;
	         	lastVariable=0;
	            	thirdVariable = 0;
	        	firstYear=(date.getYear()%100)+((date.getYear()%100)/4);
	        	secondVariable=0;
		{
	                if (date.getYear() % 400 == 0 && date.getYear() % 100 != 0 && date.getYear() % 4 == 0){
	            		if (date.getMonth()==1 || date.getMonth()==2){
					 lastVariable=thirdVariable-1;
	                	}else{
					 lastVariable=thirdVariable;
				}
			}
	             	if (date.getMonth() == 8){
				fourthVariable = secondVariable + 1;
	        	}else if(date.getMonth() == 2 || date.getMonth() == 3 || date.getMonth() == 11){
				fourthVariable = secondVariable + 2;
	        	}else if(date.getMonth() == 6){
				fourthVariable = secondVariable + 3;
	        	}else if(date.getMonth() == 9 || date.getMonth() == 12 ){
				fourthVariable = secondVariable + 4;
	        	}else if(date.getMonth() == 4 || date.getMonth() == 7 ){
				fourthVariable = secondVariable + 5;
	        	}else if(date.getMonth() == 1 || date.getMonth() == 10 ){
				fourthVariable = secondVariable + 6;
	        	}else{
				fourthVariable = secondVariable + 0;
	        		total=variable+secondVariable+thirdVariable+firstYear+fourthVariable+date.getMonth()+lastVariable;
			}
	        	if (total%7==1){
				day = "Lunes";
	            	}else if(total % 7 == 2){
				day= "Martes";
	            	}else if(total % 7 == 3){
				day = "Miercoles";
	            	}else if(total % 7 == 4){
			 	day = "Jueves";
	            	}else if(total % 7 == 5){
				day = "Viernes";
	            	}else if(total % 7 == 6){
				day = "Sabado";
	            	}else{
				day = "Domingo";
	    		}
		return day;
	}		
}
