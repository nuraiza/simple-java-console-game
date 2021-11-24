import java.util.List;

public class Bomb extends Element{
    private String bomb = "*";

    public Bomb(List<WhiteSpace> l){
        super(l);
    }

    @Override
    public void setCoordinates(List<WhiteSpace> l) {
        super.setCoordinates(l);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    public String getBomb(){
        return bomb;

    }
    public void setBomb(String sign){
        bomb = sign;

    }

}

