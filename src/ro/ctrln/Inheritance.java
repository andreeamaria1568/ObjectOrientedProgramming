package ro.ctrln;

public class Inheritance {
    public static void main(String[] args) {
    Battleship battleship = new Battleship();
    battleship.setBattleshipName("Terran Battleship");
    battleship.setBattleshipCapacity(20000);
        System.out.println(battleship);

    ImperialStarDestroyer imperialStarDestroyer =  new ImperialStarDestroyer();
    imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
    imperialStarDestroyer.setBattleshipCapacity(30000);
    imperialStarDestroyer.setNumberOfDecks(30);
        System.out.println(imperialStarDestroyer);

    }


}
