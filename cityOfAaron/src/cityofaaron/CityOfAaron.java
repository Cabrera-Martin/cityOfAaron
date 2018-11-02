/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Jake Davis, Martin Cabrera
 * Team code-name: E=m*Math.pow(c,2)
 * Date modified: November 1st, 2018
 */
package cityofaaron;

import model.*;
import viewLayer.*;


public class CityOfAaron {

    private static Game theGame = null;
    public Game setGame()
    {
     return theGame;
    }
        public void getGame(Game _theGame){
        theGame = _theGame;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           MainMenuView mmv = new MainMenuView();
           mmv.displayMenuView();
    }    
}