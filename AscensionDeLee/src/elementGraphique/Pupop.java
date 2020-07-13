package elementGraphique;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Pupop extends Frame{
	

	    public static void infoBox(String infoMessage, String titleBar)
	    {
	    
	        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	    }
	    
	    public static void Message(String message)
	    {
	    	JOptionPane.showMessageDialog(null, message);
	    }

}
