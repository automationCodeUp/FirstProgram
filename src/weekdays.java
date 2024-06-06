public enum weekdays{
	
Monday(1),Tuesday(2);	
	
	public int daysAmount;
	
	private weekdays(int daysAmount) {
		
		this.daysAmount = daysAmount;
	}
	
	public int getDaysAmount() {
		
		return daysAmount;
	}
	
	
}