package exercises;

import javax.swing.JOptionPane;

public class Eggs
{
   @SuppressWarnings("unused")
public static void main(String[] args)
   {
     
      int eggsOrdered;
      int computeDozen;
      int accumulateDozen;
      int computeSingle;
      double dozenEggs = 3.25;
      double singleEgg = 0.45;
      double cost = 0;
      double dozen= 12;
      String eggsOrderStr;
      
      eggsOrderStr = JOptionPane.showInputDialog(null, " Enter amount of eggs you want to order: ", "Purchase",
                                                JOptionPane.QUESTION_MESSAGE);
      eggsOrdered = Integer.parseInt(eggsOrderStr);
      
        computeSingle = eggsOrdered;
        cost = eggsOrdered * singleEgg;
      
     
       computeDozen = (int) (eggsOrdered / dozen);
       cost = computeDozen * dozenEggs;
         
         
        computeDozen = eggsOrdered / 12;
        cost = computeDozen * dozenEggs;
        computeSingle = computeDozen * 12;
        computeSingle = eggsOrdered - computeSingle;
        cost += computeSingle * singleEgg;
        
        JOptionPane.showMessageDialog(null, "Ordered " + eggsOrdered + " eggs. That's " + computeDozen + " a dozen eggs at " + dozenEggs +
        " per dozen and " + computeSingle + " loose eggs at $" + singleEgg + " each for a total of $"
        + String.format("%.2f",cost), "Total", JOptionPane.INFORMATION_MESSAGE);      
      
   
   }





		
	}


