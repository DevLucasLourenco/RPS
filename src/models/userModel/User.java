package models.userModel;

import java.util.Random;
import java.util.Scanner;
import models.fightableModels.paper;
import models.fightableModels.pattern.RPS.RPS;
import models.fightableModels.rock;
import models.fightableModels.scissors;

public class User {
    private String name;
    private RPS choice;
    private final boolean fate;
    private int countVictory;

    protected Scanner scanner = new Scanner(System.in);


    public User(String name, boolean fate){
        this.name = name;
        this.fate = fate;
        
    }

    public void showData() {
        System.out.println("User: " + getName() + " | Victory: " + getCountVictory());
    }

    public RPS chooseBetween(){
        if (this.fate) {
            this.choice = switchCaseToSelect(new Random().nextInt(3)+1);
            return this.choice;
        }
        System.out.println(getName()+", choose between those values below");
        System.out.println("1) PAPER\n2) ROCK\n3) SCISSOR");
        int num = scanner.nextInt();
        
        this.choice = switchCaseToSelect(num);
        return this.choice;
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
