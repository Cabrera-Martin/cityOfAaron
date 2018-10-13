/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Jake Davis, Martin Cabrera
 */
package model;

/**
 *
 * @author Jake Davis
 */
import java.io.Serializable;
public class CropData implements Serializable {
    

    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;

    public CropData(){
    }

    public int getyear(){
        return year;
    }
    public void setNumber(int _year) {
        year= _year;
    }
    
    public int getpopulation(){
        return population;
    }
    public void setpopulation(int _population) {
        population= _population;
    }
    
    public int getacresOwned(){
        return acresOwned;
    }
   public void setacresOwned(int _acresOwned) {
        acresOwned= _acresOwned;
    }
    
    public int getcropYield(){
        return cropYield;
    }
    public void setcropYield(int _cropYield) {
        cropYield= _cropYield;
    }
    
    public int getwheatInStore(){
        return wheatInStore;
    }
    public void setwheatInStore(int _wheatInStore) {
        wheatInStore= _wheatInStore;
    }
    
    public int getnumberWhoDied(){
        return numberWhoDied;
    }
    public void setnumberWhoDied(int _numberWhoDied) {
        numberWhoDied= _numberWhoDied;
    }
    
    public int getnewPeople(){
        return newPeople;
    }
    public void setnewPeople(int _newPeople) {
        newPeople= _newPeople;
    }
    
    public int getharvest(){
        return harvest;
    }
    public void setharvest(int _harvest) {
        harvest= _harvest;
    }
    
    public int getwheatForFood(){
        return wheatForFood;
    }
    public void setwheatForFood(int _wheatForFood) {
        wheatForFood= _wheatForFood;
    }
    
    public int getacresPlanted(){
        return acresPlanted;
    }
    public void setacresPlanted(int _acresPlanted) {
        acresPlanted= _acresPlanted;
    }
    
}