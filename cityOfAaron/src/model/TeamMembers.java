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
public enum TeamMembers
{
    
   MC("Tincho","Mister"),
   Dasammy("Dasammy","Blue");
   
private String name;
private String title;
        
TeamMembers(String _name, String _title)
{
name=_name;
title=_title;
}
public String getName()
{
return name;
}
public String getTitle()
{
return title;
}
}