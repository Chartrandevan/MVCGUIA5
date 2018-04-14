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
public class Goalie extends HockeyPlayer {
     private int nextId = 1000;
     private int id;
     private int savePercentage;
     private double gaa;
     private String firstName;
     private String lastName;
     
     
   public Goalie(){
      nextId++;  
 id = nextId ++ ;   
   }//end of default constructor 
    
   public  Goalie (String l, String f, String Gop, int h, int w, int s, double g){
       super(l, f, Gop, h, w);
       savePercentage = s;
       gaa = g;
               
   }

  //*****Getters*****
    public int getSavePercentage() {
        return savePercentage;
    }

    public double getGaa() {
        return (gaa);
    }
  //******Setters***** 

    public void setSavePercentage(int savePercentage) {
        this.savePercentage = savePercentage;
    }

    public void setGaa(String ngaa) {
        this.gaa = Double.parseDouble(ngaa);
    }
    
    
    
}
