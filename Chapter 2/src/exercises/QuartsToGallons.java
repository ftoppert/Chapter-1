package exercises;

import javax.swing.JOptionPane;

public class QuartsToGallons {

	public static <Quarts, Gallons> void main(String[] args) {
		// TODO Auto-generated method stub

		final int QUARTS = 4;
		int gallonsTotal;
		int extraQuarts;
		int quartsRequired;
		String quartsString;
		
		quartsString = JOptionPane.showInputDialog(null, "How many quarts?",
				"Quarts Input", JOptionPane.QUESTION_MESSAGE);

		quartsRequired = Integer.parseInt(quartsString);
		
		
		gallonsTotal = quartsRequired / QUARTS;
		extraQuarts=quartsRequired % QUARTS;
		
		JOptionPane.showMessageDialog(null, "A jobthat needs " + quartsRequired +
				" quarts required " + gallonsTotal + " gallons plus " + extraQuarts + " quarts.");
				
				


}
}