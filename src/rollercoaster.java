import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
String height=JOptionPane.showInputDialog(null, "how tall are you");
int heightnumber=Integer.parseInt(height);
if (heightnumber < 48){
JOptionPane.showMessageDialog(null, "you need to grow more first");

}
else {
	JOptionPane.showMessageDialog(null, "get on and stop growing ;)");
}
}
}
