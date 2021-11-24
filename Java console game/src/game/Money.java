package game;

import java.util.List;

public class Money extends Element{
    private int amount;
    private String money = "$";



    public Money( List<WhiteSpace> l, int a){
        super(l);
        amount= a;

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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }


}
