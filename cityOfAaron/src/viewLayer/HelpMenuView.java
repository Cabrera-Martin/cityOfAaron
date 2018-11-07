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
public class HelpMenuView {
    
    private String helpMenu;
    private int max;
    int userInput = 0;
    final int MAX = 5;
    Scanner keyboard = new Scanner(System.in);
    
    public HelpMenuView()
    {
        helpMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View Goals\n" +
                   " 2 - View Map Help\n" +
                   " 3 - View Move Help\n" +
                   " 4 - View List Help\n" +
                   " 5 - Go back\n";
        
        max = 5;
    }
    public void displayHelpMenuView(){
        int menuOption;
        do
        {
    // Display the menu
            System.out.println(helpMenu);            
    // Prompt the user and has the user input a number
            menuOption = getMenuOption();
    // Perform the desired action
            doAction(menuOption);
    }while(menuOption!= max);
    }
    public int getMenuOption()
    {
        do
        {
         // get user input from the keyboard
         userInput = keyboard.nextInt();
         // if it is not a valid value, output an error message
         if(userInput < 1 || userInput > MAX)
           System.out.println("Error: you must select 1, 2, 3, 4 or 5");
        // loop back to the top of the loop if input was not valid
        // end loop
        } while (userInput < 1 || userInput > MAX);   

        return userInput;
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
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