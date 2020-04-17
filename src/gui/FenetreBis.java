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
import java.nio.charset.Charset;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import traitement.Traitement;
import utils.Point;

public class FenetreBis {

	static JFrame cadre;
	
	//JLabel cap = new JLabel();
	
	public static Dialog dialog;
	public static DialogDec dialogDec;
	public static boolean coordonnees;
	
	
	public static JFrame fenetrePr() {
		return cadre;
	}
	
	public static boolean whatCo() {
		return coordonnees;
	}

	public static DialogInfo getInf() {
		return dialog.getInfo();
	}

	public void gestionBouton(JButton info, JButton aideInfo, JFrame cadre, int h, int l) {
		cadre.getContentPane().add(info);
		cadre.getContentPane().add(aideInfo);
		aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
		info.setBounds((l / 2) - 100, h / 2, 200, 30);
	}

	public static String remplirLabCap(double [][] cap , Point [][] coord, int j) {		
		String s = "<html>";
		for (int i = 0; i<499; i++) {
			s += "Cap :" + "<br>" + String.valueOf(cap[i][j]) + "<br>" + "Point géographique :" + "<br>" + String.valueOf(coord[i][j].abcisse) + "<br>" +  String.valueOf(coord[i][j].ordonnee) + "<br>" + "<br>" ;
		}
		s += "Cap :" + "<br>" + String.valueOf(cap[499][j])+ "<br>" + "Point géographique :" + "<br>" + String.valueOf(coord[499][j].abcisse) + "<br>" +  String.valueOf(coord[499][j].ordonnee) + "</html>";
		return s;
	}
	
	public static double[] testScroll() {
		double [] test = new double[100];
		for (int i = 0; i<100; i++) {
			test[i] = Math.random();
		}
		return test;
	}

	public FenetreBis(JPanel panneau) {
		

		// get local graphics environment
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// get maximum window bounds
		Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();
		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();

		JPanel bretagne = new PanneauBretagne();
		
		
		String c = "Caps à suivre";
		String cFinal = new String(c.getBytes(),Charset.forName("UTF-8"));
		String cd = "Coordonnées décimales"; 
		String cdFinal = new String(cd.getBytes(),Charset.forName("UTF-8"));
		String cg = "Coordonnées deg°min'sec''ptC"; 
		String cgFinal = new String(cg.getBytes(),Charset.forName("UTF-8"));
		String choice = "Choisissez votre type de coordonnées"; 
		String choiceFinal = new String(choice.getBytes(),Charset.forName("UTF-8"));
		
		
		//Le panel qui affiche les caps
		
		
		//Caps pan = new Caps();
		
		
		//pan.setLayout(new FlowLayout());
		//pan.setBorder(BorderFactory.createLineBorder(Color.black));
		//pan.setBorder(BorderFactory.createTitledBorder(cFinal));
		
		
		//Le panel qui donne le choix a l'utilisateur pour rentrer ses coordonnes
		JPanel choix = new JPanel();
		choix.setLayout(new GridLayout(2,2));
		
		
		// Les boutons de la page d'accueil
		JButton info = new JButton("Entrez vos informations");
		JButton aideInfo = new JButton("Comment entrer ses informations ?");
		JButton retour = new JButton("Retour");
		
		aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
		info.setBounds((l / 2) - 100, h / 2, 200, 30);
		
		
		//Les boutons de panel choix
		JButton dec = new JButton(cdFinal);
		JButton geo = new JButton(cgFinal);

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
		
		//scroll = new JScrollPane(cap);
		//scroll.setBounds(5, 5, 190, 390);
		

		cadre.getContentPane().add(info);
		cadre.getContentPane().add(aideInfo);
		
		//pan.add(scroll);

		//aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
		//info.setBounds((l / 2) - 100, h / 2, 200, 30);
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
				String text = new String(chaine.getBytes(),Charset.forName("UTF-8"));
				// Boîte du message d'information
				JOptionPane jop1 = new JOptionPane();
				jop1.showMessageDialog(null, text, "Aide aux infos", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//cadre.revalidate();
				choix.setVisible(true);
				aideInfo.setVisible(false);
				info.setVisible(false);
				choix.setBounds((l/2) - 300, h/4 , 600, 200);
				choix.setBorder(BorderFactory.createTitledBorder(choiceFinal));
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
					//pan.setBounds(l - 250, 200, 200, 400);
					//JPanel log = new logiciel();
					
					/*
					
					JScrollPane scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(l - 200, 250, 200, 300);
					
				
					cadre.getContentPane().add(scroll);
					*/
					cadre.setContentPane(bretagne);
					
					cadre.getContentPane().add(retour);
					//cadre.getContentPane().add(log);
					retour.setBounds(10, 10, 80, 23);
					
					cadre.repaint();
					cadre.revalidate();
					
					
					
					//On remplira le label par le tableau retournant les caps à suivre
					//cap.setText(remplirLabCap(Traitement.tabCapLePortLePlusRapide()));
					//cap.setText(remplirLabCap(testScroll()));
					//cap.setText("<html>Ligne1<br>Ligne2<br>Ligne3<br>Ligne4<br>Ligne5<br>Ligne6<br>Ligne7<br>Ligne7</html>");
					//cadre.add(scroll);
					//scroll.setViewportView(cap);
					//pan.add(cap);
					
					// Positionner le Panel, ou autre objet qui servira à donner les caps, en
					// fonction de la position du bateau
					
	
					//cap.setLocation((int)pan.getLocation().getX()-10, (int)pan.getLocation().getY()-10);
					//cap.setBounds(5,5,100,300);		
				}
			}
		});
		
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DialogDec d = new DialogDec(null, "Informations", true);
				if (d.showDialog()) {
					coordonnees = false;
					dialogDec = d;
					//pan.setBounds(l - 250, 200, 200, 400);
					JPanel log = new logiciel();
				
					/*
					JScrollPane scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(l - 230, 250, 200, 300);
					
										
					cadre.getContentPane().add(scroll);
					*/
					
					cadre.setContentPane(bretagne);
					cadre.getContentPane().add(log);
					
					cadre.add(retour);
					//cadre.getContentPane().add(pan);
					retour.setBounds(10, 10, 80, 23);
					
					cadre.repaint();
					cadre.revalidate();
					
					
										
					//On remplira le label par le tableau retournant les caps à suivre
					//cap.setText(remplirLabCap(Traitement.tabCapLePortLePlusRapide()));
					//cap.setText("<html>Ligne1<br>Ligne2<br>Ligne3<br>Ligne4<br>Ligne5<br>Ligne6<br>Ligne7<br>Ligne7</html>");
					//cap.setText(remplirLabCap(testScroll()));
					//pan.add(scroll);
					//scroll.setViewportView(cap);
					//pan.add(cap);
					
					// Positionner le Panel, ou autre objet qui servira à donner les caps, en
					// fonction de la position du bateau
					
	
					//cap.setLocation((int)pan.getLocation().getX()-10, (int)pan.getLocation().getY()-10);
					//cap.setBounds(5,5,100,300);					
				}
			}
		});

		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
				info.setBounds((l / 2) - 100, h / 2, 200, 30);
				cadre.setContentPane(panneau);
				cadre.setLocationRelativeTo(null);
				cadre.setLayout(null);
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
