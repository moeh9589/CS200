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
  * This program creates a basic animation of circles appearing at               *
  * randdom locations all with random sizes                                      *
  *                                                                              *
  * COPYRIGHT:                                                                   *
  * This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
  * It is original work without use of outside sources.                          *
  *                                                                              *
  *******************************************************************************/
public class stars {
  public static void main(String[] args) {
    // canvas setup
    StdDraw.setCanvasSize(1200,900);
    int i = 0;
    double x = 0;
    while(i < 100){
      // random size generator
      x = Math.random();
      if (x < 0.1)
      {
        StdDraw.setPenRadius(x);
        int r = (int)(Math.random() * 256);
        
        int g = (int)(Math.random() * 256);
        
        int b = (int)(Math.random() * 256);
        
        StdDraw.setPenColor(r, g, b);
        //random points on screen
        StdDraw.point(Math.random(),Math.random());
        
        //screeen buffer
        StdDraw.show();
        StdDraw.pause(25);
        i++;
      }   
    }
  }
}