package gui;

import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fenetre extends JFrame {

	public Fenetre() {
		
		//Les boutons de la page d'accueil
		JButton info = new JButton("Entrez vos informations");
		JButton aide = new JButton("Aide ?");
		JButton aideInfo = new JButton("Comment entrer ses informations ?");
		
		this.setTitle("FindYourWave");
		//this.setSize(500, 500);
		
		//get local graphics environment
		GraphicsEnvironment graphicsEnvironment=GraphicsEnvironment.getLocalGraphicsEnvironment();
		         
		//get maximum window bounds
		Rectangle maximumWindowBounds=graphicsEnvironment.getMaximumWindowBounds();
		
		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();
		
		System.out.println(h + " " + l);
		
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
		this.getContentPane().add(aideInfo);
		
		
		aideInfo.setBounds((l/2)-150, h/3, 300, 30);
		info.setBounds((l/2)-100, h/2, 200 , 30);
		aide.setBounds((l/2)-50,2*h/3,100,30);
		/*
		gbc.gridx = 0;
		gbc.gridy = 0;		
	    gbc.fill = GridBagConstraints.VERTICAL;
	    */

		aideInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chaine = "";
				String fichier = "image/aideInfo";{
				//lecture du fichier texte	
				try{
					InputStream ips=new FileInputStream(fichier); 
					InputStreamReader ipsr=new InputStreamReader(ips);
					BufferedReader br=new BufferedReader(ipsr);
					String ligne;
					while ((ligne=br.readLine())!=null){
						if (ligne.contains("nom :"))
						{
							String[] st = ligne.split(ligne, ':');
							System.out.println("Nom = "+st[1]);
						}
						chaine+=ligne+"\n";
					}
					br.close(); 
				}		
				catch (Exception e){
					System.out.println(e.toString());
				}
				}
				//Boîte du message d'information
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, chaine, "Information", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dialog d = new Dialog(null, "Aide aux infos", true);
				DialogInfo Info = d.showDialog();
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, Info.toString(), "Aide aux infos", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		this.setVisible(true);
	}
}