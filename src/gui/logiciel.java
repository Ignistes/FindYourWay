package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import traitement.Traitement;

public class logiciel extends JPanel {

	
	JButton port1;
	JButton port2;
	JButton port3;
	JButton port4;
	JScrollPane scroll = new JScrollPane();
	Caps pan;
	Boolean clicked = false;
	
	public void paintComponent(Graphics g) {
		
		port1 = new JButton();
		port2 = new JButton();
		port3 = new JButton();
		port4 = new JButton();
		
		
		port1.setBackground(Color.green);
		port2.setBackground(Color.green);
		port3.setBackground(Color.green);
		port4.setBackground(Color.green);
		
		add(port1);
		add(port2);
		add(port3);
		add(port4);
		
		port1.setBounds((int)Traitement.tabPointsB()[0].ordonnee - 5,(int)Traitement.tabPointsB()[0].abcisse - 5, 10, 10);
		port2.setBounds((int)Traitement.tabPointsB()[1].ordonnee - 5,(int)Traitement.tabPointsB()[1].abcisse - 5, 10, 10);
		port3.setBounds((int)Traitement.tabPointsB()[2].ordonnee - 5,(int)Traitement.tabPointsB()[2].abcisse - 5, 10, 10);
		port4.setBounds((int)Traitement.tabPointsB()[3].ordonnee - 5,(int)Traitement.tabPointsB()[3].abcisse - 5, 10, 10);
		
		
		port1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clicked = true;
				if (clicked == true) {
					remove(scroll);
					remove(pan);
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),0);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				} else {
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),0);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
			}
		});
		
		port2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clicked = true;
				if (clicked == true) {
					remove(scroll);
					remove(pan);
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),1);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				} else {
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),1);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				
			}
		});
		
		port3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clicked = true;
				if (clicked == true) {
					remove(scroll);
					remove(pan);
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),2);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				} else {
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),2);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				
			}
		});
		
		port4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clicked = true;
				if (clicked == true) {
					remove(scroll);
					remove(pan);
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),3);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				} else {
					pan = new Caps(Traitement.tabCapQuatrePorts(),Traitement.pointInter(),3);
					scroll = new JScrollPane(pan);
					scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
					scroll.setBounds(1000, 250, 200, 300);	
					scroll.setBorder(BorderFactory.createLineBorder(Color.black));
					//scroll.setVisible(true);
					add(scroll);
					repaint();
					revalidate();
				}
				clicked = false;
				
				//infos = new JLabel("guut");
				//infos.setBounds(100, 200, 100, 100);
				//infos.setText("<html>Infos bateau !<br>taille du port</html>");
				//add(infos);
				
			}
		});
		
	}

}
