package exercises;

import javax.swing.JOptionPane;

public class Dollars {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		       
	 double quarters= .25;   
	 double  dimes= .10;      
     double nickels= .05;   
     double pennies= .01;    	          
	 double dollars= 1;
	 String numberOfQuartersString;
	 
	  numberOfQuartersString = JOptionPane.showInputDialog("Enter the number of quarters: ", JOptionPane.QUESTION_MESSAGE);
	  quarters = Double.parseDouble(numberOfQuartersString);
	  
	  
	  JOptionPane.showMessageDialog("Enter the number of dimes:     ", JOptionPane.QUESTION_MESSAGE);
    dime:input.next();
	  JOptionPane.showMessageDialog("Enter the number of nickels:   ", JOptionPane.QUESTION_MESSAGE);
	nickel: input.next();
	  JOptionPane.showMessageDialog("Enter the number of pennies:   ",JOptionPane.QUESTION_MESSAGE);
	pennie: input.next();
	  JOptionPane.showMessageDialog("The total in dollars is $" + dollars, JOptionPane.QUESTION_MESSAGE);
	dollars: input.next();  
		 
		 
	}	
}

	
