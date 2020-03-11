package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dialog extends JDialog {
	private DialogInfo Info = new DialogInfo();
	private boolean sendData;
	private JLabel latitudeLabel, longitudeLabel, tailleLabel, vitesseLabel;
	private JTextField vitesse, taille, longitude, latitude;

	public Dialog(JFrame parent, String title, boolean modal) {
		super(parent, title, modal);
		this.setSize(700, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.initComponent();
	}

	public DialogInfo showDialog() {
		this.sendData = false;
		this.setVisible(true);
		return this.Info;
	}
	
	
	private void initComponent() {

		// La latitude
		JPanel panLat = new JPanel();
		panLat.setBackground(Color.white);
		panLat.setPreferredSize(new Dimension(300, 100));
		latitude = new JTextField();
		latitude.setPreferredSize(new Dimension(100, 25));
		panLat.setBorder(BorderFactory.createTitledBorder("Latitude"));
		latitudeLabel = new JLabel("Saisir votre latitude :");
		panLat.add(latitudeLabel);
		panLat.add(latitude);

		// La longitude
		JPanel panLong = new JPanel();
		panLong.setBackground(Color.white);
		panLong.setPreferredSize(new Dimension(300, 100));
		longitude = new JTextField();
		longitude.setPreferredSize(new Dimension(100, 25));
		panLong.setBorder(BorderFactory.createTitledBorder("Longitude"));
		longitudeLabel = new JLabel("Saisir votre longitude :");
		panLong.add(longitudeLabel);
		panLong.add(longitude);

		// Le poids
		JPanel panVitesse = new JPanel();
		panVitesse.setBackground(Color.white);
		panVitesse.setPreferredSize(new Dimension(300, 100));
		vitesse = new JTextField();
		vitesse.setPreferredSize(new Dimension(100, 25));
		panVitesse.setBorder(BorderFactory.createTitledBorder("Vitesse"));
		vitesseLabel = new JLabel("Saisir votre vitesse :");
		panVitesse.add(vitesseLabel);
		panVitesse.add(vitesse);

		// La taille
		JPanel panTaille = new JPanel();
		panTaille.setBackground(Color.white);
		panTaille.setPreferredSize(new Dimension(300, 100));
		taille = new JTextField();
		taille.setPreferredSize(new Dimension(100, 25));
		panTaille.setBorder(BorderFactory.createTitledBorder("Taille"));
		tailleLabel = new JLabel("Saisir la taille de votre bâteau :");
		panTaille.add(tailleLabel);
		panTaille.add(taille);

		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(panLong);
		content.add(panLat);
		content.add(panTaille);
		content.add(panVitesse);

		JPanel control = new JPanel();
		JButton okBouton = new JButton("OK");

		okBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Info = new DialogInfo(taille.getText(), vitesse.getText(), longitude.getText(), latitude.getText());
				setVisible(false);
			}
		});

		JButton cancelBouton = new JButton("Annuler");
		cancelBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});

		control.add(okBouton);
		control.add(cancelBouton);

		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);
	}
}