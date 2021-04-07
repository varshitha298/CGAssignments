package lab3;

import java.time.LocalDate;
import java.time.Period;

public class Lab3_7 {

	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(1998, 07, 02);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

			System.out.printf("Difference = %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}

}
