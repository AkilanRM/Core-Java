import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecheck;

/**
 *
 * @author LENOVO
 */
public class Datecheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String date;
        Scanner s=new Scanner(System.in);
        String num[]=new String[10];
        date=s.next();
        int month=Integer.parseInt(date.substring(3,5));
        System.out.println("MONTH:"+month);
        int day=Integer.parseInt(date.substring(0,2));
        System.out.println("DAY:"+day);
        int year=Integer.parseInt(date.substring(6,date.length()));
        System.out.println("YEAR:"+year);
        int leap = 0;
        if(year%4==0&& year%100!=0 ||year%400==0)
        {
             leap=year;
             System.out.println("IT IS A LEAP YEAR");
        }
        else
            System.out.println("IT IS NOT A LEAP YEAR");
        for(int i=1;i<13;i++)
        {
            if(i==month)
            {
                if(i<=7)
                {
                    if(i%2==0)
                    {
                        if(i ==2)
                        {
                            if(year==leap)
                                System.out.println("FEB 29");
                            else
                                System.out.println("FEB 28");
                        }
                        else
                            System.out.println("30DAYS");
                    }
               
                    else
                        System.out.println("31 DAYS");
                }
                else
                {
                    if(i%2==0)
                        System.out.println("31 DAYS");
                    else
                        System.out.println("30 DAYS");
                }
            }
        }
        
        
    // TODO code application logic here
    }
    
}
