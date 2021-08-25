/*******************************************************************************
*                     Final Project -- Animation and Sound                     *
*                                                                              *
* PROGRAMMER:        Justin Moehlenpah (moeh9589@bears.unco.edu)               *
* CLASS:             CS160 -- Structured Programming                           *
* TERM:              Spring 2020                                               *
* INSTRUCTOR:        Dean Zeller                                               *
* SUBMISSION DATE:   5/2/20                                                    *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program will use simple algorithms to randomly choose a restaurant      *
* based on user input. From that, it will produce an animation showing what    *
* the final decision is along with a sound that can be familiarized to the     *
* restaurant                                                                   *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
import java.util.Scanner;

public class restaurant_tester{
  public static void main(String[] args) {
    //creates scanner object
    Scanner inp = new Scanner(System.in);
    
    //created new restaurant chooser object
    restaurant_chooser restaurant1 = new restaurant_chooser();
    
    //gets information for family
    System.out.println("Enter the amouunt of people");
    restaurant1.get_num_of_family_members();
    System.out.println("");
    System.out.println("Enter the names of family members");
    restaurant1.get_names();
    System.out.println("Where would you like to eat?");
    restaurant1.ask_users();
    
    //randomly chooses restaurant
    restaurant1.choose_restaurant();
    //restaurant1.play_McD_sound();
    
    
  }
}