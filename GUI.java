/*Author: Doug Sperlak
 * Assignment: 10
 * 
 * This program calculates the carbon footprint of various objects based on real world statistics and displays them in a GUI interface
 */

package hw9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GUI extends JFrame{
	private JPanel contentPane;
	private JTextField fName;
	private JTextArea output;
	String firstName;

	public GUI() {																			// create contents of panel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 480);														// Set window size
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Please Enter your first name");
		name.setBounds(48, 38, 300, 14);
		contentPane.add(name);																// Create prompt at location
			
		fName = new JTextField();															// text fields for first name
		fName.setBounds(48, 65, 200, 20);
		contentPane.add(fName);																// Create input textbox at location
		fName.setColumns(10);
		
		JButton btnDisplay = new JButton("Display");										// Display button
		SwingAction action = new SwingAction();
		btnDisplay.setAction(action);
		btnDisplay.setBounds(48, 90, 169, 38);
		contentPane.add(btnDisplay);														// Create the display button at specified location
		
		output = new JTextArea();															// display area
		output.setBounds(50, 135, 750, 300);
		contentPane.add(output);															// Create output display area
		output.setColumns(10);
	}
	
private class SwingAction extends AbstractAction {
	public SwingAction() {
		putValue(NAME, "Display CO2 Data");	
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {											// Action to perform on button push
		String f_Name = fName.getText();
		String display = "Hello " + f_Name;
		
		Building skyscraper = new Building();												// create building object
		Car mazdaMiata = new Car();															// create car object
		Bicycle schwinn = new Bicycle();													// create bicycle object
		ArrayList<CarbonFootprint> p = new ArrayList<CarbonFootprint>();					// generate array of objects
		
		p.add(skyscraper);																	// add building
		p.add(mazdaMiata);																	// add car
		p.add(schwinn);																		// add bicycle
		String msg = null;
		String msg2 = null;
		String msg3 = null;
		
		for(int i = 0; i < p.size(); i++) {													// loop through ArrayList and print carbon footprint values based on object values
			if (p.get(i) instanceof Building) {
				msg = "This object is a building." + "\n" + p.get(i) + "\n" + p.get(i).getCarbonFootprint();
			}
			else if (p.get(i) instanceof Car) {
				msg2 = "This object is a car." + "\n" + p.get(i) + "\n" + p.get(i).getCarbonFootprint();
			}
			else {
				msg3 = "This object is a bicycle." + "\n" + p.get(i) + "\n" + p.get(i).getCarbonFootprint();
			}
		}
		
		display = display + "\n\n" + msg + "\n\n" + msg2 + "\n\n" + msg3;					// build full output display
		
		output.setText(display);															// Output to the display

		
	}
}

}
