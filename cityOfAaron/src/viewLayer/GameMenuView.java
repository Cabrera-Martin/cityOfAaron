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
public class GameMenuView {
    
    private String gameMenu;
    private int max;
    int userInput = 0;
    final int MAX = 5;
    Scanner keyboard = new Scanner(System.in);
    private Game theGame;
    
    public GameMenuView()
    {
        gameMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View Map\n" +
                   " 2 - View List\n" +
                   " 3 - Move to new location\n" +
                   " 4 - Manage Crops\n" +
                   " 5 - Go back\n";
        
        max = 5;
    }    
    // The displayHelpMenuView method
        // Purpose: show Help
        // Parameters: none
        // Returns: none
        // ===================================     
        public void displayGameMenuView()
        {
        System.out.println("\nHere is what you need to know");        
        }
        public int getMenuOption()
    {
        do
        {
         // get user input from the /keyboard
           userInput = keyboard.nextInt();
        // if it is not a valid value, output an error message
           if(userInput < 1 || userInput > MAX)
           System.out.println("Error: you must select 1, 2, 3, 4 or 5");
        // loop back to the top of the loop if input was not valid
        // end loop
        }   while (userInput < 1 || userInput > MAX);   

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
                viewMap();
                break;
            case 2: // start a saved game
                viewList();
                break;
            case 3: // show help menu
                moveToNewLocation();
                break;
            case 4: // save the game
                manageCrops();
                break;
            case 5:
                System.out.println("Back to the main menu!");
        }
           
}
 public void viewMap()
        {
        // Display the Map.
            System.out.println("Here is your MAP");
        }
 public void viewList()
        {
        // Display the Map.
            System.out.println("Here is the List");
        }
 public void moveToNewLocation()
        {
        // Display the Map.
            System.out.println("Pick where to move!");
        }
 public void manageCrops()
        {
        // Display the Map.
            System.out.println("ManageCrops");
        }
}