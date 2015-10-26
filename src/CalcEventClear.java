package calculatrice.Controller;

import javax.swing.*;
import java.awt.event.*;

public class CalcEventClear implements ActionListener{
	private JTextArea afficheur;

	public CalcEventClear(JTextArea aff){
		afficheur=aff;
	}

	public void actionPerformed(ActionEvent e){
		Affichage affManagement = new Affichage();
		afficheur.setText(affManagement.clearText(afficheur.getText()));
		afficheur.requestFocus();
	}
}