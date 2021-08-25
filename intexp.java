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
* This program creates a basic animation of a loading graphic                  *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
public class intexp {
  public static void main(String[] args) {
    //canvas setup
    StdDraw.setCanvasSize(1200,800);
    StdDraw.setPenRadius(0.08);
    StdDraw.setXscale(-600,600);
    StdDraw.setYscale(-400,400);
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
    
    
    double x = 0;
    double y = -380;
    double size = 0.51;
        StdDraw.square(x,y,size);
    if (StdDraw.isKeyPressed('D')){
      x += 10;
    
    StdDraw.square(x,y,size);
    }
    
    
  }
} 
