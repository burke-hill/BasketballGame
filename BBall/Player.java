import java.util.Random;

public class Player {
    
    private int shooting;
    private int handles;
    private int height;
    private int speed;

    Random random = new Random();

    // Player constructor
    public Player(int shoot, int handle, int ht, int sd) {
        this.shooting = shoot;
        this.handles = handle;
        this.height = ht;
        this.speed = sd;
    }

    public boolean pointGuard() {
       int chance = random.nextInt(8);
       if (chance == 7) {
           return false;
       }
       else {
           return true;
       }
    }
    public int getSpeed() {
        return this.speed;
    }
}
