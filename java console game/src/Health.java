import java.util.List;

public class Health extends Element{
    private final int amount =1;
    private String health = "#";


    public Health(List<WhiteSpace> l){
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

    public int getAmount() {
        return amount;
    }



    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}
