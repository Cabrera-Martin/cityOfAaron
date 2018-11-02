/**
 * The GameControl class - part of the control layer
 * class contains all of the ++++++++++FILL THIS LATER++++++++++
 * Author: Jake and Martin
 * Date last modified: 02 Nov 2018
 */
package control;
import model.*;
import cityofaaron.CityOfAaron;

public class GameControl {
    public static void createNewGame(String _name)
    {
        
        // create the game object
        Game game = new Game();
        
        // create the player object and set the name
        Player player = new Player();
        player.setName(_name);
        
        // save reference to the player object in the game
        game.setPlayer(player);
        // create and initialize a CropData object
        // save a reference to it in the Game object
        CropData cropData = new CropData();
        
        cropData.setyear(0);
        cropData.setpopulation(100);
        cropData.setnewPeople(5);
        cropData.setcropYield(3);
        cropData.setnumberWhoDied(0);
        cropData.setwheatInStore(2700);
        cropData.setacresOwned(1000);
        cropData.setacresPlanted(1000);
        cropData.setharvest(3000);
        cropData.setacresPlanted(1000); 
        game.setcropData(); 
        
        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(game);   
        
    }
}
