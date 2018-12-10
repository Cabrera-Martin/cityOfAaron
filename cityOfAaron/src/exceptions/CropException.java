/*
 * The 
 * CIT-260
 * Fall 2018
 * Team members: Jake Davis, Martin Cabrera
 * Creation Date: November 27th, 2018
 */
package exceptions;
/**
 *
 * @author Martin
 */
public class CropException extends Exception {
    
    // Default constructor
    // Purpose: Initializes data members to default values
    // Parameters: none
    // Returns: none
    public CropException() { }


    // Parameterized  constructor
    // Purpose: Initializes data members to value passed as a parameter
    // Parameters: A string containing the error message
    // Returns: none
    public CropException(String string)
    {
        super(string);
    } 
}
