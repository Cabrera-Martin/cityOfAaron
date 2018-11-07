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
      
    System.out.print("/nHow many bushels of wheat do you want to feed the people?");
    
    int toFeed;
    toFeed = keyboard.nextInt();
    
    CropControl.wheatForFood(int wheatInStore, int toFeed, CropData cropData);
    
    System.out.format("You have planted %d acres of land now.",cropData.getacresPlanted());
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
