/*******************************************************************************
*                     Assignment 6 -- Graphics                                 *
*                                                                              *
* PROGRAMMER:        Justin Moehlenpah (moeh9589@bears.unco.edu)               *
* CLASS:             CS160 -- Structured Programming                           *
* TERM:              Spring 2020                                               *
* INSTRUCTOR:        Dean Zeller                                               *
* SUBMISSION DATE:   3/22/20                                                   *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program creates a pac man object                                        *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
public class pacman {
  public static void main(String[] args) {
    //creates new pacman
    Pacmantester pac = new Pacmantester();
    String colo = "StdDraw.GREEN";
    pac.pacmanMaker(.4, colo);        
  }
}
