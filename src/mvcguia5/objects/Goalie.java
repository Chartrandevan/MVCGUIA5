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
     private String gaa;
     private String firstName;
     private String lastName;
     
     
   public Goalie(){
      nextId++;  
 id = nextId ++ ;   
   }//end of default constructor 
    
   public  Goalie (String l, String f, int h, int w, int s, String g){
       super(l, f, h, w);
       savePercentage = s;
       gaa = g;
               
   }

  //*****Getters*****
    public int getSavePercentage() {
        return savePercentage;
    }

    public double getGaa() {
        return Double.parseDouble(gaa);
    }
  //******Setters***** 

    public void setSavePercentage(int savePercentage) {
        this.savePercentage = savePercentage;
    }

    public void setGaa(String gaa) {
        this.gaa = gaa;
    }
}
