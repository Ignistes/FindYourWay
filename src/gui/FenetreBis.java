package gui;

import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FenetreBis {

	JFrame cadre;

	public void creerPanneau(JPanel panneau) {
		panneau.setSize(cadre.getSize());
		cadre.setContentPane(panneau);
	}

	public void reset(JPanel panneau) {
		cadre.revalidate();
		cadre.add(new Panneau(), new FenetreBis(panneau));
	}

	public void gestionBouton(JButton retour, JButton info, JButton aideInfo, JFrame cadre, int h, int l) {
		cadre.getContentPane().add(info);
		cadre.getContentPane().add(aideInfo);
		aideInfo.setBounds((l / 2) - 150, h / 3, 300, 30);
		info.setBounds((l / 2) - 100, h / 2, 200, 30);

	}

	public FenetreBis(JPanel panneau) {

		JPanel acceuil = new Panneau();

		// Les boutons de la page d'accueil
		JButton info = new JButton("Entrez vos informations");
		JButton aideInfo = new JButton("Comment entrer ses informations ?");
		JButton retour = new JButton("Retour");

		cadre = new javax.swing.JFrame("TIPE : Alexandre, Pierre et Louis");

		// cadre.setSize(500, 500);

		// get local graphics environment
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

		// get maximum window bounds
		Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();

		System.out.println(h + " " + l);

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
				Dialog d = new Dialog(null, "Informations", true);
				if (d.showDialog()) {
					cadre.revalidate();
					creerPanneau(new PanneauBretagne());
					cadre.getContentPane().add(retour);
					retour.setBounds(10, 10, 90, 30);
				}
				// JOptionPane jop = new JOptionPane();
				// if (!d.isAnnul()) {
				// jop.showMessageDialog(null, Info.toString(), "Aide aux infos",
				// JOptionPane.INFORMATION_MESSAGE);
				// }
			}
		});

		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadre.revalidate();
				creerPanneau(acceuil);
				gestionBouton(retour, info, aideInfo, cadre, h, l);
			}
		});

		cadre.setVisible(true);
	}
}
