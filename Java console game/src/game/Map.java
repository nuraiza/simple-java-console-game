package game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
    private int rangeX = 10;
    private int rangeY = 10;
    private String[][] map;
    private Player player;
    private Money m1;
    private Money  m2;
    private Money m3;
    private Health h1;
    private Health h2;
    private Bomb  b1;
    private Bomb  b2;
    private Weapon  w1;
    private Weapon  w2;
    private NPC npc;
    private Boolean isLostorWon;

    private final String whiteSpace = "_";
    private final String playerSign = "x";
    public static List<WhiteSpace> list = new ArrayList<>();


    public Map(){
       map = new String[rangeX][rangeY];
       npc = new NPC();
        player= new Player();

        CreateMap();
        isLostorWon= false;

    }


    public void CreateMap(){
        int playerX = player.getX();
        int playerY = player.getY();

        for (int y=0; y<rangeY; y++){
            for (int x=0; x< rangeX; x++ ){
                if(x==npc.getX()&& y==npc.getY()){
                    map[y][x]= npc.getNpc();
                }
                else if(x==playerX&& y==playerY){
                    map[y][x]= playerSign;
                }
                else {
                    map[y][x] = whiteSpace;
                    if(x!=0){
                        WhiteSpace w = new WhiteSpace(x, y);
                        list.add(w);
                    }

                }
            }
        }


AddElements();

    }
    public void AddElements(){
        m1 = new Money( list, 20) ;
        m2 = new Money( list, 50);
        m3 = new Money (list, 30);
        h1 = new Health(list);
        h2= new Health(list);
        b1 = new Bomb(list);
        b2 = new Bomb(list);
        w1 = new Weapon(list);
        w2 = new Weapon(list);


        for (int y=0; y<rangeY; y++){
            for (int x=0; x< rangeX; x++ ){

                if(x==m1.getX()&& y==m1.getY()){
                    map[y][x]= m1.getMoney();
                }
                else if (x==m2.getX() && y==m2.getY()){
                    map[y][x]= m2.getMoney();
                } else if (x==m3.getX() && y==m3.getY()){
                    map[y][x]= m3.getMoney();
                }
                else if (x==h1.getX() && y==h1.getY()){
                    map[y][x] = h1.getHealth();
                } else if(x==h2.getX() && y==h2.getY()){
                    map[y][x] = h2.getHealth();
                }else if (x == b1.getX()&& y == b1.getY()){
                    map [y][x]= b1.getBomb();
                }else if (x == b2.getX()&& y == b2.getY()){
                    map [y][x]= b2.getBomb();
                }else if (x == w1.getX()&& y == w1.getY()){
                    map [y][x]= w1.getWeapon();
                }else if (x == w2.getX()&& y == w2.getY()){
                    map [y][x]= w2.getWeapon();
                }


            }
        }

    }

    public void UpdateNPC(){

         if(npc.getDirection().equalsIgnoreCase("down")){
             npc.setY(npc.getY()+1);
         } else if(npc.getDirection().equalsIgnoreCase("up")){
             npc.setY(npc.getY()-1);
         }

         if(npc.getY()== npc.getEndingY()){
             npc.setDirection("up");
         }else if(npc.getY()==npc.getStartingY()){
             npc.setDirection("down");
         }


    }


    public void UpdateMap(String direction){
        UpdateNPC();
        UpdatePlayerCoordinates(direction);
        AddActions();

        WinOrLose();

        if(player.getLost()==true){
            isLostorWon=true;
        } else if(player.getWin()==true){
            isLostorWon=true;
        }

        int playerX = player.getX();
        int playerY = player.getY();

        for (int y=0; y<rangeY; y++){
            for (int x=0; x< rangeX; x++ ){

                if(x==playerX&& y==playerY){
                    map[y][x]= playerSign;

                }
               else  if(x==npc.getX()&& y==npc.getY()){
                   if(CheckNpcPlayer(npc)==false && !npc.getNpc().equalsIgnoreCase("_")){
                       map[y][x]= npc.getNpc();
                   }


                } else if(x== m1.getX()&& y==m1.getY()){
                    if(CheckCoordinates(m1)==false){
                        map[y][x] = m1.getMoney();
                    }

                } else if (x==m2.getX()&&y== m2.getY()){
                    if(CheckCoordinates(m2)==false){
                        map[y][x] = m2.getMoney();
                    }


                }
                else if (x==m3.getX()&&y== m3.getY()){
                    if(CheckCoordinates(m3)==false){
                        map[y][x] = m3.getMoney();
                    }


                } else if (x==h1.getX() && y==h1.getY()){

                    if(CheckCoordinates(h1)==false){
                        map[y][x] = h1.getHealth();
                    }

            } else if(x==h2.getX() && y==h2.getY()){

                    if(CheckCoordinates(h2)==false){
                        map[y][x] = h2.getHealth();
                    }

            }else if (x == b1.getX()&& y == b1.getY()){

                    if(CheckCoordinates(b1)==false){
                        map[y][x] = b1.getBomb();
                    }

                }else if (x == b2.getX()&& y == b2.getY()){
                    if(CheckCoordinates(b2)==false){
                        map[y][x] = b2.getBomb();
                    }

                }else if (x == w1.getX()&& y == w1.getY()){
                    if(CheckCoordinates(w1)==false){
                        map [y][x]= w1.getWeapon();
                    }


                }else if (x == w2.getX()&& y == w2.getY()){
                    if(CheckCoordinates(w2)==false){
                        map [y][x]= w2.getWeapon();
                    }
                }
                else {
                    map[y][x] = whiteSpace;
                }
            }
        }


    }
