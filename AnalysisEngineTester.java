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
* This program tests the code from the Analysys Engine and produces an output  *
*                                                                              *
* COPYRIGHT:                                                                   *
* This program is copyright (c) 2020 Justin Moehlenpah and Dean Zeller.        *
* It is original work without use of outside sources.                          *
*                                                                              *
*******************************************************************************/
public class AnalysisEngineTester
{
    public static void main(String args[])
    {
        AnalysisEngine study1 = new AnalysisEngine();
        study1.phase1();
        study1.phase2();
        study1.phase3();
        
        AnalysisEngine study2 = new AnalysisEngine();
        study2.phase1();
        study2.phase2();
        study2.phase3();
        
        AnalysisEngine study3 = new AnalysisEngine();
        study3.phase1();
        study3.phase2();
        study3.phase3();
          
        
        System.out.println("");
        System.out.println("----Exiting Program----");}}