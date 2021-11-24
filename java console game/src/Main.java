import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Map map = new Map();
	map.PrintMap();
        Scanner scanner = new Scanner(System.in);
        String input;

        do{
          System.out.println("Where do you want to go?");
           input = scanner.nextLine();
          map.UpdateMap(input);
          map.PrintMap();
      } while(!input.equalsIgnoreCase("exit") && map.getLostorWon()==false);

    }


    }

