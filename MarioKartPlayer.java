public class MarioKartPlayer {
  private String playerName;
  private String characterName;
  private int characterSpeed;

  public MarioKartPlayer(){
    playerName = "undefined";
    characterName = "undefined";
    characterSpeed = 0;
  }

  public MarioKartPlayer(String playerName, String characterName, int characterSpeed){
    this.playerName = playerName;
    this.characterName = characterName;
    this.characterSpeed = characterSpeed;
  }

  public void boostSpeed(int boostAmount){
    characterSpeed += (characterSpeed + boostAmount <= 100)? boostAmount : 0;
  }

  public void displayInfo(){
    System.out.println("Player: " + playerName +
                       "\nCharacter: " + characterName +
                       "\nSpeed: " + characterSpeed);
  }
}
