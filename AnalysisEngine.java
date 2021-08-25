/*******************************************************************************
*                     Assignment 4 -- Standard Deviation                       *
*                                                                              *
* PROGRAMMER:        Justin Moehlenpah (moeh9589@bears.unco.edu)               *
* CLASS:             CS160 -- Structured Programming                           *
* TERM:              Spring 2020                                               *
* INSTRUCTOR:        Dean Zeller                                               *
* SUBMISSION DATE:   2/21/20                                                   *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program calculates sum, average, variance, standard                     *
* deviation, minimum, and maxumum based on user input                          *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
import java.util.Scanner;

public class AnalysisEngine
{
    // defining attributes
    public double worldsum;
    public double worldaverage;
    public String researcher = "";
    public String study = "";
    public double worlddata = 0;
    public int    worldnums = 0;
    public double worldvariance = 0;
    public String arrayOfNums[] = {};
    public double worldstdev = 0;
    public double worldmin = 0;
    public double worldmax = 0;
    public String worldname = "";
    public String worldstudy = "";
    public Double numlist[] = new Double[worldnums];
    public int numlength = 0;
    public double sqDiff = 0;
      
    public AnalysisEngine()
    {
      System.out.println("Welcome to Assignment 4: Standard Deviation");
      System.out.println("Programmed by Justin Moehlenpah");
      System.out.println("");
      Scanner inp = new Scanner(System.in);
  
      System.out.print("Please enter your name => ");
      String researcher = inp.nextLine();
      System.out.println("Hello, " + researcher);
      System.out.println("");
  
      System.out.print("Please enter the title of the study => ");
      String studyName = inp.nextLine();
      System.out.println("Study title set to " + studyName);
      System.out.println("");
  
      System.out.println("Introcudtion: \nThis program will calculate the standard deviation for a list of numbers entered by the user. It will run in three phases:");
      System.out.println("    Phase 1 - Gather input from the user\n    Phase 2 - Calculate sum, average, variance, stdev\n    Phase 3 - Output results");
      System.out.println("");
      

  
      this.worldname = researcher;
      this.worldstudy = studyName;
      this.worldsum = 0;
      this.worldaverage = 0;
      this.worlddata = 0;
      this.worldnums = 0;
      this.worldvariance = 0;
      this.worldstdev = 0;
      this.worldmin = 0;
      this.worldmax = 0;
      this.sqDiff = 0;
      this.numlength = worldnums;
    }
    /***********************************************************************
    * Method:   phase1                                                     *
    * Purpose:  Gathers user inputted numbers                              *
    * Parameters:                                                          *
    *           none                                                       *
    * Return Value:  none                                                  *
    ***********************************************************************/

    public void phase1()
    { //int nums = worldnums;


        // gathering data
        System.out.println("---------------------------------");
        System.out.println("Phase 1 -- Gathering Data for " + worldstudy);
        System.out.println("---------------------------------");
        Scanner myObj = new Scanner(System.in);
        System.out.print("To enter the data correctly, the program needs to know how many numbers are in the dataset. \n     Size of dataset => ");
        this.worldnums = myObj.nextInt();
        System.out.println("     Data will have " + worldnums + " elements, " + "indexed from 0 to " + (worldnums-1));
        numlist = new Double[worldnums];
        System.out.println("Enter integer or floating-point numbers:");
        
        for (int i = 0; i < numlist.length; i++) { 
          System.out.print("     Index " + i);
          numlist[i] = myObj.nextDouble();

          worldsum += numlist[i];
        }
        System.out.print("Data entered: ");
         for(int i = 0; i< numlist.length; i++) {
            System.out.print(" " + numlist[i] + ",");
            }
         System.out.println("");
         System.out.println("\nPhase 1 Complete");

      
    }
    /***********************************************************************
    * Method:   calcSum                                                    *
    * Purpose:  Calculates the sum of any numbers                          *
    * Parameters:                                                          *
    *     none                                                             *
    * Return Value:  none                                                  *
    ***********************************************************************/

    public void calcSum()
    {
      double sum = 0;
      sum += worldsum;
      System.out.println("Calculated sum (" + sum + ")");
      this.worldsum = sum;
    }
    /***********************************************************************
    * Method:   calcAverage                                                *
    * Purpose:  Divides the sum variable by 3                              *
    * Parameters:                                                          *
    *    none                                                              *
    * Return Value:  none                                                  *
    ***********************************************************************/

    public void calcAverage()
    {
     double avg = 0;
     avg = this.worldsum/this.worldnums;
     System.out.println("Calculated average (" + avg + ")");
     this.worldaverage = avg;
    }
    /***********************************************************************
    * Method:   calcVariance                                               *
    * Purpose:  Finds the variance of an array of numbers                  *
    * Parameters:                                                          *
    *    none                                                              *
    * Return Value:  none                                                  *
    ***********************************************************************/
    public void calcVariance()
    {   
      for (int i = 0; i < numlist.length; i++)  {
            this.sqDiff += (numlist[i] - this.worldaverage) * (numlist[i] - this.worldaverage);
      }
         this.worldvariance = this.sqDiff / (this.worldnums - 1);
      System.out.println("Calculated variance (" + this.worldvariance + ")");
    /***********************************************************************
    * Method:   calcStdev                                                  *
    * Purpose:  Finds the standard deviation of an array of numbers        *
    * Parameters:                                                          *
    *    none                                                              *
    * Return Value:  none                                                  *
    ***********************************************************************/
    }
        public void calcStdev()
    {
      this.worldstdev = Math.sqrt(this.worldvariance);
      System.out.println("Calculated SD (" + this.worldstdev + ")");
    /***********************************************************************
    * Method:   calcMin                                                    *
    * Purpose:  Finds the minimum value in array                           *
    * Parameters:                                                          *
    *    none                                                              *
    * Return Value:  none                                                  *
    ***********************************************************************/          
    }
        public void calcMin()
    {
        Double minValue = numlist[0]; 
        for(int i=1;i < numlist.length;i++){ 
          if(numlist[i] < minValue){ 
            minValue = numlist[i];
          }
        }
        this.worldmin = minValue;
        System.out.println("Calculated min (" + this.worldmin + ")");
          
    }
    /***********************************************************************
    * Method:   calcMax                                                    *
    * Purpose:  Finds the maximum value in array                           *
    * Parameters:                                                          *
    *    none                                                              *
    * Return Value:  none                                                  *
    ***********************************************************************/
      public void calcMax()
    {
        Double maxValue = numlist[0]; 
        for(int i=1;i < numlist.length;i++){ 
          if(numlist[i] > maxValue){ 
            maxValue = numlist[i];
          }
        }
        this.worldmax = maxValue;
        System.out.println("Calculated max(" + this.worldmax + ")");
        System.out.println("");
    }
    /***********************************************************************
    * Method:   phase2                                                     *
    * Purpose:  Performs calculations based on user input                  *
    * Parameters:                                                          *
    *     none                                                             *
    * Return Value:  none                                                  *
    ***********************************************************************/
 
    public void phase2()
    {
        // performing calculations
        System.out.println("---------------------------------");
        System.out.println("Phase 2 - Performing calcualtions");
        System.out.println("---------------------------------");
        System.out.println("");
        // calling methods for each calculation
        calcSum();
        calcAverage();
        calcVariance();
        calcStdev();
        calcMin();
        calcMax();
        // print statements
        System.out.println("Phase 2 Complete");
        System.out.println("---------------------------------");

    }
    /***********************************************************************
    * Method:   phase3                                                     *
    * Purpose:  Generates output based on calculations                     *
    * Parameters:                                                          *
    *     none                                                             *
    * Return Value:  none                                                  *
    ***********************************************************************/
    public void phase3()
    {
        // outputting results
        System.out.println("---------------------------------");
        System.out.println("Phase 3 -- Output Table");
        System.out.println("---------------------------------");     
        System.out.println("");
        System.out.println("+----------------------------+");
        System.out.println("|" + worldname +"'s Awesome Study      |\n|by "+ worldname + "                   |");
        System.out.println("+----------------------------+");
        System.out.format("|Total:%21.3f |\n" ,this.worldsum);
        System.out.format("|Average:%19.3f |\n" , this.worldaverage);
        System.out.printf("|Variance:%18.3f |\n" , this.worldvariance);
        System.out.printf("|Stdev:%21.3f |\n" , this.worldstdev);
        System.out.printf("|Min:%23.3f |\n" , this.worldmin);
        System.out.printf("|Max:%23.3f |\n" , this.worldmax);
        System.out.println("+----------------------------+");
        System.out.println("");
        System.out.println("Phase 3 Complete");
        System.out.println("---------------------------------");  
        System.out.println("");
        System.out.println("Exiting " + this.worldstudy);
        System.out.println("---------------------------------");
    }
}