	public class Date{
		int day;
		int month;
		int year;
		public Date(int day, int month, int year){
			this.day = day;
			this.month = month;
			this.year = year;
			}
		void setDay(int day){
			this.day =day;
			}
		int getDay(){
			return this.day;
			}
		void setMonth(int year){
			this.month = month;
			}
		int getMonth(){
			return this.Month;
			}
		void setYear(int year){
			this.year = year;
			}
		int getYear(){
			return this.year;
			}
		boolean isSameYear(Date other){
			if(this.year == other.getYear()){
				return true;
			}else{
				return false;
		}
	}
