package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Hillogan {
public static void main(String[] args) {
Random randy= new Random();
int x=randy.nextInt(100)+ 1;
String answer=JOptionPane.showInputDialog("Enter a Random Number");
int ansAslnt=Integer.parseInt(answer); 
for (int i = 0; i < args.length; i++) 
	if(ansAslnt> x)
   JOptionPane.showMessageDialog(null, "Try to guess lower");
  
   

if(ansAslnt< x)
	   JOptionPane.showMessageDialog(null, "Try to guess higher");
if(ansAslnt== x)
	   JOptionPane.showMessageDialog(null, "YOU WON GREAT JOB");
       
}
}
