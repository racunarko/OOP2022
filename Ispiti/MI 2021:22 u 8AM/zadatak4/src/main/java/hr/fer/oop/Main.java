package hr.fer.oop;

import static hr.fer.oop.Parser.parseInputString;

public class Main {
    public static void main(String[] args) throws ParseReadingException {
        Reading novi = parseInputString("deviceId:123, timestamp:01-02-2000, attribute:20");
        System.out.println(novi.getDeviceId() + " " + novi.getTimestamp());
    }
}
