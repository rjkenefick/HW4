import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class reversestring {

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Please type a word.");
            String filename1 = console.nextLine();
            byte [] strAsByteArray = filename1.getBytes();
            byte [] result =
                    new byte [strAsByteArray.length];

            for (int i = 0; i<strAsByteArray.length; i++)
                result[i] =
                        strAsByteArray[strAsByteArray.length-i-1];

            System.out.println(new String(result));

        }
    }

