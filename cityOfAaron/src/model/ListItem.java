/*
 * ListItem() class file for the cityOfAaron project
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
public class ListItem implements Serializable{ 
 
    private String name;
    private int number;
    
    public ListItem(){
    }
    public ListItem(String _name, int _number){
        name = _name;
        number = _number;
    }
    public String getName()
    {
     return name;
    }
        public void setName(String _name){
    name= _name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int _number) {
        number= _number;
    }
}
