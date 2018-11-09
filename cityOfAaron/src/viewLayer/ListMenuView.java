/*
 * The ListMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Jake Davis, Martin Cabrera 
 * Date Last modified: November 06, 2018
 */
package viewLayer;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.GameControl;

/**
 * 
 * @author Jake Davis
 */
public class ListMenuView {
    
    
    
    //The GameMenuView constructor
    //Purpose: activates the list menu
    //Parameters: none
    //returns: none
    // ================================
    private String theMenu;
    private int max;
    int userInput = 0;
    final int MAX = 5;
    Scanner keyboard = new Scanner(System.in);
    
    public void displayMenuView(){
        int menuOption;
        do
        {
    // Display the menu
            System.out.println(theMenu);            
    // Prompt the user and has the user input a number
            menuOption = getMenuOption();
    // Perform the desired action
            doAction(menuOption);
    }while(menuOption!= max);
    }
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public ListMenuView()
    {
        theMenu = "\n" +
                   "**********************************\n" +
                   "*            List Menu            *\n" +
                   "**********************************\n" +
                   " 1 - List of Animals in storehouse\n" +
                   " 2 - List the tools in storehouse\n" +
                   " 3 - List Pervisions in storehouse\n" +
                   " 4 - List team \n" +
                   " 5 - Return to Game Menu\n";
        
        max = 5;
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
           case 1: // List of Animals in storehouse
                listAnimals();
                break;
            case 2: // List the tools in storehouse
                listTools();
                break;
            case 3: // List Pervisions in storehouse
                listPervisions();
                break;
            case 4: // List team
                listTeam();
                break;
            case 5: //Returns to main menu
                return;
        }
}
     
        public void listAnimals()
        {
        
            System.out.println("listAnimals option selected");
        }   
        
        public void listTools()
        {
        System.out.println("listTools option selected");
        }
        
        public void listPervisions()
        {
        System.out.println("listPervisions option selected");
        }
             
        public void listTeam()
        {
        System.out.println("listTeam option selected");
        }
            
        
        
}