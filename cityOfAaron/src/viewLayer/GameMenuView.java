/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;
import model.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import static viewLayer.CropView.displayCropsReportView;

/**
 *
 * @author Jake and Martin
 */
public class GameMenuView extends MenuView {
    
   int userInput = 0;
   final int MAX = 5;
   private Game theGame;    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================    
        public GameMenuView()
    {
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View Map\n" +
                   " 2 - View List\n" +
                   " 3 - Move to new location\n" +
                   " 4 - Manage Crops\n" +
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
                viewMap();
                break;
            case 2: // view list
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
        // Display the ListMenuView
            System.out.println("Here is the List");
            ListMenuView lmv = new ListMenuView();
            lmv.displayMenu();
        }
 public void moveToNewLocation()
        {
        // Display the Map.
            System.out.println("Pick where to move!");
        }
 public void manageCrops()
        {
        // Display the Map.
            CropView dcrv = new CropView();
            dcrv.displayCropsReportView();
            System.out.println("ManageCrops");
        }
}