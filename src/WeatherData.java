
public class WeatherData {
	private String id;

	@Override
	public String toString() {
		return "WeatherData [id=" + id + ", year=" + year + ", month=" + month + ", day=" + day + ", element=" + element
				+ ", value=" + value + ", qflag=" + qflag + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getQflag() {
		return qflag;
	}

	public void setQflag(String qflag) {
		this.qflag = qflag;
	}

	private int year;
	private int month;
	private int day;
	private String element;
	private int value;
	private String qflag;

	public WeatherData() {

	}
}
