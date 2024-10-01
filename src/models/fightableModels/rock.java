package models.fightableModels;

import models.fightableModels.pattern.RPS.RPS;
import models.userModel.User;

public class rock extends RPS{

    public rock(User user){
        super(user);
        setX_SCISSORS(true);
        setX_PAPER(false);
        setX_ROCK(false);
    }

}
