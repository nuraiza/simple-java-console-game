package game;

import java.util.List;

public class Element {
    private int x;
    private int y;




    public Element(List<WhiteSpace> l){
        setCoordinates(l);
    }

    public void setCoordinates(List<WhiteSpace> l){
        List<WhiteSpace> list = l;
        int random = 0+ (int)(Math.random()* ((list.size()-1)-0+1));
        WhiteSpace w = list.get(random);
        this.x= w.getX();
        this.y = w.getY();
        list.remove(random);
        Map.list = list;
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
