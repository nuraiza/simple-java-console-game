import java.util.List;

public class NPC  {
    private int x;
    private int y;
    private String npc = "y";
    private int startingX = 0;
    private int startingY = 0;
    private int endingX = 0;
    private int endingY = 9;
    private String direction;

    public NPC() {


direction = "down";
       x = startingX;
        y = startingY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNpc() {
        return npc;
    }

    public void setNpc(String npc) {
        this.npc = npc;
    }

    public int getStartingX() {
        return startingX;
    }

    public void setStartingX(int startingX) {
        this.startingX = startingX;
    }

    public int getStartingY() {
        return startingY;
    }

    public void setStartingY(int startingY) {
        this.startingY = startingY;
    }

    public int getEndingX() {
        return endingX;
    }

    public void setEndingX(int endingX) {
        this.endingX = endingX;
    }

    public int getEndingY() {
        return endingY;
    }

    public void setEndingY(int endingY) {
        this.endingY = endingY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
