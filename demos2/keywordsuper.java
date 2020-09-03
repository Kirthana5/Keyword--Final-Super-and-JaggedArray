/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos2;

/**
 *
 * @author KIRTHANA
 */
public class keywordsuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bike b=new bike();
        b.display();
        b.print();
    }
    
}
class vehicle   //SUPER CLASS
{
    int speed=50,km=1000;  //----->SUPER VARIABLE (1)
    vehicle()              //----->SUPER CONSTRUCTOR (2)
    {
        System.out.println("VEHICLE CLASS'S CONSTRUCTOR!!");
    }
    void display()         //------>SUPER METHOD (3)
    {
        System.out.println("SPEED OF SUPER CLASS:"+speed);
    }
}
class bike extends vehicle     //SUB CLASS
{
    int speed=100,km=500;
    bike()
    {
        super();            //------->(2)
        System.out.println("BIKE CLASS'S CONSTRUCTOR!!");
    }
    void display()
    {
        super.display();    //------->(3)
        System.out.println("SPEED OF SUB CLASS:"+speed);
    }
    void print()
    {
        System.out.println("Km of SUPER class:"+super.km);   //----->(1)
        System.out.println("Km of SUB class:"+km);  
    }
    
}