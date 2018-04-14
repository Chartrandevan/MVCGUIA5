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
public class Player extends HockeyPlayer {
    private int id;
    private int nextId = 1000;
    private int goals;
    private int assists;
    private String position;
   public Player(){
     nextId++;  
 id = nextId ++ ; 
   }//end of deafualt constructer
   
   public Player(String l, String f, String p, int h, int w, int g, int a){
    super(l, f, h, w);
    goals = g;
    assists = a;
    position = p;
   }//end inicialized constructers
//****Getters****
    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public String getPosition() {
        return position;
    }
    
   //*****Setters******

    public void setPosition(String position) {
        this.position = position;
    }

    
    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
   
   public String toString(){
       String s;
       s = ("ID = " + this.getId() + this.getFirstName() + " " + this.getLastName());
          return s;
   } 
    
}
