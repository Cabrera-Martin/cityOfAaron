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
    
    // Created by Martin      
    // the viewOrSave method
    // Purpose: Gives the user the option to View or Save the list choosed
    // Parameters: none
    // Returns: an int equal to 1 or 2
    public static int viewOrSave(){
        int returnValue = 0;
        try{ 
        int optionChoosen = 0;
        boolean repeat;
        
               
            do{          
                repeat = false;
                // Ask for option.
                System.out.print("Please pick one of the following\n"
                    + "1) View the list\n"
                    + "2) Print the list\n");
                optionChoosen = keyboard.nextInt();
                if(optionChoosen != 1 || optionChoosen != 2){
                    System.out.format("\nError: input value must be 1 or 2.\n");
                    repeat = true;
                }
            
            }     
            while(repeat);
            if(optionChoosen == 1 || optionChoosen == 2){
                returnValue = optionChoosen;
            }            
        }
        catch(Exception e){
            System.out.format("\nError: input value must be 1 or 2.\n");
        }
        return returnValue;
    }
    
    // Created by Jake      
    // the listTools method
    // Purpose: displays the tool list
    // Parameters: none
    // Returns: none
        
    public void listTools(){
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> tools = theGame.gettools();
        System.out.println("Tools in the City of Aaron:");
                 
        int optionChoosen = viewOrSave();
        String breadCrum = null;
        
        
        if(optionChoosen == 1){
            //View the list
            for(int i = 0; i < tools.size();i++){        
            //displays the name and number for the list
            System.out.println(tools.get(i).getName() + "\t" + tools.get(i).getNumber());
             }
        }
            if(optionChoosen == 2){
            System.out.print("What is the name of the report?\n");
            breadCrum = keyboard.next();
        //print the list and display it to the user
           try(PrintWriter out = new PrintWriter(breadCrum)){
               out.println("Tools in the City of Aaron");
                           
               for(int i = 0; i < tools.size();i++){        
                //displays the name and number for the list
                System.out.println(tools.get(i).getName() + "\t" + tools.get(i).getNumber());
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
    // the listProvisions method
    // Purpose: displays the list of Provisions
    // Parameters: none
    // Returns: none
    
    public void listProvisions() {
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> provisions = theGame.getprovisions();
        System.out.println("Provisions in the City of Aaron:");
     
        int optionChoosen = viewOrSave();
        String breadCrum = null;
        
        
        if(optionChoosen == 1){
            //View the list
            for(int i = 0; i < provisions.size();i++){        
            //displays the name and number for the list
            System.out.println(provisions.get(i).getName() + "\t" + provisions.get(i).getNumber());
             }
        }
        if(optionChoosen == 2){
            System.out.print("What is the name of the report?\n");
            breadCrum = keyboard.next();
        //print the list and display it to the user
           try(PrintWriter out = new PrintWriter(breadCrum)){
               out.println("Provisions in the City of Aaron");
                           
               for(int i = 0; i < provisions.size();i++){        
                //displays the name and number for the list
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
        int optionChoosen = viewOrSave();
        String breadCrum = null;
        
        if(optionChoosen == 1){
            //View the list
            for(int i = 0; i < animals.size();i++){        
            //displays the name and number for animals
            System.out.println(animals.get(i).getName() + "\t" + animals.get(i).getNumber());
             }
        }
        if(optionChoosen == 2){
            System.out.print("What is the name of the report?\n");
            breadCrum = keyboard.next();
        //print the list and display it to the user
           try(PrintWriter out = new PrintWriter(breadCrum)){
               out.println("Animals in the City of Aaron");
                           
               for(int i = 0; i < animals.size();i++){        
                //displays the name and number of the list
                System.out.println(animals.get(i).getName() + "\t" + animals.get(i).getNumber());
           }
           }
           catch (Exception e)
           {
                System.out.println("Saved unsuccessful\n");
            }
        System.out.println("Saved.\n");
        }
     }
    
    public void listTeam()
        {
        System.out.println("Game created by\n "
                + "Jake Davis\n"
                + "and\n"
                + "Martin Cabrera");
        }
}
