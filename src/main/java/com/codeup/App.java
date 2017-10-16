package com.codeup;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App{

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter something");
        String line = input.nextLine();

        if (StringUtils.isNumeric(line)){
            System.out.println(line + " is a number");
        }else{
            System.out.println(line + " is Not a number");
        }
        System.out.println("Flipped Case: "+  StringUtils.swapCase(line));
        System.out.println("Reversed: " + StringUtils.reverse(line));
    }

}




