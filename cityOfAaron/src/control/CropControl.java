/**
 * The CropControl class - part of the control layer
 * class contains all of the calculation methods for managing the crops
 * Author: Jake and Martin
 * Date last modified: 27 Oct 2018
 */
package control;
import java.util.Random;
import model.CropData;

/**
* The buyLand method
* Purpose: To buy land
* @param the price of land
* @param the number of acres to buy
* @param a reference to a CropData object
* @ return the number of total acres after the purchase
* Pre-conditions: acres to buy must be positive
* and <= than the bushel of wheat owned * landPrice
*/


public class CropControl 
{
     // constants
     private static final int LAND_BASE = 17;
     private static final int LAND_RANGE = 10;

    // random number generator
    private static Random random = new Random();
    // calcLandCost() method
    // Purpose: Calculate a random land price between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost()
    {
        int landCost = random.nextInt(LAND_RANGE) + LAND_BASE;  
        return landCost;            
    }

    public static int buyLand(int landCost, int acresToBuy, CropData cropData)
    {
        //if acresToBuy < 0, return -1
        if(acresToBuy < 0)
            return -1;
        //if acresToBuy*landCost > wheatInStore, return -1
        int bushel = cropData.getwheatInStore();
        if(acresToBuy*landCost > bushel)
             return -1;
        //acresOwned = acresOwned + acresToBuy
        int owned = cropData.getacresOwned();
        owned += acresToBuy;
        cropData.setacresOwned(owned);
        //wheatInStore = wheatInStore -(acresToBuy x landCost)
        int wheat = cropData.getwheatInStore();
        wheat-= (acresToBuy * landCost);
        cropData.setwheatInStore(wheat);
        //return acresOwned
        return owned;
    }
 /**
* The feedThePeople method
* Purpose: To feed the people
* @param wheatInStore
* @param value
* @param cropData object
* @return the number of total wheatForFood after saving
* Pre-conditions: value given from player must be positive
* and wheatInStorage must be <= than the value given from the player
*/

   public static int wheatForFood(int wheatInStore, int value, CropData cropData)
{
    //if value < 0, return -1
    
    if(value < 0)
        return -1;{
}
    //if wheatInStorage  < value,  return -1
    if (wheatInStore < value){
        return -1;
    }
    
    //wheatForFood = value - wheatInStorage
    int wheatForFood;
    wheatForFood = wheatInStore - value;
    
    //return wheatForFood
    return wheatForFood;


}

   
}

