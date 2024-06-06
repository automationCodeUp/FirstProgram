public enum Days{
	
SUNDAY("sun"),MONDAY("monday"),TUESDAY("tue"),WEDNESDAY("wed");

	public String day;
	
	private Days(String day) {
		
		this.day=day;
	}
	
	public String getDay() {
		return day;
	}
}