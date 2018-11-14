/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;
import model.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Jake and Martin
 */
public class HelpMenuView extends MenuView {
    
    int userInput = 0;
    final int MAX = 5;
        
    public HelpMenuView()
    {
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View Goals\n" +
                   " 2 - View Map Help\n" +
                   " 3 - View Move Help\n" +
                   " 4 - View List Help\n" +
                   " 5 - Go back\n",
                5);
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
  @Override public void doAction(int option)
    {
        switch(option)
        {
           case 1: // call new game
                viewGoals();
                break;
            case 2: // start a saved game
                viewMapHelp();
                break;
            case 3: // show help menu
                viewMoveHelp();
                break;
            case 4: // save the game
                viewListHelp();
                break;
            case 5:
                System.out.println("Back to main menu!");
        }
        // The startNewGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================            
}       
        public void viewGoals()
        {
        // Display the Banner Page.
            System.out.println("These are your goals");
        }
        public void viewMapHelp()
        {
        // Display the Banner Page.
            System.out.println("Here are some tips for the Map");
        }
        public void viewMoveHelp()
        {
        // Display the Banner Page.
            System.out.println("Here are some tips for Moving");
        }
        public void viewListHelp()
        {
        // Display the Banner Page.
            System.out.println("Here is the List Help");
        }
}