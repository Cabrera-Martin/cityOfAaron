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
import java.util.ArrayList;
import model.*;

/**
 * 
 * @author Jake Davis
 */
public class ListMenuView extends MenuView {
       
    //The GameMenuView constructor
    //Purpose: activates the list menu
    //Parameters: none
    //returns: none
    // ================================
    
    int userInput = 0;
    final int MAX = 5;
    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public ListMenuView()
    {
        super("\n" +
                   "**********************************\n" +
                   "*  CITY OF AARON: LIST MENU       *\n" +
                   "**********************************\n" +
                   " 1 - List of Animals in storehouse\n" +
                   " 2 - List the tools in storehouse\n" +
                   " 3 - List Pervisions in storehouse\n" +
                   " 4 - List team \n" +
                   " 5 - Return to Game Menu\n",
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
           case 1: // List of Animals in storehouse
                listAnimals();
                break;
            case 2: // List the tools in storehouse
                listTools();
                break;
            case 3: // List Pervisions in storehouse
                listProvisions();
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
        
        public void listTools(){
            //System.out.println("listTools option selected");
            //get the ArrayList from Game
            Game theGame = CityOfAaron.getGame();
            ArrayList<ListItem>tools = theGame.getTools();
            
            for(ListItem tool : tools){
               System.out.println(tool.toString());
            }
               
                int i = 0;
                        
            //gets ListItem out of ArrayList
            ListItem tool = tools.get(i);
            
            System.out.println(tool.getName() + "\t" + tool.getNumber() );
            }
        
        
        public void listProvisions()
        {
        System.out.println("listProvisions option selected");
        }
             
        public void listTeam()
        {
        System.out.println("listTeam option selected");
        }       
        
        
}