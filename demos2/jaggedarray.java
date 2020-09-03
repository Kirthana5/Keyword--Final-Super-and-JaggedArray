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
public class jaggedarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAGGED ARRAY 
        /*
        1 2 3 4
        5 6
        7 8 9*/
        int a[][]={{1,2,3,4},{5,6},{7,8,9}};
        System.out.println("ARRAY:\n");
      
        //normal array printing using for loop
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)  //----->each row is considered as 1-D array
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("ARRAY:\n");
        
        //printing array using enhanced for loop
        for(int i[]:a)   //------->the elements of 1st row is passed as 1Darray
        {
            for(int j:i) //-------->accessing elements of 1st row which is 1D array
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
