package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FenetreBis {

	JFrame cadre;
	JLabel cap = new JLabel();
	

	public static Dialog dialog;
	public static DialogDec dialogDec;
	public static boolean coordonnees;
	
	public static boolean whatCo() {
		return coordonnees;
	}

	public static DialogInfo getInf() {
		return dialog.getInfo();
	}

	public void changementPan(JPanel panneau) {
		panneau.setSize(cadre.getSize());
		cadre.setContentPane(panneau);
	}

	public void reset(JPanel panneau) {
		cadre.revalidate();
		cadre.add(new Panneau(), new FenetreBis(panneau));
	}

	/*
	public void gestionBouton(JButton retour, JButton info, JButton aideInfo, JFrame cadre, int h, int l) {
		cadre.getContentPane().add(info);
		cadre.getContentPane().add(aideInfo);
		aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
		info.setBounds((l / 2) - 100, h / 2, 200, 30);
	}
	*/
	
	public String remplirLabCap(double [] cap) {
		String s = "<html>";
		for (int i = 0; i<cap.length-1; i++) {
			s += String.valueOf(cap[i]) + "<br>";
		}
		s += String.valueOf(cap[cap.length-1]) + "</html>";
		return s;
	}

	public FenetreBis(JPanel panneau) {

		// get local graphics environment
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// get maximum window bounds
		Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();
		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();

		JPanel acceuil = new Panneau();
		JPanel bretagne = new PanneauBretagne();
		
		
		//Le panel qui affiche les caps
		JPanel pan = new JPanel();
		//pan.setLayout(new FlowLayout());
		pan.setBorder(BorderFactory.createLineBorder(Color.black));
		pan.setBorder(BorderFactory.createTitledBorder("Caps à suivre"));
		
		
		//Le panel qui donne le choix a l'utilisateur pour rentrer ses coordonnes
		JPanel choix = new JPanel();
		choix.setLayout(new GridLayout(2,2));
		
		
		// Les boutons de la page d'accueil
		JButton info = new JButton("Entrez vos informations");
		JButton aideInfo = new JButton("Comment entrer ses informations ?");
		JButton retour = new JButton("Retour");
		
		//Les boutons de panel choix
		JButton dec = new JButton("Coordonnées décimales");
		JButton geo = new JButton("Coordonnées deg°min'sec''ptC");

		cadre = new javax.swing.JFrame("FindYourWave");

		// cadre.setSize(500, 500);

		cadre.pack();
		JFrame.setDefaultLookAndFeelDecorated(true);
		cadre.setExtendedState(Frame.MAXIMIZED_BOTH);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadre.setContentPane(panneau);
		cadre.setLocationRelativeTo(null);
		cadre.setLayout(null);

		/*
		 * Le gridBagConstraints va définir la position et la taille des éléments
		 * GridBagConstraints gbc = new GridBagConstraints();
		 */
		
		
		

		cadre.getContentPane().add(info);
		cadre.getContentPane().add(aideInfo);

		aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
		info.setBounds((l / 2) - 100, h / 2, 200, 30);
		/*
		 * gbc.gridx = 0; gbc.gridy = 0; gbc.fill = GridBagConstraints.VERTICAL;
		 */

		aideInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chaine = "";
				String fichier = "image/aideInfo";
				{
					// lecture du fichier texte
					try {
						InputStream ips = new FileInputStream(fichier);
						InputStreamReader ipsr = new InputStreamReader(ips);
						BufferedReader br = new BufferedReader(ipsr);
						String ligne;
						while ((ligne = br.readLine()) != null) {
							if (ligne.contains("nom :")) {
								String[] st = ligne.split(ligne, ':');
								System.out.println("Nom = " + st[1]);
							}
							chaine += ligne + "\n";
						}
						br.close();
					} catch (Exception e) {
						System.out.println(e.toString());
					}
				}
				// Boîte du message d'information
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, chaine, "Aide aux infos", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//cadre.revalidate();
				choix.setVisible(true);
				aideInfo.setVisible(false);
				info.setVisible(false);
				choix.setBounds((l/2) - 300, h/4 , 600, 200);
				choix.setBorder(BorderFactory.createTitledBorder("Choisissez votre choix de coordonnées"));
				choix.add(dec);
				choix.add(geo);
				choix.add(retour);
				cadre.getContentPane().add(choix);
				retour.setBounds(10, 10, 70, 30);
				dec.setBounds(30, 100, 250, 40);
				geo.setBounds(330, 100, 250, 40);
				cadre.revalidate();
				cadre.repaint();
				//choix.repaint();
			}
		});
		
		geo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dialog d = new Dialog(null, "Informations", true);
				if (d.showDialog()) {
					coordonnees = true;
					dialog = d;
					cadre.revalidate();
					changementPan(bretagne);
					cadre.getContentPane().add(retour);
					cadre.getContentPane().add(pan);
					retour.setBounds(10, 10, 80, 23);
					
					// Positionner le Panel, ou autre objet qui servira à donner les caps, en
					// fonction de la position du bateau
					cap.setText("<html>Ligne1<br>Ligne2<br>Ligne3<br>Ligne4<br>Ligne5<br>Ligne6<br>Ligne7<br>Ligne7</html>");
					pan.add(cap);
					pan.setBounds(l - 250, h - 350, 200, 400);
					//pan.revalidate();
				    //pan.repaint();
	
					//On remplira le label par le tableau retournant les caps à suivre
					//avec String s = remplirLabCap(Traitement.nomDeLaFonction);
					//cap.setLocation((int)pan.getLocation().getX()-10, (int)pan.getLocation().getY()-10);
					cap.setBounds(5,5,100,300);
					System.out.println(cap.getBorder());
					
				}
			}
		});
		
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DialogDec d = new DialogDec(null, "Informations", true);
				if (d.showDialog()) {
					coordonnees = false;
					dialogDec = d;
					cadre.revalidate();
					changementPan(bretagne);
					cadre.getContentPane().add(retour);
					cadre.getContentPane().add(pan);
					retour.setBounds(10, 10, 80, 23);
					
					// Positionner le Panel, ou autre objet qui servira à donner les caps, en
					// fonction de la position du bateau
					cap.setText("<html>Ligne1<br>Ligne2<br>Ligne3<br>Ligne4<br>Ligne5<br>Ligne6<br>Ligne7<br>Ligne7</html>");
					pan.add(cap);
					pan.setBounds(l - 250, h - 350, 200, 400);
					//pan.revalidate();
				    //pan.repaint();
	
					//On remplira le label par le tableau retournant les caps à suivre
					//avec String s = remplirLabCap(Traitement.nomDeLaFonction);
					//cap.setLocation((int)pan.getLocation().getX()-10, (int)pan.getLocation().getY()-10);
					cap.setBounds(5,5,100,300);
					System.out.println(cap.getBorder());
					
					
				}
			}
		});

		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadre.setContentPane(acceuil);
				aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
				info.setBounds((l / 2) - 100, h / 2, 200, 30);
				cadre.getContentPane().add(info);
				cadre.getContentPane().add(aideInfo);
				choix.setVisible(false);
				info.setVisible(true);
				aideInfo.setVisible(true);
				cadre.repaint();
				cadre.revalidate();
			}
		});
		

		cadre.setVisible(true);
	}
}
