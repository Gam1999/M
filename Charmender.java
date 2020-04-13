import java.util.Scanner;
import java.util.InputMismatchException;

public class Charmender extends Pokemon{
   private String  name;
    private int level;
    private int hp;
    private int pp;
    private int exp;
    private int L;

    public Charmender(String name){
        this.name = name;
        
    }

  
    public int getEatBerry(){
        return hp;
    }

    public void setEatBerry(int hp){
        this.hp += hp;
    }

    public int getSleep(){
       return hp += 2;
    }

    public void setSleep(int hp){
        this.hp += hp;
    }

    public int getRunning(){
        return hp += 4;
    }

    public void setRunning(int hp){
        this.hp += hp;
    }

    public int getAttack(){
        return pp += 1;
        //hp -= 5;
       // pp -= 5;
    }

    public void setAttack(int hp){
        this.hp += hp;
    }

    public int getFaint(){
        return hp -= 0;
    }

    public void setFaint(int hp){
        this.hp += hp;
    }

    public String getName(){
        return this.name;
    }
    public String toString(){
        return name;
    }

    public void setExp(int exp) {
        this.exp += exp;
    }

    public int getExp() {
        return exp;
    }

    public void setL(int L) {
        this.L += L;
    }

    public int getL() {
        return L;
    }

}