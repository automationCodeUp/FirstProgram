public enum Month{
	
	JANUARY(31),FEBRUARY(28),MARCH(31);
	
	
	public int daysAmount;
	
	private Month(int daysAmount) {
		
		this.daysAmount = daysAmount;
	}
	
	public int getDaysAmount() {
		
		return daysAmount;
	}
	
	
}