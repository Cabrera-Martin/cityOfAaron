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
     //constant for cropYield
     private static final int POP_BASE = 1;
     private static final int POP_RANGE = 4;
    // random number generator
    private static Random randomLand = new Random();
    private static Random randomCrop = new Random();
    private static Random randomPop = new Random();
    // calcLandCost() method
    // Purpose: Calculate a random land price between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost()
    {
        int landCost = randomLand.nextInt(LAND_RANGE) + LAND_BASE;  
        return landCost;            
    }
    // calcCropYield() method
    // Purpose: Calculate a random crop yield between 2 and 5 bushels/acre
    // Parameters: none
    // Returns: the crop yield per acre
    public static int calcCropYield()
    {
        int cropYields = randomCrop.nextInt(CROP_RANGE) + CROP_BASE;  
        return cropYields;            
    }
    // calcPopGrowth() method
    // Purpose: Generate a random number between 1 and 5 to use to calculate the population growth
    // Parameters: none
    // Returns: the pop growth number
    public static float calcPopGrowth()
    {
        float popGrowth = (randomPop.nextInt(CROP_RANGE) + CROP_BASE); 
        
        return popGrowth;            
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
        cropData.setwheatInStore(wheat);
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
        if(acresToPlant < 0){
            throw new CropException("There was a problem, please enter another value.");
        //if acresToPlant > acresOwned, return -1        
        }
        int owned = cropData.getacresOwned();
        if(acresToPlant > owned){
             throw new CropException("There was a problem, please enter another value.");        
        }
        //if acresToPlant/2 > bushelInStorage, return -1
        int bushel = cropData.getwheatInStore();
        if(acresToPlant/2 > bushel){
             throw new CropException("There are not enough bushels of wheat in storage.");
        }
        //if acresToPlant/10 > population, return -1
        int pop = cropData.getpopulation();
        if(acresToPlant/10 > pop){
             throw new CropException("There are not enough people to plant wheat.");
        //acresPlanted = acresPlanted + acresToPlant
        }
        else{
        int planted = cropData.getacresPlanted();
        
        planted+= (acresToPlant);
        cropData.setacresPlanted(planted);
        
        //wheatInStore = wheatInStore - (acresToPlant/2)
        int wheat = cropData.getwheatInStore();
        wheat-= (acresToPlant/2);
        cropData.setwheatInStore(wheat);
       
       }
    }   
    /**
     *  Created by Martin
     *The cropYield method
     * Purpose: To calculate the Crop Yield per acre planted and add those crops to the total bushels owned.
     * @param yieldsOfCrop
     * @param cropData
     */
    public static void cropYield(int yieldsOfCrop, CropData cropData)
    {
        System.out.println("This year Crop Yield per acre was: " + yieldsOfCrop + " bushels of wheat");
        //wheatInStore = wheatInStore + crop yield * acresPlanted
        int wheat = cropData.getwheatInStore();
        int acresPlant = cropData.getacresPlanted();
        wheat += (yieldsOfCrop*acresPlant);
        cropData.setwheatInStore(wheat);
    }    
    /**
     * Created by Martin
     *The calcStarved method
     * Purpose: To calculate the People who starved.
     * @param cropData
     */
    public static void calcStarved(CropData cropData)
    {
        //peopleFeed = (wheatForFood /20)
        int peopleFeed = cropData.getwheatForFood()/20; //99
        int pop2 = cropData.getpopulation(); //100
        int peopleStarved = pop2 - peopleFeed; // 1
        
        if(peopleFeed < pop2){
            System.out.println("This year " + peopleStarved + " people died of starvation");
            pop2 -= peopleStarved;
            cropData.setnumberWhoDied(peopleStarved);
            cropData.setpopulation(pop2);            
        }
        else{
            System.out.println("This year no people died of starvation");
        }
    }
    /**
     *  Created by Martin
     *The growPopulation method
     * Purpose: To calculate the Population Growth.
     * @param growthPer
     * @param cropData
     */ 
    
    public static void growPopulation(float growthPer, CropData cropData)
    {
        int pop1 = cropData.getpopulation();  //100
        int newPip = pop1 *((int) growthPer);  //100*(3/100)= 3
        cropData.setnewPeople(newPip); // 3
        pop1 += newPip; //100+3 =103
        cropData.setpopulation(pop1); // 103
        System.out.println("This year the population grew by: " + growthPer + "%."); //3%
        System.out.println("The total population now is: " + pop1); // 103
    }
    

    //The seOffering method
    // Purpose: To set the percentage of offering the player wants to allocate
    // @param percentage to pay
    //@ return the percentage to pay or an error    
   // public static int setOffering(int percentageToPay)
    //{
    //if percentageToPay < 0 and > 1, return -1
     //   if(percentageToPay < 0 || percentageToPay > 100)
       //     return -1;
       // else return percentageToPay;
    //}
            
      
    
}
