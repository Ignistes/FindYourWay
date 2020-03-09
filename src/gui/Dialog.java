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
	private JLabel latitudeLabel, longitudeLabel, tailleLabel, poidsLabel;
	private JTextField poids, taille, longitude, latitude;

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
		JPanel panPoids = new JPanel();
		panPoids.setBackground(Color.white);
		panPoids.setPreferredSize(new Dimension(300, 100));
		poids = new JTextField();
		poids.setPreferredSize(new Dimension(100, 25));
		panPoids.setBorder(BorderFactory.createTitledBorder("Poids"));
		poidsLabel = new JLabel("Saisir le poids de votre bâteau :");
		panPoids.add(poidsLabel);
		panPoids.add(poids);

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
		content.add(panPoids);

		JPanel control = new JPanel();
		JButton okBouton = new JButton("OK");

		okBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Info = new DialogInfo(taille.getText(), poids.getText(), longitude.getText(), latitude.getText());
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