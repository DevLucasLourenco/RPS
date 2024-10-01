package models.fightableModels;

import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class rock extends RPS{
    boolean X_SCISSORS = true;
    boolean X_PAPER = false;
    boolean X_ROCK = false;
    boolean result;

    public rock(User user){
        super(user);
    }

}
