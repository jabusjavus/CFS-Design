package gui;
/*
 * @author JJR Kotze (email 15692183@sun.ac.za)
 * For Department of Civil Engineering, Stellenbosch University
 * 29 October 2012 (Version 1.0 of CFS design)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSectionButtonListener implements ActionListener{	
	protected DSMBENDING dsmb;
	public AddSectionButtonListener(DSMBENDING dsmb){
		this.dsmb = dsmb;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Add Section")){
			new AddSectionTypeFrame("Section Type",dsmb);
		}
		
	}

}
