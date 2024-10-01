package models.fightableModels;

import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class paper extends RPS{
    boolean X_ROCK = true;
    boolean X_SCISSORS = false;
    boolean X_PAPER = false;
    boolean result;

        
    public paper(User user) {
        super(user);
    }

}
