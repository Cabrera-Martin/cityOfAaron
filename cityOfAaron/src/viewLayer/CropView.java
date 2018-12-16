/*
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Martin, Jake
 * Date Last modified: November 01, 2018
 */
package viewLayer;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import exceptions.*;

public class CropView {
     //Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
 
     // Get references to the Game object and the CropData object
    static private Game game = CityOfAaron.getGame();
    static private CropData cropData = game.getcropData();
    
    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none 
    public static void buyLandView(){
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
    
        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
    
    
        //Get the user's input and save it.
        int toBuy;
        boolean paramsNotOkay;
        do{
            paramsNotOkay = false;
            System.out.print("How much land do you wish to buy?: ");
            toBuy = keyboard.nextInt();
            try{
                CropControl.buyLand(price, toBuy, cropData);
                }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }   while(paramsNotOkay);    
        // output how much land we now own
        System.out.format("You own %d acres of land now.\n",cropData.getacresOwned());
        }
   
    // The sellLandView method
    // Purpose: interface with the user input for selling land
    // Parameters: none
    // Returns: none
    public static void sellLandView(){
        // Get the cost of land for this round.   
        int price = CropControl.calcLandCost();
        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is being bought for %d bushels per acre.%n",price);
        //Get the user's input and save it.
        int toSell;
        boolean paramsNotOkay;
        do{
           paramsNotOkay = false;
           System.out.print("How much land do you wish to sell?: ");
           toSell = keyboard.nextInt();
            try{
                //Call the sellLand() method in the control layr to sell the land
                CropControl.sellLand(price, toSell, cropData);
                }
            catch (CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.\n");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
            }   
        while(paramsNotOkay);                      
        // output how much land we now own
        System.out.format("You own %d acres of land now.\n",cropData.getacresOwned());
        }       
    
    // The feedPeopleView method
    // Purpose: interface with the user input for feeding the population
    // Parameters: none
    // Returns: none
    public static void feedPeopleView(){
    
        //Call the wheatInStore() method in the model layer to get how much wheat the user has in store
        int wheatInStore = cropData.getwheatInStore();
        //Get the user's input and save it.
        int toFeed;
        boolean paramsNotOkay;
        do{
            paramsNotOkay = false;
            System.out.print("How many bushels of wheat do you want to feed the people?\n");
            toFeed = keyboard.nextInt();
            try{
                //Call the wheatForFood() method in the control layer 
                CropControl.wheatForFood(wheatInStore, toFeed, cropData);
                }
            catch (CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
            }   
        while(paramsNotOkay);
        // output how much wheat is to feed the people
        System.out.format("You have %d of bushels of wheat to feed the people\n",cropData.getwheatForFood());
        // output how much wheat is left in Store
        System.out.format("You have %d of wheat left in Storage.\n",cropData.getwheatInStore());                      
        }
    
        // The displayCropsReportView method
        // Purpose: interface with the cropData method to display a Report of the well being of the City
        // Parameters: none
        // Returns: none
        public static void displayCropsReportView(){
        // a. The year number 
        System.out.format("You are in the year %d\n",cropData.getyear());
        // b. How many people starved 
        System.out.format("%d People died of starvation.\n",cropData.getnumberWhoDied());
        // c. How many people came to the city 
        System.out.format("%d People came the City\n",cropData.getnewPeople());
        // d. The current population 
        System.out.format("The total population is: %d\n",cropData.getpopulation());
        // e. The number of acres of crop land owned by the city 
        System.out.format("You own %d of acres.\n",cropData.getacresOwned());
        // f. The number of bushels per acre in this years harvest 
        System.out.format("You have harvested %d bushels of wheat per acre\n",cropData.getcropYield());
        // g. The total number of bushels of wheat harvested 
        System.out.format("You have harvested a total of %d bushels\n",cropData.getharvest());
        // h. The number of bushels of wheat in store 
        System.out.format("You have %d bushels of wheat left in Storage.\n",cropData.getwheatInStore());
  
    }
   // The plantCropsView method
    // Purpose: interface with the user input for planting crops
    // Parameters: none
    // Returns: none
    public static void plantCropsView(){
    //Get the user's input and save it.
    int toPlant;
    boolean paramsNotOkay;
    do{
        paramsNotOkay = false;
        // Prompt the user to enter how many acres they want to plant
        System.out.print("How many acres of land do you want to plant?: ");
        toPlant = keyboard.nextInt();
        try{
            //Call the plantCrops() method in the control layer
            CropControl.plantCrops(toPlant, cropData);
            }
        catch (CropException e)
        {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
        }    
        while(paramsNotOkay);        
            
        // output how many acres we have planted
        System.out.format("You have planted %d acres of land now.\n",cropData.getacresPlanted());
        // output how much wheat is left in Store
        System.out.format("You have %d of wheat left in Storage.\n",cropData.getwheatInStore());
    }
    // The harvestCropsView method
    // Purpose: 
    // Parameters: none
    // Returns: none
    public static void payOfferingView(){
        int yields = CropControl.calcCropYield();
        CropControl.cropYield(yields,cropData);
        }
    // The harvestCropsView method
    // Purpose: 
    // Parameters: none
    // Returns: none
    public static void harvestCropsView(){
        int yields = CropControl.calcCropYield();
        CropControl.cropYield(yields,cropData);
        }
    // The harvestCropsView method
    // Purpose: 
    // Parameters: none
    // Returns: none
        public static void growPopulationView(){
        int growth = CropControl.calcPopGrowth();
        CropControl.cropYield(growth,cropData);
        }
    // The harvestCropsView method
    // Purpose: 
    // Parameters: none
    // Returns: none
        public static void calcStarvedView(){
        CropControl.calcStarved(cropData);
        }    
    
    // The runCropView method()
    // Purpose: runs the methods to manage the crops game
    // Parameters: none
    // Returns: none
    public static void runCropView(){       
        // call the displayCropsReportView( ) method
        displayCropsReportView();            
        // call the buyLandView( ) method
        buyLandView();
        // call the sellLandView( ) method
        sellLandView();
        // call the feedPeopleView( ) method
        feedPeopleView();
        // call the plantCropsView( ) method
        plantCropsView();        
        // call the harvestCropsView( ) method
        payOfferingView();
        // call the harvestCropsView( ) method
        harvestCropsView();
        // call the growPopulationView( ) method
        growPopulationView();
        // call the calcStarvedView( ) method
        calcStarvedView();
        // call the displayCropsReportView( ) method
        displayCropsReportView();        
    }
}