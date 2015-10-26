package calculatrice.Controller;

import javax.swing.*;
import java.awt.event.*;
import calculatrice.View.CalculatriceSimple;

public class CalcEventRes implements ActionListener{
	private JTextArea afficheur;
	private Affichage affManagement;

	public CalcEventRes(JFrame fen){
		afficheur=((CalculatriceSimple)fen).getAfficheur();
		affManagement=((CalculatriceSimple)fen).getAfficheurManager();
	}

	public void actionPerformed(ActionEvent e){
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