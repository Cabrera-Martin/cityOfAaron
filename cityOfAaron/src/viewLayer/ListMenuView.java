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
    private Game game = CityOfAaron.getGame();
       
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
                   " 3 - List Provisions in storehouse\n" +
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
            case 3: // List Provisions in storehouse
                listProvisions();
                break;
            case 4: // List team
                listTeam();
                break;
            case 5: //Returns to main menu
                return;
        }
    }
          
        
    // Created by Jake      
    // the listTools method
    // Purpose: displays the tool list
    // Parameters: none
    // Returns: none
        
    public void listTools(){
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> tools = theGame.gettools();
           
        // System.out.println("listTools option selected");
        System.out.println("Tools in the City of Aaron:");      
        for(int i = 0; i < tools.size();i++){
            
            ListItem tool = tools.get(i);
            System.out.println(tool.getName() + "\t" + tool.getNumber());
            }
        }
        
    // Created by Martin      
    // the listProvisions method
    // Purpose: displays the list of Provisions
    // Parameters: none
    // Returns: none
    public void listProvisions()
        {
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> provisions = theGame.getprovisions();
           
        System.out.println("Provisions in the City of Aaron:");      
        for(int i = 0; i < provisions.size();i++){
            
            ListItem provision = provisions.get(i);
            System.out.println(provision.getName() + "\t" + provision.getNumber());
        }
        }
    // Created by Martin      
    // the listAnimals method
    // Purpose: displays the list of Animals
    // Parameters: none
    // Returns: none
    public void listAnimals()
       {
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> animals = theGame.getanimals();
           
        System.out.println("Animals in the City of Aaron:");      
        for(int i = 0; i < animals.size();i++){
            
            ListItem animal = animals.get(i);
            System.out.println(animal.getName() + "\t" + animal.getNumber());
            }
        }
    public void listTeam()
        {
        System.out.println("listTeam option selected");
        }
}