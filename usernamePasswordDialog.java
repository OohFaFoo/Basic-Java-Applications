package test;
import javax.swing.JOptionPane;


public class usernamePasswordDialog {
	public static void main(String args[]) {

		// 2 strings for the dialog boxes
		String Username = JOptionPane.showInputDialog(null, "Username");
		String Password = JOptionPane.showInputDialog(null, "Password");
			
			if (Username != null && Password != null && ((Username.equals("Hayden") && Password.equals("Awesome")) || (Username.equals("Perry") && Password.equals("Poop"))))
			{ 	// Message box that appears when username & password are correct
				JOptionPane.showMessageDialog(null, "Welcome!");
			} else {
				// Message box that appears when username/password is incorrect
				JOptionPane.showMessageDialog(null, "Incorrect username/password!");
			}
		
	}
}