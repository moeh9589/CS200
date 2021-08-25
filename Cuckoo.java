
  /*******************************************************************************
  *                     Assignment 7 -- Cuckoo Clock/StdDraw                     *
  *                                                                              *
  * PROGRAMMER:        Justin Moehlenpah (moeh9589@bears.unco.edu)               *
  * CLASS:             CS160 -- Structured Programming                           *
  * TERM:              Spring 2020                                               *
  * INSTRUCTOR:        Dean Zeller                                               *
  * SUBMISSION DATE:   4/10/20                                                   *
  *                                                                              *
  * DESCRIPTION:                                                                 *
  * This program takes ni a start and end hour and uses that                     *
  * to produce a simulation and animation of a clock with sounds                 *
  *                                                                              *
  * COPYRIGHT:                                                                   *
  * This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
  * It is original work without use of outside sources.                          *
  *                                                                              *
  *******************************************************************************/
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.*;
import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 

import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cuckoo {
  int curhour = 0;
  int endhour = 0;
  int curminute = 0;
  double rot = .7;
  String cuckoosound, ticsound;
  int a = 400;
  int b = 400;
  int angle = -45;
  
  public Cuckoo (){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Start Hour ==>");
    this.curhour = s.nextInt();
    System.out.print("Enter End Hour ===>");
    this.endhour = s.nextInt();
    this.curminute = 00;
    StdDraw.setCanvasSize(1000,1000);
    StdDraw.setXscale(-1000,1000);
    StdDraw.setYscale(-1000,1000);
    this.a = a;
    this.b = b;
    this.angle = angle;
    
  }
  /***********************************************************************
    * Method:   cuckoos                                                    *
    * Purpose:  Prints an hour by hour clock based on input                *
    * Parameters:                                                          *
    *           sound                                                       *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public void cuckoos(String sound) {
    int hour = this.curhour;    
    while (true)
    {
      System.out.print("[" + hour + ":00] ");      
      for (int i = 0; i <= hour-1; i++)
      {
        System.out.print(sound); 
        
        //StdDraw.clear();
        
      }
      System.out.println("");
      
      if (hour == this.endhour){
        break;
      }
      else {hour+=1;}
      if (hour == 13) {
        hour = 1;}
    }          
  }
  /***********************************************************************
    * Method:   runChimesandTics                                           *
    * Purpose:  Prints a minute by minute clock with tic sounds            *
    * Parameters:                                                          *
    *           sound, ticsound                                            *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public void runChimesandTics(String sound, String ticsound) {
    int hour = this.curhour;
    while (true){
      //clock animation
      for (int h = 0; h < this.endhour-1; h++){}
      
      for(int d = 0; d <= 360; d++){
        playTic();
        StdDraw.setPenRadius(0.08);
        
        StdDraw.clear();
        StdDraw.circle(0,0,600);
        StdDraw.line(0,0,a,b);
        b = ((int)(400*Math.cos(angle*Math.PI/180)))-((int)(400* Math.sin(angle*Math.PI/180)));
        a = ((int)(400*Math.sin(angle*Math.PI/180)))+((int)(400* Math.cos(angle*Math.PI/180)));
        
        angle++;
        StdDraw.show();
        //StdDraw.pause(60);
      }
      for (int j = 1; j < (this.endhour- hour+1); j++){
      }
      for (int i  = 0; i <=60; i++){
        this.curminute = i;
        if (this.curminute == 0) {
          System.out.print("[" + (hour) + ":0" + this.curminute + "]");
          for (int k = 0; k < hour; k++) {
            System.out.print(sound); 
            StdDraw.text(0,800,sound);
            playCuckoo();
          }                  
        }
        else if (this.curminute <10) {
          System.out.print("[" + (hour) + ":0" + this.curminute + "]" + ticsound);}
        else if(this.curminute >= 10 & this.curminute < 60){
          System.out.print("[" + (hour) + ":" + this.curminute + "]" + ticsound);
        }
      }     
      if (hour == this.endhour-1){
        System.out.print("[" + this.endhour + ":00]"); 
        for (int g = 0; g < this.endhour; g++){
          System.out.print(sound); 
        }
        break;
      }
      else {hour+=1;}
      if (hour == 13) {
        hour = 1;
      }
    }
    System.out.println("");    
  }
  /***********************************************************************
    * Method:   runChimesTicsQuarters                                      *
    * Purpose:  prints a minute by minute clock with                       *
    *           tic sounds as well as cuckoo sounds on every 15th minute   *
    * Parameters:                                                          *
    *           sound, ticsound                                            *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public void runChimesTicsQuarters(String sound, String ticsound) {
    int hour = this.curhour;
    while (true){
      for (int i  = 0; i <=60; i++){
        this.curminute = i;
        // minute checks
        if (this.curminute == 0) {
          
          System.out.print("[" + (hour) + ":0" + this.curminute + "]");
          for (int k = 0; k < hour; k++) {
            System.out.print(sound); 
          }                
        }
        else if (this.curminute % 15 == 0 & this.curminute !=60){
          System.out.print("[" + (hour) + ":" + this.curminute + "]" + sound);
        }
        else if (this.curminute <10) {
          System.out.print("[" + (hour) + ":0" + this.curminute + "]" + ticsound);}
        else if(this.curminute >= 10 & this.curminute < 60){
          System.out.print("[" + (hour) + ":" + this.curminute + "]" + ticsound);
        }
        // end of minute checks
      }            
      if (hour == this.endhour-1){
        System.out.print("[" + this.endhour + ":00]"); 
        // sound incorporation
        for (int g = 0; g < this.endhour; g++){
          System.out.print(sound); 
        }
        break;
      }
      else {hour+=1;}
      if (hour == 13) {
        hour = 1;}
    }
    System.out.println("");    
  }
    /***********************************************************************
    * Method:   playTic                                                    *
    * Purpose:  plays a tic sound                                          *
    * Parameters:                                                          *
    *           none                                                       *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public static void playTic(){
    try{
      File sound = new File("sounds/splooge.wav");
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(sound));
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
  }
    /***********************************************************************
    * Method:   playCuckoo                                                 *
    * Purpose:  plays a cuckoo sound                                       *
    * Parameters:                                                          *
    *           none                                                       *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public static void playCuckoo(){
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/peeeooop_x.wav").getAbsoluteFile()); 
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
  }
}

    




