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
}
