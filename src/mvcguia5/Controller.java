package mvcguia5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import mvcguia5.objects.Goalie;
import mvcguia5.objects.HockeyPlayer;
import mvcguia5.objects.Player;

/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	hospital mvc example project
 *
 * Description:	controller class to pass info between the model and the view 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Controller
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
	 
	 private MCVGui ui;
	 ArrayList<HockeyPlayer> HPList = new ArrayList();
	 
 	
 	// ********** constructors ***********
	 
    //*****************************************************
    // Purpose: create a new controller object
    // Interface: IN: none
    // Returns: none
    // ***************************************************** 
	 public Controller(){
		 System.out.println("Controller Created!");
	 } // end contructor

         protected void addUI(MCVGui g){
		System.out.println("ui added to controller.");
		this.ui = g;
	} // end addUI

         
          protected void writeHPList(){
		 try{
			 FileOutputStream fos = new FileOutputStream("HP.tmp");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 
			 oos.writeObject(HPList);
			 oos.close();
		 } // end try to open output object stream
		 catch(IOException e){
			 
		 } // end catch io exception
		 
	 } // end writePatientList
          
 
          
          protected void getHPList(){
		 try{
			 FileInputStream fis = new FileInputStream("HP.tmp");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 
			 try{
				 HPList = (ArrayList<HockeyPlayer>)ois.readObject();
			 } // end try to read patient list from disk
			 catch(ClassNotFoundException e){
				 
			 } // end catch class not found
		 } // end try to open streams
		 catch(IOException e){
			 
		 } // end catch IOException
		 
		 /**
		  * the array list has been retrieved from disk but
		  * the patient records are not yet in the list model
		  */
		 
		 ui.loadHPListModel(HPList);
		 
	 } // end getPatientList
          
        protected void DeleteObject(int i){
         //   System.out.print("size of array : " + HPList.size());
         this.HPList.remove(i-1);
        }  
          
        protected void EditProperty(int i, String p, int nv){//Weight, Goals, Assists, Save %
        i = i-1;
        if (p.equals("Weight")){
        this.HPList.get(i).setWeight(nv);
        } 
        else if (p.equals("Goals")){
          ((Player)this.HPList.get(i)).setGoals(nv);
        }
        else if (p.equals("Assists")){
         ((Player)this.HPList.get(i)).setAssists(nv);
        }
        else if (p.equals("Save %")){
        ((Goalie)this.HPList.get(i)).setSavePercentage(nv);
        }  
        System.out.println("property editted");
        ui.OuttoTexta(i);
        }
          
        protected void PlayerSubmitted(String fn, String ln, String Gop, String position, int h, int w, int goals, int a){
           System.out.print("Player Submitted");
          Player p = new Player(fn, ln, Gop, position, h, w, goals, a);
          HPList.add(p);
          ui.HPListModel.addElement(p);
         }
       
        protected void GoalieSubmitted(String fn, String ln, String Gop, int h, int w, int s, double gaa){
           System.out.print("Goalie Submitted");
          Goalie g = new Goalie(fn, ln, Gop, h, w, s, gaa);
          HPList.add(g);
          ui.HPListModel.addElement(g);
         }
  
 }  // end class
