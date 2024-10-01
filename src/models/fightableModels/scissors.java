package models.fightableModels;

import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class scissors extends RPS{

    public scissors(User user){
        super(user);
        setX_PAPER(true);
        setX_ROCK(false);
        setX_SCISSORS(false);
    }

}
