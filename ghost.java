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
* This program creates a basic animation of a ghost from the                   *
* game pac-man                                                                 *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
public class ghost {
  public static void main(String[] args) {
    StdDraw.setXscale(-1,1);
    StdDraw.setYscale(-1,1);
    StdDraw.enableDoubleBuffering();

    StdDraw.setPenColor(StdDraw.GREEN);
    double rx = .48, vx = .015;
    while (true)  { 
      
      // bounce off wall
      if (Math.abs(rx + vx) > .75) vx = -vx;
      
      // update position
      rx = rx + vx; 
      
      // clear the background
      StdDraw.clear(StdDraw.BLACK);
      
      //body color
      StdDraw.setPenColor(StdDraw.GREEN); 
      
      // body
      StdDraw.filledCircle(rx,.5,.25);
      StdDraw.filledRectangle(rx,.35,.25,.15);
      StdDraw.filledCircle(rx-.168,.23,.085);
      StdDraw.filledCircle(rx,.23,.085);
      StdDraw.filledCircle(rx+.168,.23,.085);
      
      
      //eyes
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.filledCircle(rx-.1,.55,.05);
      StdDraw.filledCircle(rx+.1,.55,.05);
      
      //pupils
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.filledCircle(rx-.12,.55,.03);
      StdDraw.filledCircle(rx+.08,.55,.03);
      
      // copy offscreen buffer to onscreen
      StdDraw.show();
      
      // pause for 20 ms
      StdDraw.pause(20);
      
    } 
  } 
}
