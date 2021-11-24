package game;

public class WhiteSpace {
    private int x;
    private int y;

    public WhiteSpace(int coordX, int coordY){
        this.x= coordX;
        this.y= coordY;
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
}
