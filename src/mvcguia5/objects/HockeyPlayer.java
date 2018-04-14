/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcguia5.objects;
import java.io.Serializable;
/**
 *
 * @author evanr
 */
public class HockeyPlayer {
 private int height;
 private String lastName;
 private String firstName;
 private int weight;
 private int nextId = 1000;
 private int id;
 private boolean player;
 
 public HockeyPlayer(){
   nextId++;  
 id = nextId ++ ;   
 }// end default constructor
 
 public HockeyPlayer(String l, String f, String Gop, int h, int w){
      nextId++;  
 id = nextId ++ ;
  lastName = l;
  firstName = f;
  height = h;
  weight = w;
  if (Gop.equals("Player")){
  player = true;
 }
        else if(Gop.equals("Goalie")){
player = false;    
}
}
 //******Getters*****

    public boolean isPlayer() {
        return player;
    }
 
 
 
 public int getHeight() {
        return height;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getWeight() {
        return weight;
    }


    public int getId() {
        return id;
    }
    
    //*****Setters*****

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNextId(int i) {
      nextId = i;
    }



 public String toString(){
       String s;
       s = ("ID = " + this.getId() +" "+ this.getFirstName() + " " + this.getLastName());
          return s;
   } 
 
 public String GoalieOutput(Goalie g){
   String s;
    s = g.getFirstName() + " " + g.getLastName()+ "\n";
    s += "Height = " + g.getHeight() + "cm. Weight = " + g.getWeight() + "kg\n";
    s += "Goals against average = " + g.getGaa() + "\n";
    s += "Save Percentage = " + g.getSavePercentage() + "%\n";
     return s;
 }
            
    public String PlayerOutput(Player p){
    String s;
    s = p.getFirstName() + " " + p.getLastName()+ "\n";
    s += p.getPosition() + "\n";
    s += "Height = " + p.getHeight() + "cm. Weight = " + p.getWeight()+"kg\n";
    s += "Points = " + p.getPoints() + "\n"; 
   return s;  
   } 
}
