/*
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Martin, Jake
 * Date Last modified: November 01, 2018
 */
package viewLayer;

import java.util.Scanner;

public class MainMenuView {
    
   
    Scanner keyboard = new Scanner(System.in);
    
    // The displayMenuView method
    // Purpose: displays the menu, has user input, and does the 
    //          selected action
    // Parameters: none
    // Returns: none
    // ========================================================= 
    
    public void displayMenuView(){
        int menuOption;
        do
        {
    // Display the menu
    // Prompt the user and has the user input a number
    // Perform the desired action
    }while(menuOption!= max);
    }

    }
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public MainMenuView()
    {
        theMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n";
        
        max = 5;
  
    
    }
}