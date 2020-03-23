package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogDec extends JDialog {

	public DialogInfo Info = new DialogInfo();
	private boolean sendData;
	private JLabel latitudeLabel, longitudeLabel, vitesseLabel, tailleLabel;
	private JTextField latitude, longitude, vitesse, taille;
	private boolean ok = false;

	public DialogDec(JFrame parent, String title, boolean modal) {
		super(parent, title, modal);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		// this.setLayout(new GridLayout(3, 3));
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.initComponent();
	}

	public boolean showDialog() {
		this.sendData = false;
		this.setVisible(true);
		return ok;
	}

	private void initComponent() {

		// La latitude
		JPanel panLat = new JPanel();
		panLat.setBackground(Color.white);
		panLat.setPreferredSize(new Dimension(250, 100));
		latitude = new JTextField();
		latitude.setPreferredSize(new Dimension(70, 25));
		panLat.setBorder(BorderFactory.createTitledBorder("Latitude"));
		latitudeLabel = new JLabel("Saisir votre latitude :");
		panLat.add(latitudeLabel);
		panLat.add(latitude);

		// La longitude
		JPanel panLong = new JPanel();
		panLong.setBackground(Color.white);
		panLong.setPreferredSize(new Dimension(250, 100));
		longitude = new JTextField();
		longitude.setPreferredSize(new Dimension(70, 25));
		panLong.setBorder(BorderFactory.createTitledBorder("Longitude"));
		longitudeLabel = new JLabel("Saisir votre longitude :");
		panLong.add(longitudeLabel);
		panLong.add(longitude);

		// La vitesse
		JPanel panVitesse = new JPanel();
		panVitesse.setBackground(Color.white);
		panVitesse.setPreferredSize(new Dimension(250, 100));
		vitesse = new JTextField();
		vitesse.setPreferredSize(new Dimension(70, 25));
		panVitesse.setBorder(BorderFactory.createTitledBorder("Vitesse"));
		vitesseLabel = new JLabel("Saisir votre vitesse :");
		panVitesse.add(vitesseLabel);
		panVitesse.add(vitesse);

		// La taille
		JPanel panTaille = new JPanel();
		panTaille.setBackground(Color.white);
		panTaille.setPreferredSize(new Dimension(250, 100));
		taille = new JTextField();
		taille.setPreferredSize(new Dimension(70, 25));
		panTaille.setBorder(BorderFactory.createTitledBorder("Taille"));
		tailleLabel = new JLabel("Saisir la taille de votre bâteau :");
		panTaille.add(tailleLabel);
		panTaille.add(taille);

		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(panLat);
		content.add(panLong);
		content.add(panTaille);
		content.add(panVitesse);

		JPanel control = new JPanel();
		JButton okBouton = new JButton("OK");

		okBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setInfo(new DialogInfo(taille.getText(), vitesse.getText(), latitude.getText(), longitude.getText()));
				ok = getInfo().infosOK();
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, getInfo().toString(), "Vos informations", JOptionPane.INFORMATION_MESSAGE);
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

	public boolean isOk() {
		return ok;
	}

	public DialogInfo getInfo() {
		return Info;
	}

	public void setInfo(DialogInfo info) {
		Info = info;
	}

}