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
public class keywordfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        finaldemo f=new finaldemo();
        System.out.println(f.i);
        System.out.println(f.j);
        f.display();
    }
    
}
final class finaldemo  //------->3
{
    int i=10;
    final int j=10;  //----->1
    final void display()  //------>2
    {
        System.out.println("Inside display method:"+(++i));
        //System.out.println(++j);--------->this is not possible as 'j' is declared as final
    //1------->RESTRICTION:value of variable declared as FINAL remains CONSTANT throughout prgm
    }
}
/*class b1 extends finaldemo----->2.RESTRICTION: class declared as FINAL can't be INHERITED
{
   void display()-------->3.RESTRICTION:method declared as FINAL can't be OVERRIDDEN
   {
       System.out.println("Hai");
   }
}   */
