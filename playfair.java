import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfair;

/**
 *
 * @author LENOVO
 */
public class Playfair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k=0;
        char[]ch=new char[26];
        Scanner s= new Scanner(System.in);
        System.out.println("ENTER THE ALPHABETS:");
        ch=s.next().toCharArray();
        System.out.println("ENTER THE KEY:");
        String key,pt;
        key=s.next();
        List<Character> a=new ArrayList<>();
        for(i=0;i<key.length();i++)
        {
            char c=key.charAt(i);
            
            if(a.contains(c))
            {
                continue;
            }
            a.add(c);
        }
        for(i=0;i<ch.length;i++)
        {
            if(a.contains(ch[i]))
                continue;
            else if(ch[i]=='j')
                continue;
            else
                a.add(ch[i]);   
        }
        System.out.println(a);
        System.out.println(a.size());
        int r=5,c=5;
        char mat[][]=new char[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                mat[i][j]=a.get(k);
                k++;
            }
        }
        System.out.println("KEY GENERATED:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               
               System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }
        
        // TODO code application logic here
    }
    
}
