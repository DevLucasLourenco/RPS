package models.fightableModels;

import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class scissors extends RPS{
    boolean X_PAPER = true;
    boolean X_ROCK = false;
    boolean X_SCISSORS = false;
    boolean result;


    public scissors(User user){
        super(user);
    }

}
