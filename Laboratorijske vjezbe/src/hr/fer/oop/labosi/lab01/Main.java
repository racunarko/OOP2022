package hr.fer.oop.labosi.lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String line = sc.nextLine();
        if(line.equals("KRAJ") ) {
            System.out.println(sum);
            return;
        }
        int num = Integer.parseInt(line);
        sum += num;
        while(sc.hasNextLine()) {
            line = sc.nextLine();
            if(line.equals("KRAJ")) {
                System.out.println(sum);
                break;
            }
            num = Integer.parseInt(line);
            sum += num;
        }
    }
}
