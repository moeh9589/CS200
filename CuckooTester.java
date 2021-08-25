/*******************************************************************************
*                     Assignment 7 -- Cuckoo Clock (tester)                    *
*                                                                              *
* PROGRAMMER:        Justin Moehlenpah (moeh9589@bears.unco.edu)               *
* CLASS:             CS160 -- Structured Programming                           *
* TERM:              Spring 2020                                               *
* INSTRUCTOR:        Dean Zeller                                               *
* SUBMISSION DATE:   4/10/20                                                   *
*                                                                              *
* DESCRIPTION:                                                                 *
* This program tests the code from Cuckoo.java and creates two clocks          *
*                                                                              *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
public class CuckooTester
{
    public static void main(String args[])
    {
        Cuckoo clock1 = new Cuckoo();
        //StdDraw.circle(.5,.5,.2);
        System.out.println("Hourly Chimes\n---------------------------------------");
        clock1.cuckoos(" Cuckoo! ");
        System.out.println("");
        System.out.println("Chimes and Tics");
        System.out.println("---------------------------------------");
        clock1.runChimesandTics(" Cuckoo! ", " tic ");
        System.out.println("");
        System.out.println("Chimes Tics and Quarters\n--------------------------------------");
        clock1.runChimesTicsQuarters(" Cuckoo! ", " tic ");
        System.out.println("");
       
        Cuckoo clock2 = new Cuckoo();
        System.out.println("Hourly Chimes\n---------------------------------------");
        clock2.cuckoos(" Bawk! ");
        System.out.println("");
        System.out.println("Chimes and Tics");
        System.out.println("---------------------------------------");
        clock2.runChimesandTics(" Squawk! ", " ping ");
        System.out.println("");
        System.out.println("Chimes Tics and Quarters\n--------------------------------------");
        clock2.runChimesTicsQuarters(" Ricky-Roooo! ", " doot ");
        System.out.println("");
          
    }
}

