
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
//        home team, visiting team, home team points, and visiting team points
        ArrayList<String> res = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                res.add(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Team:");
        String team = scan.nextLine();
        int game = 0;
        int win = 0;
        int loss = 0;
        for (String line: res) {
            String[] ans = line.split(",");
            if (ans[0].equals(team)) {
                game++;
                if (Integer.valueOf(ans[2]) > Integer.valueOf(ans[3])) {
                    win++;
                } else {
                    loss++;
                }
            } else if (ans[1].equals(team)) {
                game++;
                if (Integer.valueOf(ans[2]) < Integer.valueOf(ans[3])) {
                    win++;
                } else {
                    loss++;
                }
            }
        }
        System.out.println("Games: " + game);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);

    }

}
