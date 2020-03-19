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

public class Dialog extends JDialog {
	private DialogInfo Info = new DialogInfo();
	private boolean sendData;
	private JLabel degreLaLabel, minuteLaLabel, secondeLaLabel, copoLaLabel, degreLoLabel, minuteLoLabel,
			secondeLoLabel, copoLoLabel, vitesseLabel, tailleLabel;
	private JTextField vitesse, taille, degreLa, minuteLa, secondeLa, degreLo, minuteLo, secondeLo, copoLa, copoLo;
	private boolean ok = false;

	public Dialog(JFrame parent, String title, boolean modal) {
		super(parent, title, modal);
		this.setSize(700, 400);
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
		panLat.setLayout(new GridLayout(4, 1));
		panLat.setBackground(Color.white);
		panLat.setPreferredSize(new Dimension(300, 200));
		degreLa = new JTextField();
		minuteLa = new JTextField();
		secondeLa = new JTextField();
		copoLa = new JTextField();
		degreLa.setPreferredSize(new Dimension(30, 10));
		minuteLa.setPreferredSize(new Dimension(30, 10));
		secondeLa.setPreferredSize(new Dimension(30, 10));
		copoLa.setPreferredSize(new Dimension(30, 10));
		panLat.setBorder(BorderFactory.createTitledBorder("Latitude"));
		degreLaLabel = new JLabel("degré :");
		panLat.add(degreLaLabel);
		panLat.add(degreLa);
		minuteLaLabel = new JLabel("minute :");
		panLat.add(minuteLaLabel);
		panLat.add(minuteLa);
		secondeLaLabel = new JLabel("seconde :");
		panLat.add(secondeLaLabel);
		panLat.add(secondeLa);
		copoLaLabel = new JLabel("pt.cardinal :");
		panLat.add(copoLaLabel);
		panLat.add(copoLa);

		// La longitude
		JPanel panLong = new JPanel();
		panLong.setLayout(new GridLayout(4, 1));
		panLong.setBackground(Color.white);
		panLong.setPreferredSize(new Dimension(300, 200));
		degreLo = new JTextField();
		minuteLo = new JTextField();
		secondeLo = new JTextField();
		copoLo = new JTextField();
		degreLo.setPreferredSize(new Dimension(30, 15));
		minuteLo.setPreferredSize(new Dimension(30, 15));
		secondeLo.setPreferredSize(new Dimension(30, 15));
		copoLo.setPreferredSize(new Dimension(30, 15));
		panLong.setBorder(BorderFactory.createTitledBorder("Longitude"));
		degreLoLabel = new JLabel("degré :");
		panLong.add(degreLoLabel);
		panLong.add(degreLo);
		minuteLoLabel = new JLabel("minute :");
		panLong.add(minuteLoLabel);
		panLong.add(minuteLo);
		secondeLoLabel = new JLabel("seconde :");
		panLong.add(secondeLoLabel);
		panLong.add(secondeLo);
		copoLoLabel = new JLabel("pt.cardinal :");
		panLong.add(copoLoLabel);
		panLong.add(copoLo);

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
				Info = new DialogInfo(taille.getText(), vitesse.getText(), degreLa.getText(), minuteLa.getText(),
						secondeLa.getText(), copoLa.getText(), degreLo.getText(), minuteLo.getText(),
						secondeLo.getText(), copoLo.getText());
				ok = Info.infosOK();
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null, Info.toString(), "Vos informations", JOptionPane.INFORMATION_MESSAGE);
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

	public DialogInfo getDInfo() {
		return Info;
	}

}