

import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Type file name to use.");
        String filename = console.nextLine();
        File f = new File (filename);

       try {
           Scanner readFile = new Scanner(f);
           FileReader fr = new FileReader(f);

           LineNumberReader lnr = new LineNumberReader(fr);
           int lineNumber = 0;

           while (lnr.readLine() != null) {
               lineNumber++;
}

           System.out.println("Total number of lines : " + lineNumber);
           System.out.println("Total amount of Verses:");
           System.out.println("Enter the word that you want to search for: ");
           String userInput = console.nextLine();
           System.out.println ("The Word occurs this amount of times in the file: ");

       }
        catch (FileNotFoundException e){

       }catch(IOException e){
           e.printStackTrace();
       }
       }



    }









