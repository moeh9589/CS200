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
  * This program creates a basic animation of random lines appearing at random   *
  * locations with random lengths                                                * 
  *                                                                              *
  * COPYRIGHT:                                                                   *
  * This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
  * It is original work without use of outside sources.                          *
  *                                                                              *
  *******************************************************************************/
public class lines {
  public static void main(String[] args) {
    // canvas setup
    StdDraw.setCanvasSize(1200,900);
    StdDraw.setPenRadius(.02);
    StdDraw.setPenColor(StdDraw.BLACK);
    int i = 0;
    double x = 0;
    double y = 0;
    double deg = 0;
    
    for (int k = 0;k <= 30; k++){
      if (k <=15) {
        x += .05;
        y += .05;
      }
      else if (k > 15) {
        x -= .05;
        y -= .05;
      }
      deg += 10;
      try {
        // thread to sleep for 1000 milliseconds
        Thread.sleep(100);
      } catch (Exception e) {
        System.out.println(e);
      }
      //StdDraw.clear();
      StdDraw.show();
      StdDraw.picture(.5,.5,"wendys.png",x,y,deg);
    }
    /* while(i < 100){
     //random points on screen
     StdDraw.line(Math.random(),Math.random(),Math.random(),Math.random());
     
     //screeen buffer
     StdDraw.show();
     StdDraw.pause(25);
     i++;
     }*/
  }
}