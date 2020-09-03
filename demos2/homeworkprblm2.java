/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*PROBLEM STATEMENT:
    A software product is needed that store and rerieves information 
about automobiles.The information needed about all automobile is:
maker(string),Vehicleidentificationnumber(string),Bluebookvalue(float),
year(Integer),passengers(integer).
   Derive a class car from automobile.The fields are warranty(boolean),
doors(int),imported(boolean),topspeed(integer),size(string),rear door
(string).
   Derive a class truck which have the following fields Topper(boolean),
Wheels(string),Racks(Integer).
   The product have to display all information about all vehicles.*/
package demos2;

/**
 *
 * @author KIRTHANA
 */
public class homeworkprblm2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        car c=new car("Toyota","TN39 BK 5050",5678.5f,2018,5,true,false,4,140,"Medium","Yes");
        System.out.println(c);
        
        truck t=new truck("Toyota","TN39 Bt 5680",5698.5f,2018,3,true,"8 wheels",4);
        System.out.println(t);
        
    }
    
}
class automobile
{
    String maker,idnum;
    float bbvalue;
    int year,pssngr;
}
class car extends automobile
{
    boolean warranty,importsts;
    int doors,topspeed;
    String size,reardoor;
    car(String m,String id,float bb,int y,int p,boolean w,boolean i,int d,int ts,String s,String rd)
    {
       maker=m; 
       idnum=id;
       bbvalue=bb;
       year=y;
       pssngr=p;
       warranty=w;
       importsts=i;
       doors=d;
       topspeed=ts;
       size=s;
       reardoor=rd;
             
    }     
       @Override
    public String toString()
    {
        return ("\nMAKER:"+maker+"\nVEHICLE IDENTIFICATION NUMBER:"+idnum+"\nBLUE BOOK VALUE:"+bbvalue+"\nYEAR:"+year+"\nPASSENGERS:"+pssngr+"\nWARRANTY:"+warranty+"\nIS IT IMPORTED?"+importsts+"\nNO. OF DOORS"+doors+"\nTOPSPEED:"+topspeed+"km\nSIZE:"+size+"\nREAR DOOR:"+reardoor);
    }
}
class truck extends automobile
{
    boolean topper;
    String wheels;
    int racks;
    truck(String m,String id,float bb,int y,int p,boolean t,String w,int r)
    {
       maker=m; 
       idnum=id;
       bbvalue=bb;
       year=y;
       pssngr=p;
       topper=t;
       wheels=w;
       racks=r;
    }
    @Override
    public String toString()
    {
        return ("\nMAKER:"+maker+"\nVEHICLE IDENTIFICATION NUMBER:"+idnum+"\nBLUE BOOK VALUE:"+bbvalue+"\nYEAR:"+year+"\nPASSENGERS:"+pssngr+"\nTOPPER:"+topper+"\nWHEELS:"+wheels+"\nNO. OF RACKS:"+racks);
    }
}

    