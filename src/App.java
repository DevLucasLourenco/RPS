import java.util.Scanner;
import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class App {
    
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String ans;

            User p1 = new User("Lucas", false);
            User p2 = new User("IA", true);
            
            do { 
                p1.chooseBetween();
                p2.chooseBetween();
   
                
                RPS choiceP1 = p1.getChoice();
                RPS choiceP2 = p2.getChoice();
                
                System.out.println(String.format("%s (%s) X %s (%s)", p1.getName(), choiceP1.getClass().getSimpleName(), p2.getName(), choiceP2.getClass().getSimpleName()) );
                choiceP1.againstTo(p2.getChoice());
                choiceP2.againstTo(p1.getChoice());

                p1.showData();
                p2.showData();
                
                System.out.println(String.format("\n%s and %s, do you want to play again? (Y/N)", p1.getName(), p2.getName()));
                ans = scanner.nextLine().toUpperCase();
            } while (!(ans.equals("N")));
        }
    }
}

