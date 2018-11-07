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

public class CropView {
 //Create a Scanner object
 private static Scanner keyboard = new Scanner(System.in);
 
 // Get references to the Game object and the CropData object
 static private Game game = CityOfAaron.getGame();
 static private CropData cropData = game.getCropData();
 
    public static void buyLandView(){
      
    int price = CropControl.calcLandCost();
    
    System.out.format("Land is selling for %d bushels per acre.%n",price);
    System.out.print("/nHow much land do you wish to buy?");
    
    int toBuy;
    toBuy = keyboard.nextInt();
    
    CropControl.buyLand(price, toBuy, cropData);
    
    System.out.format("You own %d acres of land now.",cropData.getacresOwned());
    }
    public static void sellLandView(){
      
    int price = CropControl.calcLandCost();
    
    System.out.format("Land is being bought for %d bushels per acre.%n",price);
    System.out.print("/nHow much land do you wish to sell?");
    
    int toSell;
    toSell = keyboard.nextInt();
    
    CropControl.sellLand(price, toSell, cropData);
    
    System.out.format("You own %d acres of land now.",cropData.getacresOwned());
    }
    
    public static void plantCropsView(){
      
    System.out.print("/nHow many acres of land do you want to plant??");
    
    int toPlant;
    toPlant = keyboard.nextInt();
    
    CropControl.plantCrops(toPlant, cropData);
    
    System.out.format("You have planted %d acres of land now.",cropData.getacresPlanted());
    System.out.format("You have %d of wheat left in Storage.",cropData.getwheatInStore());
    }
    public static void feedPeopleView(){
      
    int wheatInStore = cropData.getwheatInStore();
    System.out.print("/nHow many bushels of wheat do you want to feed the people?");
    
    int toFeed;
    toFeed = keyboard.nextInt();
    
    CropControl.wheatForFood(wheatInStore, toFeed, cropData);
    
    System.out.format("You have %d of bushels of wheat to feed the people",cropData.getwheatForFood());
    System.out.format("You have %d of wheat left in Storage.",cropData.getwheatInStore());
    }
    
    public static void displayCropsReportView(){
    // a. The year number 
    System.out.format("You are in the year %d",cropData.getyear());
    // b. How many people starved 
    System.out.format("%d People died of starvation.",cropData.getnumberWhoDied());
    // c. How many people came to the city 
    System.out.format("%d People came the City",cropData.getnewPeople());
    // d. The current population 
    System.out.format("The total population is: %d",cropData.getpopulation());
    // e. The number of acres of crop land owned by the city 
    System.out.format("You own %d of acres.",cropData.getacresOwned());
    // f. The number of bushels per acre in this years harvest 
    System.out.format("You have harvested %d of bushels per acre",cropData.getcropYield());
    // g. The total number of bushels of wheat harvested 
    System.out.format("You have harvested a total of %d bushels",cropData.getharvest());
    // h. The number of bushels of wheat in store 
    System.out.format("You have %d of wheat left in Storage.",cropData.getwheatInStore());
  
    }         
    public static void runCropView(){
        
    buyLandView();
    sellLandView();
    feedPeopleView();
    plantCropsView();
    displayCropsReportView();
    
    }
}
