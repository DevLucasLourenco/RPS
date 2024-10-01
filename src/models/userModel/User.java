package models.userModel;

import java.util.Scanner;
import java.util.Random;

import models.fightableModels.paper;
import models.fightableModels.rock;
import models.fightableModels.scissors;
import models.fightableModels.pattern.RPS.RPS;

public class User {
    private String name;
    private RPS choice;
    private int countVictory;

    private Scanner scanner = new Scanner(System.in);


    public User(String name){
        setName(name);
    }

    public User(String name, boolean fate){
        setName(name);
        if (fate) {
            choice = switchCaseToSelect(new Random().nextInt(3)+1) ;
        }
    }

    public void showData() {
        System.out.println("User: " + getName() + " | Victory: " + getCountVictory());
    }

    public void chooseBetween(){
        System.out.println(getName()+", choose between those values below");
        System.out.println("1) PAPER\n2) ROCK\n3) SCISSOR");
        int num = scanner.nextInt();
        
        choice = switchCaseToSelect(num);
    }

    private RPS switchCaseToSelect(Integer num){
        switch (num) {
            case 1:
                return new paper(this);
        
            case 2:
                return new rock(this);
                
            case 3:
                return new scissors(this);
        
            default:
                int i = new Random().nextInt(3)+1;
                return switchCaseToSelect(i);
        }
    }


    // Gettens & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RPS getChoice() {
        return choice;
    }

    public int getCountVictory() {
        return countVictory;
    }

    public void setCountVictory(int countVictory) {
        this.countVictory = countVictory;
    }
}
