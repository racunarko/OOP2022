package hr.fer.oop.samostalneVjezbe.vjezba03.zad02;

public class IPv6Utils{

    public static void checkIPv6AddressValidity(String input) throws InvalidIPv6AddressException{
        String[] tokens = input.split(":");

        if(tokens.length != 8) {
            throw new InvalidIPv6AddressException("IPv6 address does not contain 8 hexadecimal numbers!");
        }
        else {
            for(String t : tokens) {
                long x = 0;
                try {
                    x = Long.parseLong(t, 16);
                } catch (Exception e) {
                    throw new InvalidIPv6AddressException("One or more strings in the IPv6 address are not hexadecimal numbers!");
                }
                if (!(x >= 0 && x <= Long.parseLong("FFFF", 16))) {
                    throw new InvalidIPv6AddressException("One or more numbers in the IPv6 address are not in the correct range!");
                }
            }
        }

    }
}
