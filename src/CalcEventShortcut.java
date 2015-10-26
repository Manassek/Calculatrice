package calculatrice.Controller;

import javax.swing.*;
import java.awt.event.*;

public class CalcEventShortcut extends KeyAdapter {
	private JFrame frame;
	private JTextArea afficheur;
	private String textToShow;

	public CalcEventShortcut(JFrame _frame,JTextArea jta){
		frame=_frame;
		afficheur=jta;
	}

	public void keyTyped(KeyEvent e) {
		Affichage affManagement = new Affichage();
		if((e.getKeyChar()+"").equals("c") || (e.getKeyChar()+"").equals("C")){
			afficheur.setText(affManagement.clearText(afficheur.getText()));
		}
		else{ 
			if((e.getKeyChar()+"").equals("=") || (e.getKeyChar()+"").equals("\n")){
				afficheur.setText(affManagement.compute(afficheur.getText()));
			}
			else{
				if("1234567890+-*/.".contains(e.getKeyChar()+"")){
					afficheur.setText(affManagement.addText(afficheur.getText(),e.getKeyChar()+"",false));
				}
			}
		}		
	}

}