package exercises;

import javax.swing.JOptionPane;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INCHES = 15;
		int feetTotal;
		int extraInches;
		int inchesRequired;
		String InchesString;
		
		InchesString = JOptionPane.showInputDialog(null, "How many inches?",
				"Inches Input", JOptionPane.QUESTION_MESSAGE);

		inchesRequired = Integer.parseInt(InchesString);
		
		
		feetTotal = inchesRequired / INCHES;
		extraInches=inchesRequired % INCHES;
		
		JOptionPane.showMessageDialog(null, "A job that needs " + inchesRequired +
				" inches required " + feetTotal + " feet plus " + extraInches + " inches.");
				
	}

}
