package shubham;

import java.time.LocalDate;

public class DateTest {
	public static void main(String[]args) {
		LocalDate date=LocalDate.of(1948, 10, 12);
		date.minusYears(1);
		date.minusMonths(2);
		date.plusDays(3);
		System.out.println(date);
		
	}

}
