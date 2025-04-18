package objects;

public class Spike extends GameObject{
    public Spike(int x, int y, int objType) {
        super(x, y, objType);

        // TODO: call initHitbox passing in 32, and 16
        // TODO: set xDrawOffset to 0
        // TODO: set yDrawOffset to (int) (Game.SCALE * 16)
        // TODO: add yDrawOffset to hitbox.y
    }
}
