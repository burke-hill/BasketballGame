import java.util.Random;

public class BasketballGame {
    public static void main (String[] args) {
        startGame();
    }


    // Starts game. Creates 5 red players and 5 blue players
    public static void startGame() {

        // Set both scores to 0 initially
        int redscore = 0;
        int bluescore = 0;

        Random rand = new Random();
        Player[] redteam =  new Player[5];
        for (int i=0;i<5;i++) {
            int shooting = rand.nextInt(90-60) + 60;
            int handle = rand.nextInt(90-60) + 60;
            int height = rand.nextInt(90-60) + 60;
            int speed = rand.nextInt(90-60) + 60;
            Player temp = new Player(shooting,handle,height,speed);
            redteam[i] = temp;
        }
        Player[] blueteam =  new Player[5];
        for (int i=0;i<5;i++) {
            int shooting = rand.nextInt(90-60) + 60;
            int handle = rand.nextInt(90-60) + 60;
            int height = rand.nextInt(90-60) + 60;
            int speed = rand.nextInt(90-60) + 60;
            Player temp = new Player(shooting,handle,height,speed);
            redteam[i] = temp;
        
        }
    }
}