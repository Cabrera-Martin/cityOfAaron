/**
 * The GameControl class - part of the control layer
 * class contains all of the ++++++++++FILL THIS LATER++++++++++
 * Author: Jake and Martin
 * Date last modified: 02 Nov 2018
 */
package control;
import model.*;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;

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
        //Creates CropDataObject
        createCropDataObject();
        //Creates Map
        createMap();
        createToolsList();
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
            theMap.setLocation(1, 4, loc);
            }
            // define the string for a farm land location
            String farmland = "\nYou are on the fertile banks of the River." +
                              "\nIn the springthis low farmland floods and is covered with rich" +
                              "\nnew soil. Wheat is planted as far as you can see."; 

            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            theMap.setLocation(0, 1, loc);
            theMap.setLocation(0, 2, loc);
            theMap.setLocation(0, 3, loc);
            theMap.setLocation(1, 1, loc);
            theMap.setLocation(1, 2, loc);
            theMap.setLocation(1, 3, loc);
            // define the string for a farm land location
            
            String house =    "\nThis is your house, come on in!";
            // set a house location
            loc = new Location();
            loc.setDescription(house);
            loc.setSymbol("/H/");
            theMap.setLocation(0, 0, loc);
            
            // define the string for a crop barn location            
            String cropBarn =    "\nThis is the barn where you store your crops!";
            // set a barn location
            loc = new Location();
            loc.setDescription(cropBarn);
            loc.setSymbol("B");
            theMap.setLocation(2, 0, loc);
            
            // define the string for an animal barn location            
            String animalBarn =    "\nThis is the barn where you keep your animals!";
            // set a barn location
            loc = new Location();
            loc.setDescription(animalBarn);
            loc.setSymbol("AB");
            theMap.setLocation(4, 1, loc);
            // define the string for a forest location
            String forest = "\nYou are on the woody forest, where you can find material for building refugess"; 
            // set a forest location
            loc = new Location();
            loc.setDescription(forest);
            loc.setSymbol("^^^^^^^");
            theMap.setLocation(2, 3, loc);
            theMap.setLocation(2, 4, loc);
            theMap.setLocation(3, 3, loc);
            theMap.setLocation(3, 4, loc);
            theMap.setLocation(4, 3, loc);
            theMap.setLocation(4, 4, loc);
           
            // define the string for a pastures location
            String pastures = "\nYou are on the green pastures, your animals can roam here!"; 
            // set a pastures location
            loc = new Location();
            loc.setDescription(pastures);
            loc.setSymbol("#!!#");
            theMap.setLocation(2, 2, loc);
            theMap.setLocation(3, 2, loc);
            
            // define the string for a temple location
            String temple = "\nThis is a sacred place. Enjoy it!"; 
            // set a temple location
            loc = new Location();
            loc.setDescription(temple);
            loc.setSymbol("^!^");
            theMap.setLocation(4, 2, loc);
            
            // define the string for a lake location
            String lake = "\nThis is a great lake, we can fish, swim, and drink from it!"; 
            // set a lake location
            loc = new Location();
            loc.setDescription(lake);
            loc.setSymbol("L");
            theMap.setLocation(2, 1, loc);
            
            // define the string for a toolShed location
            String toolShed = "\nThis is where you keep all your tools!"; 
            // set a toolShed location
            loc = new Location();
            loc.setDescription(toolShed);
            loc.setSymbol("*-*");
            theMap.setLocation(3, 1, loc);
            
            // define the string for a garden location
            String garden = "\nThis garden is filled with fruits and vegetables that you can consume"+
                            "\n it is also great to spend some time with family"; 
            // set a garden location
            loc = new Location();
            loc.setDescription(garden);
            loc.setSymbol("**");
            theMap.setLocation(3, 0, loc);
            
            // define the string for a chicken pin location
            String chickenPin = "\nAll the chickens are kept here for safety"; 
            // set a chicken pin location
            loc = new Location();
            loc.setDescription(chickenPin);
            loc.setSymbol("/-/");
            theMap.setLocation(4, 0, loc);
            
            // define the string for a chapel location
            String chapel = "\nOnce a week we meet here to pray"; 
            // set a chapel location
            loc = new Location();
            loc.setDescription(chapel);
            loc.setSymbol("///");
            theMap.setLocation(1, 0, loc);
            
            game.setmap(theMap);            
        }
        //defines the tools needed for servival
        public static void createToolsList(){
            ArrayList<ListItem> tools = new ArrayList();
            tools.add(new ListItem("axe", 15));
            tools.add(new ListItem("pickaxe", 12));
            tools.add(new ListItem("shovel", 10));
            tools.add(new ListItem("hoe", 15));
            tools.add(new ListItem("knife", 20));
                    
            game.setTools(tools);
        }
}
