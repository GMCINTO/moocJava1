
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Score = Integer.valueOf(parts[2]);
                int team2Score = Integer.valueOf(parts[3]);
                //System.out.println(name + ", age: " + age + " years");

                games.add(new Game(team1, team2, team1Score, team2Score));
            }
        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            //System.out.println("Reading the file " + file + " failed.");
        }
        int count = 0;
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;
        System.out.println("Team: ");
        String input = scan.nextLine();
        while (count < games.size()) {
            if ((input.equals(games.get(count).getTeam2()))) {
                gameCount++;

            } else if ((input.equals(games.get(count).getTeam1()))) {
                gameCount++;
            }
            if(games.get(count).winner().equals(input)){
                winCount++;
            
//            }else if(!(games.get(count).winner().equals(input))){
//                lossCount++;
            }
                
            count++;
        }
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + (gameCount - winCount));
      
    }
}
