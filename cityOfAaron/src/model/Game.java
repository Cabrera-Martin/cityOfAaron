/*
 * Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Jake Davis, Martin Cabrera
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import control.*;
import viewLayer.*;
import cityofaaron.CityOfAaron;

public class Game implements Serializable{
    private Player thePlayer;
    private CropData cropData;
    private Map theMap;
    
    //a referance to the tools ListItem
    private ArrayList<ListItem> tools = null;
    //a referance to the animals ListItem
    private ArrayList<ListItem> animals = null;
    //a referance to the provisions ListItem
    private ArrayList<ListItem> provisions = null;
    
    public Game(){}
    public Player getPlayer()
    {
     return thePlayer;
    }
        public void setPlayer(Player _thePlayer){
        thePlayer= _thePlayer;
        }
        
    public CropData getcropData()
    {
     return cropData;
    }
        public void setcropData(CropData _cropData){
        cropData= _cropData;
    }
    public Map getMap()
    {
        return theMap;
    }
    public void setmap(Map _theMap){
        theMap= _theMap;
    } 
    public ArrayList<ListItem> gettools(){
        return tools;
    }
    public void settools(ArrayList<ListItem> _tools){
        tools= _tools;
    }
    /**Getter for animals
     *Created by Martin
     * @return animals
     */
    public ArrayList<ListItem> getanimals(){
        return animals;
    }
    /**Setter for animals
     *Created by Martin
     * @param _animals
     */
    public void setanimals(ArrayList<ListItem> _animals){
        animals = _animals;
    }

    /**Getter for provisions
     *Created by Martin
     * @return provisions
     */
    public ArrayList<ListItem> getprovisions(){
        return provisions;
    }

    /**Setter for provisions
     *Created by Martin
     * @param _provisions
     */
    public void setprovisions(ArrayList<ListItem> _provisions){
        provisions = _provisions;
    }
}