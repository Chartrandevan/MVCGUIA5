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
	 private ArrayList<HockeyPlayer> HPList = new ArrayList();
	 
 	
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

         
          protected void writePatientList(){
		 try{
			 FileOutputStream fos = new FileOutputStream("patients.tmp");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 
			 oos.writeObject(HPList);
			 oos.close();
		 } // end try to open output object stream
		 catch(IOException e){
			 
		 } // end catch io exception
		 
	 } // end writePatientList
        public void PlayerSubmitted(String fn, String ln, String position, int h, int w, int goals, int a){
           
          Player p = new Player(fn, ln, position, h, w, goals, a);
          HPList.add(p);
          ui.HPListModel.addElement(p);
         }
        
         protected void loadListButtonClicked(HockeyPlayer p){
		 int nid = p.getId();
		 p.setNextId(++nid);
	 } // end loadListButtonClicked
 }  // end class