public void WinOrLose(){
        if(player.getHealth()==0){
            player.setLost(true);
            System.out.println("You lost !");
        }
       else if(player.getMoney()==100){
            player.setWin(true);
            System.out.println("You won !");
        }
}

    public void AddActions(){

        if(CheckCoordinates(m1)){

            player.setMoney(player.getMoney()+m1.getAmount());
            System.out.println("Your budget has been increased: "+player.getMoney());
            m1.setMoney("_");

        } else if(CheckCoordinates(m2)){
            player.setMoney(player.getMoney()+m2.getAmount());
            System.out.println("Your budget has been increased: "+player.getMoney());
            m2.setMoney("_");
        }else if(CheckCoordinates(m3)){
            player.setMoney(player.getMoney()+m3.getAmount());
            System.out.println("Your budget has been increased: "+player.getMoney());
            m3.setMoney("_");
        }
        else if(CheckCoordinates(h1)){
            player.setHealth(player.getHealth()+h1.getAmount());
            System.out.println("You got extra health: "+player.getHealth());
            h1.setHealth("_");
        }
        else if(CheckCoordinates(h2)){
            player.setHealth(player.getHealth()+h2.getAmount());
            System.out.println("You got extra health: "+player.getHealth());
            h2.setHealth("_");
        }
        else if (CheckCoordinates(b1)){
            player.setHealth(player.getHealth()- h2.getAmount());
            System.out.println("You met bomb, your health has been decreased: "+player.getHealth());
       b1.setBomb("_");
        }
        else if (CheckCoordinates(b2)){
            player.setHealth(player.getHealth()- h2.getAmount());
            System.out.println("You met bomb, your health has been decreased: "+player.getHealth());
            b2.setBomb("_");
        }
        else if(CheckCoordinates(w1)){
            if(player.getWeapon1()==false){
                player.setWeapon1(true);
            } else {
                player.setWeapon2(true);
            }
            System.out.println("You got weapon !");
            w1.setWeapon("_");
        }
        else if(CheckCoordinates(w2)){
            if(player.getWeapon1()==false){
                player.setWeapon1(true);
            } else {
                player.setWeapon2(true);
            }
            System.out.println("You got weapon !");
            w2.setWeapon("_");
        } else if (CheckNpcPlayer(npc)){
            if(player.getWeapon1()==true && player.getWeapon2()==true){
                player.setPlayer("X");
                npc.setNpc("_");
                System.out.println("You met enemy and destroyed him via 2 weapons !");
            } else{
                player.setHealth(player.getHealth()-1);
                System.out.println("You met enemy but you were beaten, you need to get 2 weapons to win him !");
            }

        }






    }

    public Boolean CheckNpcPlayer(NPC n){
        if (player.getX()==n.getX() && player.getY()== n.getY()){
            return true;
        } else{
            return false;
        }
    }

    public Boolean CheckCoordinates(Element e){

        if (player.getX()==e.getX() && player.getY()== e.getY()){
            return true;
        } else{
            return false;
        }

    }

    public void UpdatePlayerCoordinates(String direction) {

        int playerX = player.getX();
        int playerY = player.getY();

        if(direction.equalsIgnoreCase("North")){
            if(playerY!=0){
                player.setY(playerY-1);
            }

        }
        else if(direction.equalsIgnoreCase("South")){
            if(playerY!=9){
                player.setY(playerY+1);

            }

        }
        else if (direction.equalsIgnoreCase("West")){
            if (playerX!=0){
                player.setX(playerX-1);

            }

        }
        else if (direction.equalsIgnoreCase("East")){
            if(playerX!=9){
                player.setX(playerX+1);

            }

        }


    }


    public void PrintMap(){
        for (int y=0; y<rangeY; y++){
            for (int x=0; x< rangeX; x++ ){
                System.out.print(map[y][x]);
            }
            System.out.println("");
        }


    }


    public Boolean getLostorWon() {
        return isLostorWon;
    }

    public void setLostorWon(Boolean lostorWon) {
        isLostorWon = lostorWon;
    }
}



