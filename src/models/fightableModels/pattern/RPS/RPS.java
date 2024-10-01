package models.fightableModels.pattern.RPS;

import models.userModel.User;

public abstract class RPS {
    private User user;
    private boolean X_PAPER;
    private boolean X_ROCK;
    private boolean X_SCISSORS;
    private boolean result;

    public RPS(User user) {
        this.user = user;
    }

    public boolean againstTo(RPS rps, RPS instance) {
        if (rps.getClass().getSimpleName().equals("rock")){
            this.result = instance.isX_ROCK();
        }
        
        if (rps.getClass().getSimpleName().equals("scissors")){
            this.result = instance.isX_SCISSORS();
        } 
        
        if (rps.getClass().getSimpleName().equals("paper")){
            this.result = instance.isX_PAPER();
        }

        addPointIfWon(this.result);
        return this.result;
    }

    private void addPointIfWon(boolean result){
        if (result){
            getUser().setCountVictory(getUser().getCountVictory()+1);
        }
    }
    

    // Getters & Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isX_PAPER() {
        return X_PAPER;
    }

    public void setX_PAPER(boolean x_PAPER) {
        X_PAPER = x_PAPER;
    }

    public boolean isX_ROCK() {
        return X_ROCK;
    }

    public void setX_ROCK(boolean x_ROCK) {
        X_ROCK = x_ROCK;
    }

    public boolean isX_SCISSORS() {
        return X_SCISSORS;
    }

    public void setX_SCISSORS(boolean x_SCISSORS) {
        X_SCISSORS = x_SCISSORS;
    }

}
