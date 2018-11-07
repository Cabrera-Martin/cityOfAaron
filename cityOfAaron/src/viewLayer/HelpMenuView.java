/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewLayer;
import model.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Jake and Martin
 */
public class HelpMenuView {
    
    private String helpMenu;
    private int max;
    int userInput = 0;
    final int MAX = 5;
    Scanner keyboard = new Scanner(System.in);
    
    public HelpMenuView()
    {
        helpMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View Map\n" +
                   " 2 - View List\n" +
                   " 3 - Move to new location\n" +
                   " 4 - Manage Crops\n" +
                   " 5 - Go back\n";
        
        max = 5;
    }
}
