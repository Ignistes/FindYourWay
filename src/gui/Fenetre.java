package gui;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fenetre extends JFrame {

	public Fenetre() {
		
		//Les boutons de la page d'accueil
		JButton info = new JButton("Entrez vos informations");
		JButton aide = new JButton("Aide ?");
		JButton aideInfo = new JButton("Comment entrer ses informations ?");
		
		this.setTitle("Ma JFrame");
		this.pack();
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new Panneau());
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		/*
		Le gridBagConstraints va définir la position et la taille des éléments 
		GridBagConstraints gbc = new GridBagConstraints();
		*/

		this.getContentPane().add(info);
		this.getContentPane().add(aide);
		
		
		aide.setBounds(130, 95, 100, 30);
		info.setBounds(600, 300, 200 , 30);
		/*
		gbc.gridx = 0;
		gbc.gridy = 0;		
	    gbc.fill = GridBagConstraints.VERTICAL;
	    */

		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dialog d = new Dialog(null, "Informations", true);
				DialogInfo Info = d.showDialog();
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, Info.toString(), "Informations", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.setVisible(true);
	}
}