public class MarioKartGame {
    public static void main(String[] args) {
        MarioKartPlayer player1 = new MarioKartPlayer("Player 1", "Mario", 60);
        MarioKartPlayer player2 = new MarioKartPlayer("Player 2", "Luigi", 45);
        player1.displayInfo();
        player2.displayInfo();
        player1.boostSpeed(5);
        player2.boostSpeed(10);
        player1.displayInfo();
        player2.displayInfo();
        
    }
}
