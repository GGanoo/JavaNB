package vo;

public class MyDate {
		// VO, DTO
		// VO : value, Object
		// DTO : Data Transfer Object
	
	
		// day month year
	private int day;

	private int month;

	private int year;

 

	private boolean isValid = true;

 

	public int getDay() {

		return day;

	}

	public void setDay(int day) {

		if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {

			if (day < 0 || day > 31) {

				this.isValid = false;

			} else {

				this.day = day;

			}

		} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {

			if (day < 0 || day > 30) {

				this.isValid = false;

			} else {

				this.day = day;

			}

		} else {

			this.isValid = false;

		}

 

	}

	public int getMonth() {

		return month;

	}

	public void setMonth(int month) {

		if (month < 1 || month > 12) {

			this.isValid = false;

		} else {

			this.month = month;

		}

	}

	public int getYear() {

		return year;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public MyDate(int day, int month, int year) {

		this.setYear(year);

		this.setMonth(month);

		this.setDay(day);

//		this.day = day;

//		this.month = month;

//		this.year = year;

	}

	public String isValid() {

		if (this.isValid) {

			return "유효한 날짜다.";

		} else {

			return "날짜가 틀렸다.";

		}

	}

 

 

}





















