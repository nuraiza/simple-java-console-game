import java.util.List;

public class Weapon extends Element{
    private String weapon = "@";

    public Weapon(List<WhiteSpace> l){
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}

