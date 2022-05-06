package hr.fer.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Parser {

	public static Reading parseInputString(String input) throws ParseReadingException {

		String[] tokens = input.split(", ");
		boolean isA = true;

		if (tokens.length == 1) {
			tokens = input.split(";");
			isA = false;
		}

		if (tokens.length != 3) {
			throw new IncorrectArgumentNumberException();
		}

		if(isA) {
			for (int i = 0; i < tokens.length; i++) {
				tokens[i] = tokens[i].split(" : ")[1];

				if (i == tokens.length - 1) {
					tokens[i] = tokens[i].split("}")[0];
				}
			}
		}

		try {
			Integer serialNumber = Integer.parseInt(tokens[0]);
			LocalDate timestamp = isA ? parseDateForManufacturerA(tokens[1]) : parseDateForManufacturerB(tokens[1]);
			Double readingValue = Double.parseDouble(tokens[2]);

			return new Reading(serialNumber, readingValue, timestamp);
		} catch (Exception e) {
			throw new ReadingFormatException(e);
		}

	}
	
	private static LocalDate parseDateForManufacturerA (String dateA) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateA, dtf);
		
		return date;
	}
	
	private static LocalDate parseDateForManufacturerB (String dateB) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateB, dtf);
		
		return date;
	}

}
