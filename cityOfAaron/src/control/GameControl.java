/**
 * The GameControl class - part of the control layer
 * class contains all of the ++++++++++FILL THIS LATER++++++++++
 * Author: Jake and Martin
 * Date last modified: 02 Nov 2018
 */
package control;
import model.*;
import cityofaaron.CityOfAaron;

public class GameControl {
    
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    private static final Game game = new Game();
    
    public static void createNewGame(String _name)
    {              
        // create the player object and set the name
        Player player = new Player();
        player.setName(_name);
        
        // save reference to the player object in the game
        game.setPlayer(player);
      
        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(game);  
    }
    public static void createCropDataObject()
       {        
        // create and initialize a CropData object
        // save a reference to it in the Game object
        CropData cropData = new CropData();
        
        cropData.setyear(0);
        cropData.setpopulation(100);
        cropData.setnewPeople(5);
        cropData.setcropYield(3);
        cropData.setnumberWhoDied(0);
        cropData.setwheatInStore(2700);
        cropData.setacresOwned(1000);
        cropData.setacresPlanted(1000);
        cropData.setharvest(3000);
        cropData.setacresPlanted(1000); 
        game.setcropData(cropData);       
       }      
        // The createMap method
        // Purpose: creates the location objects and the map
        // Parameters: none
        // Returns: none
    public static void createMap()   
        {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        // create a string that will go in the Location objects
        // that contain the river
        String river = "\nYou are on the River. The river is the source" +
                       "\nof life for our city. The river marks the eastern " +
                       "\nboundary of the city - it is wilderness to the East.";
        // create a new Location object
        Location loc = new Location();
        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");  
        // set this location object in each cell of the array in column 4      
        for(int i = 0; i < MAX_ROW; i++)
            {
            theMap.setLocation(i, 4, loc);
            }
            // define the string for a farm land location
            String farmland = "\nYou are on the fertile banks of the River." +
                              "\nIn the springthis low farmland floods and is covered with rich" +
                              "\nnew soil. Wheat is planted as far as you can see."; 

            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            theMap.setLocation(0, 2, loc);

        }
}
