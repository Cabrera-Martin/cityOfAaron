/*
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Martin, Jake
 * Date Last modified: November 01, 2018
 */
package viewLayer;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.GameControl;


public class MainMenuView extends MenuView {
    
    
    int userInput = 0;
    final int MAX = 5;
        
    // The displayMenuView method
    // Purpose: displays the menu, has user input, and does the 
    // selected action
    // Parameters: none
    // Returns: none
    // ========================================================= 
    
    public MainMenuView()
    {
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n",
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
                startNewGame();
                break;
            case 2: // start a saved game
                startSavedGame();
                break;
            case 3: // show help menu
                displayHelpMenuView();
                break;
            case 4: // save the game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing!! Have a nice day");
        }       
    }
        // The startNewGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
        public void startNewGame()
        {
        // Display the Banner Page.
            System.out.println(
            "\n" +
                   "\nWelcome to the City of Aaron.\n"+
                   "A small city inside of the realm of Azeroth.\n" +
                   "You have been called to serve as a full time King of the Aaronites.\n" +
                   "You are responsible of feeding the people, deciding how much to plant, \n" +
                   "and how much to set apart.\n" +
                   "You will also be in charge of buying and selling land.\n" +
                   "You will be held responsible for anyones death and put into the stockades\n" +
                   "That will remove you from office.\n"
            );
            
        // Prompt for and get the user’s name.
        String name;
        System.out.println("Type your name here: ");
        name = keyboard.next();
        
        // Call the createNewGame() method in the GameControl class
        GameControl.createNewGame(name);
        // Display a welcome message
        System.out.println("Welcome " + name + ", don't kill anyone!!!");             
        // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
        }        
        
         
        // The startSavedGame method
        // Purpose: start a saved game
        // Parameters: none
        // Returns: none
        // ===================================     
        public void startSavedGame()
        {
            //get rid of nl character left in the stream
            
            //prompt user and get a file path
            System.out.println("Please enter the file path here: ");
            String filePath = keyboard.next();
            
            //call the getSavedGame() method in the GameControl class to load the game
            
            //display the game menu for the loaded game
         }
        // The displayHelpMenuView method
        // Purpose: show Help
        // Parameters: none
        // Returns: none
        // ===================================     
        public void displayHelpMenuView()
        {
            HelpMenuView hmv = new HelpMenuView();
            hmv.displayMenu();

        System.out.println("\nHere is what you need to know");        
        }
        // The displaySaveGameView() method
        // Purpose: show saved games
        // Parameters: none
        // Returns: none
        // ===================================     
        public void displaySaveGameView()
        {
        System.out.println("\nList of your saved games");
        }
        
}