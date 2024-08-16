package models.fightableModels.pattern.RPS;

import models.userModel.User;

public abstract class RPS {

    private User user;

    public RPS(User user) {
        this.user = user;
    }

    public void showData() {
        System.out.println("User:" + user.getName());

    }

    // Getters & Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
