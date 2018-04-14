/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcguia5;

/**
 *
 * @author chartrand-e35
 */
public class MVCA5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 MCVGui UI = new MCVGui();
		UI.setVisible(true);
		
		Controller controller = new Controller();
		
		UI.addController(controller);  // register controller with view
		controller.addUI(UI);			// register view with controller
    }
    
}
