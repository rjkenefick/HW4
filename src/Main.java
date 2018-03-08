

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please type a word.");
        String filename = console.nextLine();

        String string = "Hello";
        String keyword = filename;

        Boolean found = Arrays.asList(string.split(" ")).contains(keyword);
        if(found){
            System.out.println("Keyword matched the string "+ keyword);
        }
    }
}
