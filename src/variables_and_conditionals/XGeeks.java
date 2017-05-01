package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
			String Daniel ="hacking";
			String Ebuka = "endurance";
		    String christopher ="reading";
		    String Jesus ="speed";
        // 2. Ask the user to enter a name. Store their answer in a variable.
               String name =JOptionPane.showInputDialog("enter a name");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
              if(name.equalsIgnoreCase("Daniel")){
            	  JOptionPane.showMessageDialog(null, "Dainels super power is "+Daniel);
            	  
            	  
              }else if(name.equalsIgnoreCase("Ebuka")){
            	  JOptionPane.showMessageDialog(null, "Ebukas super power is "+Ebuka);
}
              else if(name.equalsIgnoreCase("christopher")){
            	  JOptionPane.showMessageDialog(null, "christopher super power is "+christopher);
}
              else if(name.equalsIgnoreCase("jesus")){
            	  JOptionPane.showMessageDialog(null, "jesus super power is "+Jesus);
            	  
            	  
}           	              	  
              else {
            	  JOptionPane.showMessageDialog(null, "what is 2+2");
              }}            
}