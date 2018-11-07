/*
 * Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Jake Davis, Martin Cabrera
 */
package model;

import java.io.Serializable;
public class Game implements Serializable{
    private Player thePlayer;
    private CropData cropData;
    
    public Game(){}
    public Player setPlayer()
    {
     return thePlayer;
    }
        public void getPlayer(Player _thePlayer){
        thePlayer= _thePlayer;
        }
        public void setPlayer(Player player) {
        
    }
    public CropData setcropData()
    {
     return cropData;
    }
        public void getCropData(CropData _cropData){
        cropData= _cropData;
        }

    public CropData getCropData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
        
}