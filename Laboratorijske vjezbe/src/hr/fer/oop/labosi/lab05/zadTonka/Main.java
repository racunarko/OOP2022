package hr.fer.oop.labosi.lab05.zadTonka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList();

        players.add(new Player("Caruana", 2820, 0.5));
        players.add(new Player("Carlsen", 2847, 1.5));
        players.add(new Player("Radjabov", 2765, 1.0));

//        players.forEach(player ->
//                  player.setStanding((int) (players.stream().filter(player2 -> player2.getPoints() > player.getPoints()).count() + 1)));

        players.forEach(player -> {
            int countOfPlayers = 0;
            for (Player player2 : players) {
                if (player2.getPoints() > player.getPoints()) {
                    countOfPlayers++;
                }
            }
            player.setStanding(countOfPlayers + 1);
        });
        System.out.println(players);
    }

}
