package models.fightableModels;

import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class paper extends RPS{
        
    public paper(User user) {
        super(user);
        setX_ROCK(true);
        setX_SCISSORS(false);
        setX_PAPER(false);
    }

}
