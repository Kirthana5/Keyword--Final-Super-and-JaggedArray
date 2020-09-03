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
public class constructorusinginheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        c obj=new c();          //------->(1)
    }
    
}
class a
{
    a()
    {
        
        System.out.println("A");   //-------->(3)executes this constructor
    }
}
class b extends a
{
    b()
    {
        
        System.out.println("B");   //------->(4)then this constructor
    }
}
class c extends b              //--------->(2)then it looks for it's super class
{
    c()
    {
        
        System.out.println("C");  //------->(5)and atlast this one
    }
}