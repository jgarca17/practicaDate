package es.unileon.prg.date;


	public class Date{
		private int day;
		private int month;
		private int year;
		public Date(int day, int month, int year){
			this.day = day;
			this.month = month;
			this.year = year;
			}
		int getDay(){
			return this.day;
			}
		void setDay(int day){
			this.day =day;
			}
		int getMonth(){
			return this.Month;
			}
		void setMonth(int year){
			this.month = month;
			}
		int getYear(){
			return this.year;
			}
		void setYear(int year){
			this.year = year;
			}
		boolean isSameDay(Date date){
			return(this.Day == date.getDay()){
		}
		boolean isSameMonth(Date date){
			return(this.Month == date.getMonth()
		}
		boolean isSameYear(Date date){
			return(this.year == date.getYear()){
		}
		boolean isSame(Date day, Date month, Date year){
			return(this.year == date.getYear() && this.Month == date.getMonth() && this.Day == date.getDay()){
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
	public String monthsToEndOfYear(Date date){
		Date aux = new Date(date.getDay(), date.getMonth(), date.getYear());
		StringBuffer months = new StringBuffer();
		for(int i=date.getMonth()+1; i<=12; i++){
			aux.setMonth(i);
			months.append(date.monthName(aux)+ " ");	
		}
		return months.toString();
		
	}
