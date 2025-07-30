public enum Month {

	JAN(30),
	FEB(30),
	MAR(30),
	APR(30),
	MAY(30),
	JUN(30),
	JUL(30),
	AUG(30),
	SEP(30),
	OCT(30),
	NOV(30),
	DEC(30);

	private int days;

	Month(int days) {
		this.days = days;
	}

	public int getOrdNum() {
		return ordinal();
	}

	public static int func(Month month, int day) {
		int count = day;
		for (int i = 0; i < month.getOrdNum(); i++) {
			count += Month.values()[i].days;
		}
		return count;
	}

}
