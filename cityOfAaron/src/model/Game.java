/*
 * Game() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Jake Davis, Martin Cabrera
 */
package model;

/**
 *
 * @author Martin
 */
import java.io.Serializable;
public class Game implements Serializable{
    private Player thePlayer;
    
    public Game(){}
    public Player setPlayer()
    {
     return thePlayer;
    }
        public void getPlayer(Player _thePlayer){
        thePlayer= _thePlayer;
        }
}