package _05_Serialization;

/*
 * Complete this class so that it can be serialized.
 */
import java.io.Serializable;

public class MinecraftCreeper implements Serializable {
    public String name;
    public int xPosition;
    public int yPosition;
    public int zPosition;
    public double health;

    public MinecraftCreeper(String name, int x, int y, int z) {
        this.name = name;
        this.xPosition = x;
        this.yPosition = y;
        this.zPosition = z;
        this.health = 100.0;
    }
}
