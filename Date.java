package es.unileon.prg.date;


	public class Date{
		int day;
		int month;
		int year;
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
	}
