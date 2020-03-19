package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import utils.Breizh;
import utils.Point;

public class PanneauBretagne extends JPanel {
	public void paintComponent(Graphics g) {

		// get local graphics environment
		GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

		// get maximum window bounds
		Rectangle maximumWindowBounds = graphicsEnvironment.getMaximumWindowBounds();

		int h = (int) maximumWindowBounds.getHeight();
		int l = (int) maximumWindowBounds.getWidth();

		Breizh bretagne = new Breizh(h, l);

		g.drawPolyline(bretagne.getPointsX(), bretagne.getPointsY(), bretagne.getPointsX().length);

		Point ship = Point.GpsToBreizh(h, l, new Point(FenetreBis.dialog.Info.getInfos()[1], FenetreBis.dialog.Info.getInfos()[0]));
		System.out.println("lat : " + FenetreBis.dialog.Info.getInfos()[1]);
		System.out.println("long : " + FenetreBis.dialog.Info.getInfos()[0]);
		System.out.println("x : " + ship.abcisse);
		System.out.println("y : " + ship.ordonnee);

		try {
			Image bateau = ImageIO.read(new File("image/pointer.png"));
			g.drawImage(bateau, (int) ship.ordonnee-5, (int) ship.abcisse-15, 15, 30, this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
