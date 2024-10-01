import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class App {
    public static void main(String[] args) throws Exception {
        User p1 = new User("Lucas");
        p1.chooseBetween();

        User p2 = new User("IA", true);

        
        RPS choiceP1 = p1.getChoice();
        RPS choiceP2 = p2.getChoice();
        
        choiceP1.againstTo(p2.getChoice());
        choiceP2.againstTo(p1.getChoice());

        p1.showData();
        p2.showData();

    }
}
