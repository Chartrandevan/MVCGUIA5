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
 
 public HockeyPlayer(){
   nextId++;  
 id = nextId ++ ;   
 }// end default constructor
 
 public HockeyPlayer(String l, String f, int h, int w){
  nextId++;  
  id = nextId ++ ;
  lastName = l;
  firstName = f;
  height = h;
  weight = w;
 }

 //******Getters*****
 
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


            
    
}
