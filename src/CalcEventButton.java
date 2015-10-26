package calculatrice.Controller;

import javax.swing.*;
import java.awt.event.*;

public class CalcEventButton implements ActionListener{
	private JTextArea afficheur;
	private JButton source;

	public CalcEventButton(JButton but,JTextArea aff){
		afficheur=aff;
		source=but;
	}
	

	public void actionPerformed(ActionEvent e){
		Affichage affManagement = new Affichage();
		String ope;
		if(e.getActionCommand()!="^x")
			ope=source.getText();
		else
			ope="^";
		afficheur.setText(affManagement.addText(afficheur.getText(),ope,false));
		afficheur.requestFocus();
	}
}