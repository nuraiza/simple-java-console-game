package game;

public class Player {
private int health;
private int Money;
private Boolean weapon1;
private Boolean weapon2;
private int x;
private int y;
private Boolean win;
private Boolean lost;
private String player ="x";


public Player(){
    health = 2;
    Money=0;
    weapon1=false;
    weapon2= false;
    win= false;
    lost = false;
    x= 1 + (int) (Math.random() * (9-1+1));
    y= 0 + (int) (Math.random() * (9-0+1));
}

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
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

    public Boolean getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Boolean weapon1) {
        this.weapon1 = weapon1;
    }

    public Boolean getWeapon2() {
        return weapon2;
    }

    public void setWeapon2(Boolean weapon2) {
        this.weapon2 = weapon2;
    }

    public Boolean getWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    public Boolean getLost() {
        return lost;
    }

    public void setLost(Boolean lost) {
        this.lost = lost;
    }
}
