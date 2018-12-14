/**
 * The CropControl class - part of the control layer
 * class contains all of the calculation methods for managing the crops
 * Author: Jake and Martin
 * Date last modified: 27 Oct 2018
 */
package control;
import java.util.Random;
import model.CropData;
import exceptions.*;

public class CropControl 
{
     // constants for landcost
     private static final int LAND_BASE = 17;
     private static final int LAND_RANGE = 10;
     //constant for cropYield
     private static final int CROP_BASE = 2;
     private static final int CROP_RANGE = 3;
    // random number generator
    private static Random randomLand = new Random();
    private static Random randomCrop = new Random();
    // calcLandCost() method
    // Purpose: Calculate a random land price between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost()
    {
        int landCost = randomLand.nextInt(LAND_RANGE) + LAND_BASE;  
        return landCost;            
    }
    
    public static int calcCropYield()
    {
        int cropYields = randomCrop.nextInt(CROP_RANGE) + CROP_BASE;  
        return cropYields;            
    }

//The buyLand method
//Purpose: To buy land
//@param the price of land
//@param the number of acres to buy
//@param a reference to a CropData object
//@ return the number of total acres after the purchase
//Pre-conditions: acres to buy must be positive
//and <= than the bushel of wheat owned * landPrice
    public static void buyLand(int landCost, int acresToBuy, CropData cropData) throws CropException
    {
        //if acresToBuy < 0, return -1
        if(acresToBuy < 0)
            throw new CropException("A negative value was input");
        //if acresToBuy*landCost > wheatInStore, return -1
        int bushel = cropData.getwheatInStore();
        if(acresToBuy*landCost > bushel)
            throw new CropException("There is insufficient wheat to buy this much land");
        //acresOwned = acresOwned + acresToBuy
        int owned = cropData.getacresOwned();
        owned += acresToBuy;
        cropData.setacresOwned(owned);
        //wheatInStore = wheatInStore -(acresToBuy x landCost)
        int wheat = cropData.getwheatInStore();
        wheat-= (acresToBuy * landCost);
        cropData.setwheatInStore(wheat);
    }
    //The sellLand method
    //Purpose: To sell land
    //@param the price of land
    //@param the number of acres to sell   
    //@param a reference to a CropData object
    //@ return the number of total acres after the sale
    //Pre-conditions: acres to sell must be positive
    //and <= than acres owned
    public static void sellLand(int landCost, int acresToSell, CropData cropData) throws CropException
    {
        //if acresToBuy < 0, return -1
        if(acresToSell < 0)
            throw new CropException("A negative value was input");
        //if acresToSell > acresOwned, return -1
        int owned = cropData.getacresOwned();
        if(acresToSell > owned)
             throw new CropException("You own less land than what you are intending to sell");
        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setacresOwned(owned);
        //wheatInStore = wheatInStore + acresToSell * landCost
        int wheat = cropData.getwheatInStore();
        wheat+= (acresToSell * landCost);
        cropData.setwheatInStore(wheat);        
    }
//The feedThePeople method
// Purpose: To feed the people
// @param wheatInStore
//@param value
//@param cropData object
//@return the number of total wheatForFood after saving
//Pre-conditions: value given from player must be positive
//and wheatInStorage must be <= than the value given from the player
   public static void wheatForFood(int wheatInStore, int wheatForFood, CropData cropData)throws CropException
{
    //if wheatForFood < 0, return -1
    if(wheatForFood < 0){
        throw new CropException("A negative value was input");
    }
    //if wheatInStorage  < wheatForFood,  return -1
    if (wheatInStore < wheatForFood){
        throw new CropException("You don't have that much weath");
    }
    //wheatInStore = wheatInStore - wheatForFood
        int wheat = cropData.getwheatInStore();
        wheat -= wheatForFood;
        cropData.setwheatInStore(wheatInStore);
        cropData.setwheatForFood(wheatForFood);
    }
// The plantCrop method
//Purpose: To plant crops land
//@param the amount of people in the city
//@param the number of acres to plant
//@param the number of acres owned
//@param the number of bushels of wheat stored
//@param a reference to a CropData object
//@ return the number of total acres planted
//@ return the number of total bushels of wheat left in store
//Pre-conditions: acres to plant must be positive, acres to plant is <= acres owned, acres to be //planted / 10 <= amount of people in the city abd the acres to plant / 2 <= than bushel of
//wheat in storage
  
    public static void plantCrops(int acresToPlant, CropData cropData)throws CropException
    {
    //if acresToPlant < 0, return -1
        if(acresToPlant < 0)
            throw new CropException("There was a problem, please enter another value.");
        //if acresToPlant > acresOwned, return -1        
        int owned = cropData.getacresOwned();
        if(acresToPlant > owned)
             throw new CropException("There was a problem, please enter another value.");
        //if acresToPlant/2 > bushelInStorage, return -1
        int bushel = cropData.getwheatInStore();
        if(acresToPlant/2 > bushel)
             throw new CropException("There are not enough bushels of wheat in storage.");
        
        //if acresToPlant/10 > population, return -1
        int pop = cropData.getpopulation();
        if(acresToPlant/10 > pop)
             throw new CropException("There are not enough people to plant wheat.");
        //acresPlanted = acresPlanted + acresToPlant
        int planted = cropData.getacresPlanted();
        planted+= (acresToPlant);
        cropData.setacresPlanted(planted);
        
        //wheatInStore = wheatInStore - (acresToPlant/2)
        int wheat = cropData.getwheatInStore();
        wheat-= (acresToPlant/2);
        cropData.setwheatInStore(wheat);
         //return acresPlanted and wheatInStore
      System.out.println("Acres Planted = " + planted);
      System.out.println("What in Store = " + wheat);
    }
    //The seOffering method
    // Purpose: To set the percentage of offering the player wants to allocate
    // @param percentage to pay
    //@ return the percentage to pay or an error
    public static int setOffering(int percentageToPay)
    {
//if percentageToPay < 0 and > 1, return -1
        if(percentageToPay < 0 || percentageToPay > 100)
            return -1;
        else return percentageToPay;
    }
    
    /**
     *The cropYield method
     * Purpose: To calculate the Crop Yield per acre planted and add those crops to the total bushels owned.
     * @param cropYields
     * @param cropData
     */
    public static void cropYield(int cropYields, CropData cropData)
    {
    System.out.println("This year Crop Yield per acre was: " + cropYields + " bushels of wheat");
        //wheatInStore = wheatInStore + crop yield * acresPlanted
        int wheat = cropData.getwheatInStore();
        int acres = cropData.getacresPlanted();
        wheat += (cropYields*acres);
        cropData.setwheatInStore(wheat);
    }
}
