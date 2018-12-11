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
import java.io.PrintWriter;
import java.io.IOException;
import exceptions.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                   " 1 - Animals in storehouse\n" +
                   " 2 - Tools in storehouse\n" +
                   " 3 - Provisions in storehouse\n" +
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
    
    public void viewOrSave(){
        boolean repeat;
        int menuOption;
        do {
            repeat = false;
            // Prompt for option.
            System.out.print("Please enter an option:\n1) See the list of Provisions \n2) Save the List of Provisions to a file");
            menuOption = keyboard.nextInt();
            if(menuOption < 1 || menuOption > 2){
                System.out.format("\\nPlease input 1 or 2.");
                repeat = true;
            }
        } while(repeat);
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
         
         //algorithim to display the tools
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
    public void listProvisions() {
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> provisions = theGame.getprovisions();
        System.out.println("Provisions in the City of Aaron:");
     
        int optionChoosen;
        boolean repeat;
        
        do{
            repeat = false;
            // Prompt for option.
            System.out.print("\n1) View\n2) Save Report");
            optionChoosen = keyboard.nextInt();
            if(optionChoosen < 1 || optionChoosen > 2){
                System.out.format("\nError: input value must be 1 or 2.");
                repeat = true;
            }
        } while(repeat);
        String filepath = null;
        if(optionChoosen == 2){
            System.out.print("What is the report file path and name?");
            filepath = keyboard.next();
        }
        if(optionChoosen == 1){
            //View the a Formated List;
            for(int i = 0; i < provisions.size();i++){        
            //displays the name and number for provision
            System.out.println(provisions.get(i).getName() + "\t" + provisions.get(i).getNumber());
             }

        } else{
           //print the a Formated List
           try(PrintWriter out = new PrintWriter(filepath)){
               out.println("Provisions in the City of Aaron");
                           
               for(int i = 0; i < provisions.size();i++){        
                //displays the name and number for provision
                System.out.println(provisions.get(i).getName() + "\t" + provisions.get(i).getNumber());
           }
           }
           catch (Exception e)
           {
                System.out.println("Saved unsuccessful");
            }
        System.out.println("Saved.");
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
        //displays the "Animals in the City of Aaron:" string to the player
        System.out.println("Animals in the City of Aaron:"); 
        //iterates through the array to get the items
        for(int i = 0; i < animals.size();i++){
            
            //gets the animal in the list with the index = i, stores it in the variable animal
            ListItem animal = animals.get(i);
            //displays the name and number for animal
            System.out.println(animal.getName() + "\t" + animal.getNumber());
            }
        }
     

    public void listTeam()
        {
        System.out.println("listTeam option selected");
        }
}
