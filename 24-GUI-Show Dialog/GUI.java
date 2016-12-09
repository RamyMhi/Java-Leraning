import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=JOptionPane.showInputDialog("Enter number");
		String s2=JOptionPane.showInputDialog("Enter number");
		
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		int sum= num1+num2;
		
		JOptionPane.showMessageDialog(null, "Sum is: "+sum,"sum of 2 number",JOptionPane.PLAIN_MESSAGE);

	}

}
