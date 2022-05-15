package hr.fer.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class Parser {
	
	public static Reading parseInputString(String inputReadingString) throws ParseReadingException {
		String[] tokens = inputReadingString.split(", ");
		Integer deviceId = null;
		SensorReadingValue[] sensorReading = null;
		LocalDate timestamp = null;

		if (tokens.length < 3) {
			throw new IncorrectReadingFormatException();
		} else {
			try {
				String[] device = tokens[0].split(":");
				String[] time = tokens[1].split(":");
				deviceId = Integer.parseInt(device[1]);
				timestamp = parseDate(time[1]);

			} catch (Exception e) {
				throw new FormatException(e);
			}

			sensorReading = new SensorReadingValue[tokens.length - 2];
			int n = 0;
			for (int i = 2; i < tokens.length; i++) {
				try {
					String[] sensor = tokens[i].split(":");
					sensorReading[n] = new SensorReadingValue(sensor[0], sensor[1]);
				} catch (Exception e) {
					sensorReading[n] = null;
				}
				n++;
			}
			boolean goodRead = false;
			for (int i = 0; i < sensorReading.length; i++) {
				if (sensorReading[i] != null) {
					goodRead = true;
					break;
				}
			}
			if (!goodRead) {
				throw new ReadingsFormatException();
			}
		}
		return new Reading(deviceId, sensorReading, timestamp);
	}
	
	private static LocalDate parseDate (String dateA) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		dtf = dtf.withLocale( Locale.GERMAN);
		return LocalDate.parse(dateA, dtf);
	}

}
