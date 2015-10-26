package calculatrice.Controller;

import javax.swing.*;
import java.awt.event.*;
import calculatrice.Model.ModeleCalcul;

public class CalcEventRes implements ActionListener{
	private JTextArea afficheur;

	public CalcEventRes(JTextArea aff){
		afficheur=aff;
	}

	public void actionPerformed(ActionEvent e){
		Affichage affManagement = new Affichage();
		if(e.getActionCommand().equals("="))
			afficheur.setText(affManagement.compute(afficheur.getText()));
		else{
			if(!affManagement.compute(afficheur.getText()).equals("")){
				afficheur.setText(affManagement.addText(afficheur.getText(),e.getActionCommand(),true));
				afficheur.setText(affManagement.compute(afficheur.getText()));
			}
		}
		afficheur.requestFocus();
	}
}