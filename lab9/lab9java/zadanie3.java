import java.io.*;  
import java.util.Scanner;  
import java.util.ArrayList;
import java.util.Collections;
public class zadanie3 {
    public static void main(String args[])  
    {  
    ArrayList<String>x = new ArrayList<String>();  
    try  
    {  
    //the file to be opened for reading  
    FileInputStream fis=new FileInputStream("C:\\Users\\zedko\\Desktop\\lab9java\\xd.txt.txt");       
    Scanner sc=new Scanner(fis); 
    while(sc.hasNextLine())  
    {  
    x.add(sc.nextLine());
    }  
    sc.close();  
    }  
    catch(IOException e)  
    {  
    e.printStackTrace();  
    }  
    System.out.print(x+"\n");
    Collections.sort(x);
    System.out.print(x);
    }  
    }   

