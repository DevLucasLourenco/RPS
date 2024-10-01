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

    public boolean againstTo(RPS rps) {
        System.out.println(user.getName()+" | "+user.getChoice().getClass().getSimpleName()+" X "+rps.getUser().getName()+" | "+rps.getUser().getChoice().getClass().getSimpleName());

        if (rps.getClass().getSimpleName().equals("rock")){
            System.out.println(" - passou por aqui - pedra");
            this.result = rps.isX_SCISSORS();
        }
        
        if (rps.getClass().getSimpleName().equals("scissors")){
            System.out.println(" - passou por aqui - tesoura");
            this.result = rps.X_PAPER;
        } 
        
        if (rps.getClass().getSimpleName().equals("paper")){
            System.out.println(" - passou por aqui - papel");
            this.result = rps.X_ROCK;
        }

        System.out.println(result+"\n");
        addPointIfPossible(result);
        return result;
    }

    private void addPointIfPossible(boolean result){
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
