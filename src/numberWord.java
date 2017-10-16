import javax.swing.JOptionPane;

public class numberWord {

	public static void main(String[] args){
 String doggos = JOptionPane.showInputDialog("Random Word?");
	String number = JOptionPane.showInputDialog("Random number");
 int num = Integer.parseInt(number);
		for(int i = 0;i < num;i++){
		System.out.println(doggos);
	
	}
}
}