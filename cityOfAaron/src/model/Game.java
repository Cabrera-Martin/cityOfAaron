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
    
    public ArrayList<ListItem> getTools(){
        return tools;
    }
    public void setTools(ArrayList<ListItem> _tools){
        tools= _tools;
    }
}