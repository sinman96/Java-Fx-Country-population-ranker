// This code ranks countries in terms of their populations in descending order.
// There are 195 independent countries in the world, hence the choice of 195 in the counter.
// This could be applied to cities as well if you wanted.

package populationsofworld;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Country
{
    public String Name;
    public int   amountofpeople;
    
    public Country(String Name, int iamountofpeople)
    {
        this.Name=Name;
        this.amountofpeople= iamountofpeople;
    }
}
public class Populationsofworld {

    
    public static void main(String[] args) {
        {
      ArrayList<Country> alCountry = new ArrayList();
        
        Scanner osScan = new Scanner(System.in);
        Scanner oiScan = new Scanner(System.in);
        
        String sName;
        int iamountofpeople;
        int iCount;
        
        for (iCount=0; iCount<195; iCount++)
        {
        
        System.out.println("Enter a country name:");
        sName =osScan.nextLine();
        System.out.println("Enter a country's population:");
        iamountofpeople =oiScan.nextInt();
        
        alCountry.add(new Country(sName,iamountofpeople));
    }
        //example of ascending sort
        Collections.sort(alCountry, new Comparator<Country>()
        {
            @Override
            public int compare(Country s1, Country s2)
            {
         return Integer.valueOf(s2.amountofpeople).compareTo(s1.amountofpeople);
            }
        });
    
        for (iCount=0; iCount<alCountry.size(); iCount ++)
        {
     System.out.println("Country: " + alCountry.get(iCount).Name + ", Population: " + alCountry.get(iCount).amountofpeople);
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
}
