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
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
import java.util.Random;
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class restaurant_chooser{
  //creates arraylists for restaurants and users
  List<String> restaurants = new ArrayList<String>();   
  List<String> users = new ArrayList<String>();
  List<String> final_list = new ArrayList<String>();
  
  //instantiates global variables
  int num = 0;
  String str = "";
  String rest_name = "";
  //restaurants.add("mcdonalds");
  Scanner inp = new Scanner(System.in);
  
  public restaurant_chooser() { 
    //constructor
    this.num = 0;
    this.rest_name = "";
    this.str = "";
  }
  /***********************************************************************
    * Method:   get_num_of_family_members                                  *
    * Purpose:  Gets number of family members from input                   *
    * Parameters:                                                          *
    *           none                                                       *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public void get_num_of_family_members() {
    this.num = inp.nextInt();
  }
  /***********************************************************************
    * Method:   get_names                                                  *
    * Purpose:  Gets names of family members                               *
    * Parameters:                                                          *
    *           none                                                       *
    * Return Value:  none                                                  *
    ***********************************************************************/
  public void get_names() {
    //uses this.num to get names of family members
    for(int i = 0; i< this.num; i++){
      String name = inp.next(); 
      //adds names  to users arraylist
      users.add(name);
      
    }
    System.out.println("list elements:" + users);
  }
  /***********************************************************************
  * Method:   ask_users                                                  *
  * Purpose:  Asks users for their desired restaurant                    *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public void ask_users() {
    //asks each user for their desired restaurant
    for (int i = 0; i < users.size(); i++){
      System.out.println(users.get(i));
      this.rest_name = inp.next();
      //adds restaurants to final_list
      final_list.add(this.rest_name);
      
      //if (this.rest_name == "mcdonalds"){
      // System.out.println("MCDONALDS");
      
    }
    System.out.println(final_list);
    
  }
  /***********************************************************************
  * Method:   choose_restaurant                                          *
  * Purpose:  Randomly chooses restaurant from final_list                *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public void choose_restaurant() {
    //creates random object
    Random r = new Random();
    
    // randomly generates a number based on final_list size
    int rand_num = r.nextInt(final_list.size());
    
    //gets the index of final_list based on random number
    String x = final_list.get(rand_num);
    System.out.println(x);
    
    //checks user input for any newline characters and removes them
    String cleanString = x.replaceAll("\r", "").replaceAll("\n", "");
    
    //checks the user input 
    if (cleanString.contains("tbell")){
      
      //calls method corresponding with input 
      play_Taco_sound();
    }
    
    if (cleanString.contains("McDonalds")){
      play_McD_sound(); 
    }
    
    if (cleanString.contains("Red-Robin")){
      play_Yum_sound(); 
    }
    
    if (cleanString.contains("Popeyes")){
      play_Popeyes_sound(); 
    }  
    
    if (cleanString.contains("Wendys")){
      play_wendys_sound(); 
    }
  }
  /***********************************************************************
  * Method:   play_McD_sound                                             *
  * Purpose:  Plays animatiion and sound for McDonalds                   *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public static void play_McD_sound(){
    // finds audio file and plays it
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("mcdonalds.wav").getAbsoluteFile()); 
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
    //set canvas size
    StdDraw.setCanvasSize(1599,1153); 
    
    //instantiate scaling variables
    double x = 0;
    double y = 0;
    double deg = 0;
    
    //for loop to increase size of image
    for (int k = 0;k <= 30; k++){
      if (k <=15) {
        x += .05;
        y += .05;
      }
      //loop to decrease size of image
      else if (k > 15) {
        x -= .05;
        y -= .05;
      }
      //rotate image
      deg += 10;
      
       // thread to sleep for 1000 milliseconds
      try {
        Thread.sleep(100);
      } catch (Exception e) {
        System.out.println(e);
      }
      //StdDraw.clear();
      //produces image with rotation and size fluctuation
      StdDraw.show();
      StdDraw.picture(.5,.5,"McD.jpg",x,y,deg);
    }
  }
  /***********************************************************************
  * Method:   play_Taco_sound                                            *
  * Purpose:  Plays animatiion and sound for Taco Bell                   *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public static void play_Taco_sound(){
    
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("taco-bell-bong-sfx.wav").getAbsoluteFile()); 
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
    
    StdDraw.setCanvasSize(1599,1153);   
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
      StdDraw.picture(.5,.5,"tbell.jpg",x,y,deg);
    }
  }
  /***********************************************************************
  * Method:   play_Yum_sound                                             *
  * Purpose:  Plays animatiion and sound for Red Robin                   *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public static void play_Yum_sound(){
    
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("yum.wav").getAbsoluteFile()); 
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
    
    StdDraw.setCanvasSize(1599,1153);   
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
      StdDraw.picture(.5,.5,"yum.jpg",x,y,deg);
    }
  }
  /***********************************************************************
  * Method:   play_Popeyes_sound                                         *
  * Purpose:  Plays animatiion and sound for Popeyes                     *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public static void play_Popeyes_sound(){
    
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("popeyes.wav").getAbsoluteFile()); 
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
    
    StdDraw.setCanvasSize(1599,1153);   
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
      StdDraw.picture(.5,.5,"popeyes.jpg",x,y,deg);
    }
  }
  /***********************************************************************
  * Method:   play_wendys_sound                                          *
  * Purpose:  Plays animatiion and sound for Wendys                      *
  * Parameters:                                                          *
  *           none                                                       *
  * Return Value:  none                                                  *
  ***********************************************************************/
  public static void play_wendys_sound(){
    
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("wendys.wav").getAbsoluteFile()); 
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
      
      Thread.sleep(100);
    }
    catch(Exception ex){
      ex.printStackTrace(); 
    }
    
    StdDraw.setCanvasSize(1599,1153);   
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
  }
}

