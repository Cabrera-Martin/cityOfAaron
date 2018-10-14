/*
 * The main() class file for the cityOfAaron project
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
public class Location implements Serializable{
    
    private String description;
    private String symbol;
    
    public Location(){
    }
    public String getDescription()
    {
     return description;
    }
        public void setDescription(String _description){
    description= _description;
    }
    public String getSymbol(){
        return symbol;
    }
    public void setSymbol(String _symbol) {
        symbol= _symbol;
    }
}
