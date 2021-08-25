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
* This program creates a basic animation of pac-man opening and closing        *
* his mouth                                                                    *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
public class Pacmantester{
  public void pacmanMaker(double param, String colo){
    //double param = .5;
    StdDraw.setCanvasSize(900,900);
    StdDraw.setXscale(0,5);
    StdDraw.setYscale(0,5);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.setPenRadius(.01);
    StdDraw.point(param,(param*1.4));
    
    //animation loop
    while(true){
      // StdDraw.arc(.5,.5,.5,45,315);
        int r = (int)(Math.random() * 256);
        
        int g = (int)(Math.random() * 256);
        
        int b = (int)(Math.random() * 256);
        
        StdDraw.setPenColor(r, g, b);
      
      //body
      StdDraw.filledCircle(param,param,param);
      
      //creating white space for open mouth
      double [] x = {param,(param*2),(param*2),(param*2)};
      double [] y = {param,(param*2),param,0};
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.filledPolygon(x,y);
      
      //eye
      StdDraw.setPenRadius(.02);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.point(param,(param*1.4));
      //mouth lines
      StdDraw.setPenRadius(.01);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.line(param,param,(param*1.708),(param*1.708));
      StdDraw.line(param,param,(param*1.708),(param*.292));
      StdDraw.setPenColor(StdDraw.YELLOW);
      
      //animation switch
      try {
        Thread.sleep(100);
      }
      catch (InterruptedException e) {
        System.out.println("Error sleeping");
      }
      //Closed mouth pacman
      StdDraw.setPenColor(r, g, b);
      
      //body
      StdDraw.filledCircle(param, param, param);
      
      //body outline
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.circle(param, param, param);
      
      //eye
      StdDraw.setPenRadius(.02);
      StdDraw.point(param,(param*1.4));
      
      //mouth
      StdDraw.setPenRadius(.01);
      StdDraw.line(param,param,(param*2),param);
      StdDraw.show();
      StdDraw.pause(500);
    }
  }
}