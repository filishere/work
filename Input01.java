package edu.smg;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    //    String input = JOptionPane.showInputDialog("What's your name?");
     //   System.out.println(input);
        
        //Parse the input as an int.
        //Print its value +1
        
    	//String input = JOptionPane.showInputDialog("What's your name?");
    	//int number = Integer.parseInt(input);
    	//number++;
         // System.out.println(number);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

          System.out.println(Integer.parseInt( JOptionPane.showInputDialog("What's your name?"))+1);
    }
}